/*
 * Copyright (c) 2010-2011 NutShell.
 * [Id:ColumnInfo.java  11-6-8 上午1:02 poplar.mumu ]
 */
package org.yfyang.osy.record.model;

/**
 * 表格字段的具体信息.
 * <br/>
 *
 * @author poplar_mumu
 * @version 1.0 11-6-8 上午1:02
 * @since JDK 1.0
 */
public class ColumnInfo {
	/**
	 * 表名
	 */
	private String tableName;
	/**
	 * 字段名
	 */
	private String columnName;
    private boolean nullAble;
    private String dataType;
    private String columnType;
    private String columnKey;
    private String columnComment;
    /**
     * 是否为主键
     */
    private boolean pri;
    /**
     * 是否外健
     */
    private boolean fok;

    public boolean isFok() {
        return fok;
    }

    public void setFok(boolean fok) {
        this.fok = fok;
    }

    public boolean isPri() {
        return pri;
    }

    public void setPri(boolean pri) {
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "表:" + tableName + ":{" +
                "字段描述='" + columnComment + '\'' +
                ", 字段键值类型='" + columnKey + '\'' +
                ", 字段类型='" + columnType + '\'' +
                ", 数据类型='" + dataType + '\'' +
                ", 是否可以为空=" + nullAble +
                ", 字段名称='" + columnName + '\'' +
                '}';
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public boolean isNullAble() {
        return nullAble;
    }

    public void setNullAble(boolean nullAble) {
        this.nullAble = nullAble;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }
}
