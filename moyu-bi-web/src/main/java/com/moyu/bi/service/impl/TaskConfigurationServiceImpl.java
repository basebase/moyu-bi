package com.moyu.bi.service.impl;

import com.moyu.bi.dao.TaskConfigurationDao;
import com.moyu.bi.domain.taskconfiguration.TaskConfiguraitonView;
import com.moyu.bi.service.TaskConfigurationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Joker on 18/1/16.
 */
@Service
public class TaskConfigurationServiceImpl implements TaskConfigurationService {

    @Resource
    private TaskConfigurationDao taskConfigurationDao;

    @Override
    public List<TaskConfiguraitonView> getTaskConfiguration() {
        List<TaskConfiguraitonView> result = taskConfigurationDao.getTaskConfiguration();
        return result;
    }
}
