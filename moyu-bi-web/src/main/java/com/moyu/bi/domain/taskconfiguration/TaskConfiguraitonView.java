package com.moyu.bi.domain.taskconfiguration;

/**
 * Created by Joker on 18/1/16.
 */
public class TaskConfiguraitonView {
    private Integer key;
    private String taskName;
    private String taskCreateUser;
    private String taskCreateTime;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskCreateUser() {
        return taskCreateUser;
    }

    public void setTaskCreateUser(String taskCreateUser) {
        this.taskCreateUser = taskCreateUser;
    }

    public String getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(String taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }
}
