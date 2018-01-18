package com.moyu.bi.service;

import com.moyu.bi.domain.synctask.DBSyncTask;
import com.moyu.bi.domain.taskconfiguration.Task;

/**
 * Created by Joker on 18/1/16.
 */
public interface DBSyncTaskService {
    void saveTask(DBSyncTask dbSyncTask);
    DBSyncTask findTaskConfigurationById(Task id);
    void deleteTaskConfiguration(Task task);
    void updateTaskConfiguration(DBSyncTask dbSyncTask);
}
