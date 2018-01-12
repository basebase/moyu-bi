package com.moyu.bi.common.test.dbconfig;

import com.moyu.bi.common.dbconfig.DBConfigurationUtils;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Joker on 18/1/12.
 */
public class DBConfigurationUtilsTest {

    @Test
    public void testConnection() throws SQLException, ClassNotFoundException {
        boolean root = DBConfigurationUtils.testConnection("jdbc:mysql://localhost:3306/test2", "root", "");
        System.out.println(root);
    }
}
