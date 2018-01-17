package com.moyu.bi.service.impl;

import com.moyu.bi.dao.DBSyncTaskDao;
import com.moyu.bi.domain.synctask.DBSyncTask;
import com.moyu.bi.domain.taskconfiguration.Task;
import com.moyu.bi.service.DBSyncTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Joker on 18/1/16.
 */
@Service
public class DBSyncTaskServiceImpl implements DBSyncTaskService {

    @Resource
    private DBSyncTaskDao dbSyncTaskDao;

    @Override
    public void saveTask(DBSyncTask dbSyncTask) {
        dbSyncTaskDao.saveTask(dbSyncTask);
    }

    @Override
    public DBSyncTask findTaskConfigurationById(Task task) {
        DBSyncTask dbSyncTask = dbSyncTaskDao.findTaskConfigurationById(task);
        return dbSyncTask;
    }

    @Override
    public void deleteTaskConfiguration(Task task) {
        dbSyncTaskDao.deleteTaskConfiguration(task);
    }
}
