package com.moyu.bi.dao;

import com.moyu.bi.domain.taskconfiguration.TaskConfiguraitonView;
import com.moyu.bi.web.configuration.DevRepository;

import java.util.List;

/**
 * Created by Joker on 18/1/16.
 */
@DevRepository
public interface TaskConfigurationDao {
    List<TaskConfiguraitonView> getTaskConfiguration();
}
