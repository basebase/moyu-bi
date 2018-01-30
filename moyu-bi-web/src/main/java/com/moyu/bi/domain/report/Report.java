package com.moyu.bi.domain.report;


import java.util.Map;

/**
 * Created by Joker on 18/1/29.
 */
public class Report {

    private String tableName;
    private String transverse;
    private String longitudinal;

    private Map<String, Object> transverseWhereMap;

    private Map<String, Object> transverseColumnMap;
    private Map<String, Object> longitudinaMap;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    public Map<String, Object> getTransverseWhereMap() {
        return transverseWhereMap;
    }

    public void setTransverseWhereMap(Map<String, Object> transverseWhereMap) {
        this.transverseWhereMap = transverseWhereMap;
    }

    public Map<String, Object> getTransverseColumnMap() {
        return transverseColumnMap;
    }

    public void setTransverseColumnMap(Map<String, Object> transverseColumnMap) {
        this.transverseColumnMap = transverseColumnMap;
    }

    public Map<String, Object> getLongitudinaMap() {
        return longitudinaMap;
    }

    public void setLongitudinaMap(Map<String, Object> longitudinaMap) {
        this.longitudinaMap = longitudinaMap;
    }
}
