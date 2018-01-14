package com.moyu.bi.domain.dbconfig;

/**
 * Created by Joker on 18/1/14.
 */
public class DataSourceShow {
    private String key;
    private String sourceName;
    private String sourceType;
    private String sourceDescribe;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceDescribe() {
        return sourceDescribe;
    }

    public void setSourceDescribe(String sourceDescribe) {
        this.sourceDescribe = sourceDescribe;
    }
}