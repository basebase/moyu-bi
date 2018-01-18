package com.moyu.bi.web.controller;

import com.moyu.bi.domain.synctask.DBSyncTask;
import com.moyu.bi.domain.taskconfiguration.Task;
import com.moyu.bi.domain.taskconfiguration.TaskConfiguraitonView;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.DBSyncTaskService;
import com.moyu.bi.service.TaskConfigurationService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Joker on 18/1/16.
 */
@RestController
@RequestMapping("/api")
public class TaskConfigurationController {

    private static final Logger LOGGER = Logger.getLogger(DBSourceConfigurationController.class);

    @Resource
    private TaskConfigurationService taskConfigurationService;

    @Resource
    private DBSyncTaskService dbSyncTaskService;

    @RequestMapping("/getTaskConfiguration")
    public ResponseResult<List<TaskConfiguraitonView>> getTaskConfiguration() {
        try {
            List<TaskConfiguraitonView> taskConfiguraitonViewList = taskConfigurationService.getTaskConfiguration();
            return ResponseResult.successReturn(taskConfiguraitonViewList, taskConfiguraitonViewList.size());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取任务配置失败, 请联系管理员.!");
        }
    }

    @RequestMapping("/showTaskConfiguration")
    public ResponseResult<DBSyncTask> showTaskConfiguration(@RequestBody Task task) {
        try {
            DBSyncTask dbSyncTask = dbSyncTaskService.findTaskConfigurationById(task);
            return ResponseResult.successReturn(dbSyncTask);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取配置失败, 请联系管理员.!");
        }
    }


    @RequestMapping("/deleteTaskConfiguration")
    public ResponseResult<Boolean> deleteTaskConfiguration(@RequestBody Task task) {
        try {
            dbSyncTaskService.deleteTaskConfiguration(task);
            return ResponseResult.successReturn(Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除配置失败, 请联系管理员.!");
        }
    }

    @RequestMapping("/editTaskConfiguration")
    public ResponseResult<Boolean> editTaskConfiguration(@RequestBody DBSyncTask dbSyncTask) {
        try {
            dbSyncTaskService.updateTaskConfiguration(dbSyncTask);
            return ResponseResult.successReturn(Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新配置失败, 请联系管理员.!");
        }
    }


}
