package org.yfyang.osy.record.sql.impl;

import org.yfyang.osy.record.common.Constants;
import org.yfyang.osy.record.model.MybatisSqlModal;
import org.yfyang.osy.record.model.SqlModal;
import org.yfyang.osy.record.model.TableInfo;
import org.yfyang.osy.record.sql.CreateSqlFace;

/**
 * Mysql实现创建脚本类.
 * <br/>
 *
 * @author poplar_mumu
 * @version 1.0 18/08/2011 1:31 下午
 * @since JDK 1.0
 */
public class MysqlCreateSql extends CreateSql implements CreateSqlFace {

    private MysqlCreateSql() {
    }

    /**
     * 内部类，用来产生内部单例
     */
    private static class Inner {
        private static CreateSqlFace _mysql = new MysqlCreateSql();
    }

    /**
     * 获取创建Mysql脚本的单例对象
     * @return 创建Mysql脚本的单例对象
     */
    public static CreateSqlFace getInstance() {
        return Inner._mysql;
    }

    public SqlModal createSql(TableInfo tableInfo) {
        SqlModal sql = new SqlModal();
        String tableName = tableInfo.getTableName().toUpperCase();
        MybatisSqlModal mybatisSqlModal = gengerateSql(tableInfo);
        sql.setInsertSql(generateInsertSql(mybatisSqlModal, tableName));
        sql.setDeleteSql(generateDeleteSql(mybatisSqlModal, tableName));
        sql.setSelectAllSql(pageSelectSql(mybatisSqlModal, tableName));
        sql.setSelectSql(generateSelectOneSql(mybatisSqlModal, tableName));
        sql.setUpdateSql(generateUpdateSql(mybatisSqlModal, tableName));
        sql.setCountQuerySql(generateCountSql(mybatisSqlModal, tableName));
        sql.setPageWhereSql(pageParamSql());
        return sql;
    }

    @Override
    protected String pageParamSql() {
        return "LIMIT #{start},#{end}";
    }

    @Override
    protected String pageSelectSql(MybatisSqlModal mybatisSqlModal, String tableName) {
        StringBuilder selectAllSql = new StringBuilder();
        selectAllSql.append(Constants.SELECT_KEY)
                .append(Constants.WRAP_CHAR)
                .append(mybatisSqlModal.getSelectColumn())
                .append(Constants.WRAP_CHAR)
                .append(Constants.BLANK_SIGN)
                .append(Constants.FROM_KEY)
                .append(tableName);
        return selectAllSql.toString();
    }

    //todo
    @Override
    protected String getInsertPrimaryKey() {
        return null;
    }
}
