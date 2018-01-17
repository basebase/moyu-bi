package com.moyu.bi.web.controller;

import com.moyu.bi.domain.taskconfiguration.TaskConfiguraitonView;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.TaskConfigurationService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
