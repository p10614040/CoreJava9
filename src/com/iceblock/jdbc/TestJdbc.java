/**
 * @Title TestJdbc.java
 * @Package com.corejava9.chapter.jdbc
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年8月14日 下午5:29:33
 * @copyright USTCINFO
 */
package com.iceblock.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author YanLiang
 *
 */
public class TestJdbc {

    /**
     * @author yan.liang
     * @throws ClassNotFoundException
     * @throws SQLException
     * @date 2015年8月14日 下午5:29:33
     * @Description JDBC测试
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
		 * 加载驱动类
		 * 方式1：Class.forName("com.mysql.jdbc.Driver");
		 * 方式2：System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
		 * 方式3：DriverManager.registerDriver(new com.mysql.jdbc.Driver()); - 这个方法对具体的类有依赖
		 * 方式4：自动加载。高版本的Oracle和MySql也不用写，因为采用了最新的SPI技术，驱动的类名在jar包的META-INF/services/java.sql.Driver文件里
		 * */
        // Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sampledb";
        String user = "root";
        String password = "123456";
		/*
		 * 打印日志
		 */
        PrintWriter printWriter = new PrintWriter(System.out);
        DriverManager.setLogWriter(printWriter);
		/*返回Connection对象*/
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2) + resultSet.getString("Gender"));
        }

        // statement.executeUpdate("INSERT INTO STUDENT VALUES(2, '李四', '男', null, null)");

        // 获取数据库的一些属性
        System.out.println(connection.getMetaData().getMaxConnections());

        // 是否支持更新结果集
        System.out.println("TYPE_SCROLL_SENSITIVE：" + connection.getMetaData().supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
        System.out.println("TYPE_SCROLL_INSENSITIVE：" + connection.getMetaData().supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
        System.out.println("ResultSet.CONCUR_UPDATABLE:" + connection.getMetaData().supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE));

        // 默认是true
        System.out.println("connection.getAutoCommit() = " + connection.getAutoCommit());
        //设置成false后需要手动提交
        connection.setAutoCommit(false);
        // 可更新的结果集
        Statement statementSensitive = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet2 = statementSensitive.executeQuery("SELECT * FROM STUDENT");
        while (resultSet2.next()) {
            System.out.println(resultSet2.getString(2) + resultSet2.getString("Gender"));
            resultSet2.updateString("Gender", "女");
            resultSet2.updateRow();
        }
        connection.commit();
    }

}
