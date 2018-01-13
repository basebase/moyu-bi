package com.moyu.bi.common.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Joker on 18/1/12.
 */
public class DBConfigurationUtils {

    /**
     * 测试连接
     * @param url
     * @param username
     * @param password
     * @return
     */
    public static boolean testConnection(String url, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection(url, username, password);
        if (conn == null)
            return false;
        return true;
    }
}
