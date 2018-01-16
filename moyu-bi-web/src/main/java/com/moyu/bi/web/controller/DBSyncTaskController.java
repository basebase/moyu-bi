package com.moyu.bi.web.controller;

import com.moyu.bi.domain.synctask.DBSyncTask;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.DBSyncTaskService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Joker on 18/1/16.
 * 数据同步任务
 */

@RestController
@RequestMapping("/api")
public class DBSyncTaskController {

    private static final Logger LOGGER = Logger.getLogger(DBSourceConfigurationController.class);

    @Resource
    private DBSyncTaskService dbSyncTaskService;

    @RequestMapping("/saveDBSyncConfiguration")
    public ResponseResult<String> saveDBSyncConfiguration(@RequestBody DBSyncTask dbSyncTask) {
        try {
            dbSyncTaskService.saveTask(dbSyncTask);
            return ResponseResult.successReturn("配置保存成功");
        } catch (Exception e) {
            throw new RuntimeException("配置保存失败" + e.getMessage());
        }
    }
}
