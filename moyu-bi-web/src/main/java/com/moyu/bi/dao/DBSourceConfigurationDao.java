package com.moyu.bi.dao;

import com.moyu.bi.domain.dbconfig.DBConfiguration;
import com.moyu.bi.domain.dbconfig.DataSourceShow;
import com.moyu.bi.web.configuration.DevRepository;

import java.util.List;

/**
 * Created by Joker on 18/1/13.
 */
@DevRepository
public interface DBSourceConfigurationDao {
    void addSourceConfig(DBConfiguration dbConfiguration);
    List<DataSourceShow> getSourceConfig();
    List<String> findAllSource();
    List<DBConfiguration> showSourceTable(DBConfiguration dbConfiguration);
}
