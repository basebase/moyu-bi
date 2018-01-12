package bi.web.controller;

import com.moyu.bi.common.dbconfig.DBConfigurationUtils;
import com.moyu.model.dbconfig.DBConfiguration;
import com.moyu.model.view.ResponseResult;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by Joker on 18/1/12.
 * 添加数据源配置
 */
@RestController
@RequestMapping("/api")
public class DBSourceConfigurationController {

    private static final Logger LOGGER = Logger.getLogger(DBSourceConfigurationController.class);

    @RequestMapping("/testConnection")
    public ResponseResult<String> testConnection(@RequestBody DBConfiguration dbConfiguration) {
        boolean testConnectionStatus = false;
        try {

            testConnectionStatus = DBConfigurationUtils.testConnection(dbConfiguration.getJdbcUrl(), dbConfiguration.getDbName(), dbConfiguration.getDbPassword());
            return ResponseResult.successReturn("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//            return ResponseResult.errorReturn(500, "连接失败, 请检查参数!");
            throw new RuntimeException("连接失败, 请检查参数!");
        } catch (SQLException e) {
            e.printStackTrace();
//            return ResponseResult.errorReturn(500, "连接失败, 请检查参数!");
            throw new RuntimeException("连接失败, 请检查参数!");
        }

    }
}
