package com.moyu.bi.service.impl;

import com.moyu.bi.dao.DBSourceConfigurationDao;
import com.moyu.bi.domain.dbconfig.DBConfiguration;
import com.moyu.bi.service.DBSourceConfigurationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    public List<DBConfiguration> getSourceConfig() {
        List<DBConfiguration> result = dbSourceConfigurationDao.getSourceConfig();
        return result;
    }
}
