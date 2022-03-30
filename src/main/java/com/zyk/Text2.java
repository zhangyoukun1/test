package com.zyk;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
public class Text2 {
    static{
        Connection  con  =  null;
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String  url  =  "jdbc:mysql://localhost:3306/wj?serverTimezone=GMT";
            String  user  =  "root";
            String  pass  =  "1614325697zyk";
            con  =  DriverManager.getConnection(url,  user,  pass);
        }
        catch  (ClassNotFoundException  e)  {
            e.printStackTrace();
        }
        catch  (SQLException  e)  {
            e.printStackTrace();
        }
        DatabaseMetaData dbMetaData = null;
        try {
            dbMetaData = con.getMetaData();
            System.out.println(dbMetaData.getDriverName());
            System.out.println(dbMetaData.getURL());
            System.out.println(dbMetaData.getUserName());
            System.out.println("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try{
            ResultSet rs = dbMetaData.getTables(null, null, null, new String[] { "TABLE" });
            int i = 0;
            while (rs.next()) {
                System.out.println("表名：" + rs.getString("TABLE_NAME"));
                System.out.println("表类型：" + rs.getString("TABLE_TYPE"));
                System.out.println("表所属数据库：" + rs.getString("TABLE_CAT"));
                System.out.println("表备注：" + rs.getString("REMARKS"));

            }
        }catch (SQLException  e){
            e.printStackTrace();
        }


    }




}
