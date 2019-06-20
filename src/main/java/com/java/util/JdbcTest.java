package com.java.util;

import java.sql.SQLException;

public class JdbcTest {

    public static void main(String[] args) throws SQLException {
        OracleJdbcTest test = new OracleJdbcTest();
        test.query("select * from T_BRH_INFO", true);
        test.close();
    }
}
