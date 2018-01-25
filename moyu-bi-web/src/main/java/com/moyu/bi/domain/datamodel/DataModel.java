package com.moyu.bi.domain.datamodel;

/**
 * Created by Joker on 18/1/25.
 */
public class DataModel {
    private String dbName;
    private String tabName;
    private String modelDesc;
    private String modelName;
    private String transverse;
    private String longitudinal;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getTransverse() {
        return transverse;
    }

    public void setTransverse(String transverse) {
        this.transverse = transverse;
    }

    public String getLongitudinal() {
        return longitudinal;
    }

    public void setLongitudinal(String longitudinal) {
        this.longitudinal = longitudinal;
    }
}
