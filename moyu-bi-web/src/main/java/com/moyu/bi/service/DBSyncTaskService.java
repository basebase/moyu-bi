package com.moyu.bi.service;

import com.moyu.bi.domain.synctask.DBSyncTask;

/**
 * Created by Joker on 18/1/16.
 */
public interface DBSyncTaskService {
    void saveTask(DBSyncTask dbSyncTask);
}
