package com.moyu.bi.common.dbconfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<String> getTables(String url, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection(url, username, password);
        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet tables = metaData.getTables(null, "%", "%", new String[]{"TABLE"});
        List<String> tabs = new ArrayList<String>();
        while (tables.next()) {
            String table_name = tables.getString("TABLE_NAME");
            tabs.add(table_name);
        }

        return tabs;
    }
}
