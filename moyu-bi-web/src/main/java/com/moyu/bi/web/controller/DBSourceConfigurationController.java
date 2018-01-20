package com.moyu.bi.web.controller;

import com.moyu.bi.common.dbconfig.DBConfigurationUtils;
import com.moyu.bi.domain.dbconfig.DBConfiguration;
import com.moyu.bi.domain.dbconfig.DataSourceShow;
import com.moyu.bi.domain.view.ResponseResult;
import com.moyu.bi.service.DBSourceConfigurationService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Joker on 18/1/12.
 * 添加数据源配置
 */
@RestController
@RequestMapping("/api")
public class DBSourceConfigurationController {

    private static final Logger LOGGER = Logger.getLogger(DBSourceConfigurationController.class);

    @Resource
    private DBSourceConfigurationService dbSourceConfigurationService;

    @RequestMapping("/testConnection")
    public ResponseResult<String> testConnection(@RequestBody DBConfiguration dbConfiguration) {
        boolean testConnectionStatus = false;
        try {
            testConnectionStatus = DBConfigurationUtils.testConnection(dbConfiguration.getJdbcUrl(), dbConfiguration.getDbName(), dbConfiguration.getDbPassword());
            return ResponseResult.successReturn("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("连接失败, 请检查参数!");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("连接失败, 请检查参数!");
        }
    }

    @RequestMapping("/addSourceConfig")
    public ResponseResult<String> addSourceConfig(@RequestBody DBConfiguration dbConfiguration) {
        try {
            dbSourceConfigurationService.addSourceConfig(dbConfiguration);
            return ResponseResult.successReturn("添加成功");
        } catch (Exception e) {
            throw new RuntimeException("添加数据源失败, " + e.getMessage());
        }
    }

    @RequestMapping("/getSourceConfig")
    public ResponseResult<List<DataSourceShow>> getSourceConfig() {
        try {
            List<DataSourceShow> result = dbSourceConfigurationService.getSourceConfig();
            return ResponseResult.successReturn(result, result.size());
        } catch (Exception e) {
            throw new RuntimeException("数据源展示失败, " + e.getMessage());
        }
    }

    @RequestMapping("/delSourceConfig")
    public ResponseResult<String> delSourceConfig(@RequestBody DBConfiguration dbConfiguration) {
        try {
            dbSourceConfigurationService.delSourceConfig(dbConfiguration);
            return ResponseResult.successReturn("配置删除成功.!");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除配置失败.!");
        }
    }
}
