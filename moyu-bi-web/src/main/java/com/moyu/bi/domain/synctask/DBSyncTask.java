package com.moyu.bi.domain.synctask;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Joker on 18/1/16.
 */
public class DBSyncTask implements Serializable {

    // 任务名称
    private String taskName;
    // 数据源
    private String source;
    // 数据源表
    private String sourceTable;
    // 目标源
    private String targetSource;
    // 目标源表
    private String targetSourceTable;
    // 导入前的语句
    private String importBeforeData;
    // 导入后的语句
    private String importAfterData;
    // 是否覆盖数据
    private Integer overwrite;

    // 字段映射
    private String fieldMapper;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public String getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(String targetSource) {
        this.targetSource = targetSource;
    }

    public String getTargetSourceTable() {
        return targetSourceTable;
    }

    public void setTargetSourceTable(String targetSourceTable) {
        this.targetSourceTable = targetSourceTable;
    }

    public String getImportBeforeData() {
        return importBeforeData;
    }

    public void setImportBeforeData(String importBeforeData) {
        this.importBeforeData = importBeforeData;
    }

    public String getImportAfterData() {
        return importAfterData;
    }

    public void setImportAfterData(String importAfterData) {
        this.importAfterData = importAfterData;
    }

    public Integer getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Integer overwrite) {
        this.overwrite = overwrite;
    }

    public String getFieldMapper() {
        return fieldMapper;
    }

    public void setFieldMapper(String fieldMapper) {
        this.fieldMapper = fieldMapper;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


}
