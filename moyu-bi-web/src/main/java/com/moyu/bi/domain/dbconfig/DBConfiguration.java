package com.moyu.bi.domain.dbconfig;

/**
 * Created by Joker on 18/1/12.
 */
public class DBConfiguration {
    private String dataSourceName;
    private String dataSourceDesc;
    private String jdbcUrl;
    private String dbName;
    private String dbPassword;
    private String option;

    private String table;

    private String[] configIds;

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceDesc() {
        return dataSourceDesc;
    }

    public void setDataSourceDesc(String dataSourceDesc) {
        this.dataSourceDesc = dataSourceDesc;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String[] getConfigIds() {
        return configIds;
    }

    public void setConfigIds(String[] configIds) {
        this.configIds = configIds;
    }
}
