package com.nutshell.ntztool.model;

/**
 * 国际化资源属性文件读取工具类
 *
 * @author poplar
 * @version 11-5-3 上午4:31
 * @since JDK 1.0
 */
public class JdbcInfo {
    private String driver;

    private String url;

    private String username;
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
