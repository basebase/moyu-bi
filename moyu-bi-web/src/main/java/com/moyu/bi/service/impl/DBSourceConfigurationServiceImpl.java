package com.moyu.bi.service.impl;

import com.moyu.bi.common.dbconfig.DBConfigurationUtils;
import com.moyu.bi.dao.DBSourceConfigurationDao;
import com.moyu.bi.domain.dbconfig.DBConfiguration;
import com.moyu.bi.domain.dbconfig.DataSourceShow;
import com.moyu.bi.service.DBSourceConfigurationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Joker on 18/1/13.
 */
@Service
public class DBSourceConfigurationServiceImpl implements DBSourceConfigurationService {

    @Resource
    private DBSourceConfigurationDao dbSourceConfigurationDao;

    @Override
    public void addSourceConfig(DBConfiguration dbConfiguration) {
        dbSourceConfigurationDao.addSourceConfig(dbConfiguration);
    }

    @Override
    public List<DataSourceShow> getSourceConfig() {
        List<DataSourceShow> result = dbSourceConfigurationDao.getSourceConfig();
        return result;
    }

    @Override
    public List<String> findAllSource() {
        List<String> res = dbSourceConfigurationDao.findAllSource();
        return res;
    }

    @Override
    public List<String> showSourceTable(DBConfiguration dbConfiguration) {
        // 查询出数据源信息
        List<DBConfiguration> dbConfigurationList = dbSourceConfigurationDao.showSourceTable(dbConfiguration);
        try {
            DBConfiguration config = dbConfigurationList != null ? dbConfigurationList.get(0) : null;
            if (config == null)
                return null;

            List<String> tables = DBConfigurationUtils.getTables(config.getJdbcUrl(), config.getDbName(), config.getDbPassword());
            return tables;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, String> showSourceTableField(DBConfiguration dbConfiguration) {
        // 查询出数据源信息
        List<DBConfiguration> dbConfigurationList = dbSourceConfigurationDao.showSourceTable(dbConfiguration);
        try {
            DBConfiguration config = dbConfigurationList != null ? dbConfigurationList.get(0) : null;
            if (config == null)
                return null;

            Map<String, String> tableFields = DBConfigurationUtils.getTableFields(config.getJdbcUrl(), config.getDbName(), config.getDbPassword(), dbConfiguration.getTable());
            return tableFields;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delSourceConfig(DBConfiguration dbConfiguration) {
        dbSourceConfigurationDao.delSourceConfig(dbConfiguration);
    }
}
