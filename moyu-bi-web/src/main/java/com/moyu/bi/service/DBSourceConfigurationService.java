package com.moyu.bi.service;

import com.moyu.bi.domain.dbconfig.DBConfiguration;
import com.moyu.bi.domain.dbconfig.DataSourceShow;

import java.util.List;
import java.util.Map;

/**
 * Created by Joker on 18/1/13.
 */
public interface DBSourceConfigurationService {
    void addSourceConfig(DBConfiguration dbConfiguration);
    List<DataSourceShow> getSourceConfig();
    List<String> findAllSource();
    List<String> showSourceTable(DBConfiguration dbConfiguration);
    Map<String, String> showSourceTableField(DBConfiguration dbConfiguration);
}
