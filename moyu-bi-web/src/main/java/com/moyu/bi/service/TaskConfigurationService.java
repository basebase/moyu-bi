package com.moyu.bi.service;

import com.moyu.bi.domain.taskconfiguration.TaskConfiguraitonView;

import java.util.List;

/**
 * Created by Joker on 18/1/16.
 */
public interface TaskConfigurationService {
    List<TaskConfiguraitonView> getTaskConfiguration();
}
