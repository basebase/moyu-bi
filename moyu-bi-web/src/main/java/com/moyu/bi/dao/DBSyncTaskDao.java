package com.moyu.bi.dao;

import com.moyu.bi.domain.synctask.DBSyncTask;
import com.moyu.bi.web.configuration.DevRepository;

/**
 * Created by Joker on 18/1/16.
 */
@DevRepository
public interface DBSyncTaskDao {
    void saveTask(DBSyncTask dbSyncTask);
}
