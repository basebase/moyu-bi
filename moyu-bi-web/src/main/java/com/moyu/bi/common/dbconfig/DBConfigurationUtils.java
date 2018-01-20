package com.moyu.bi.common.dbconfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (conn == null) {
            if (conn != null) {
                conn.close();
            }
            return false;
        }

        if (conn != null) {
            conn.close();
        }

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

        if (conn != null) {
            conn.close();
        }

        return tabs;
    }

    public static Map<String, String> getTableFields(String url, String username, String password, String table) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection(url, username, password);
        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet tables = metaData.getTables(null, "%", table, new String[]{"TABLE"});

        if (tables.next()) {
            ResultSet colRet = metaData.getColumns(null,"%", tables.getString("TABLE_NAME"),"%");
            Map<String, String> fieldMap = new HashMap<String, String>();
            while(colRet.next()) {
                fieldMap.put(colRet.getString("COLUMN_NAME"), colRet.getString("TYPE_NAME"));
            }

            if (conn != null) {
                conn.close();
            }

            return fieldMap;
        }



        return null;
    }
}
