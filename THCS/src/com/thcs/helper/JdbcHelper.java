package com.thcs.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class JdbcHelper {
    
    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
 private static String dburl="jdbc:sqlserver://localhost\\AdminPC\\sqlexpress:1433;databaseName=DuAn";
 private static String username="sa";
 private static String password="songlong";
 static{
     try {
         Class.forName(driver);
     } catch (Exception e) {
         throw new RuntimeException(e);
     }
 }
 public static PreparedStatement preparedStatement(String sql,Object...args) throws SQLException{
     Connection connection=DriverManager.getConnection(dburl,username,password);
     PreparedStatement pstmt=null;
     if(sql.trim().startsWith("{")){
         pstmt=connection.prepareCall(sql);
     }
     else{
         pstmt=connection.prepareStatement(sql);
     }
     for(int i=0;i<args.length;i++){
         pstmt.setObject(i+1,args[i]);
     }
     return pstmt;
 }
 public static void executeUpdate(String sql,Object...args){
     try {
         PreparedStatement stmt=preparedStatement(sql, args);
         try {
             stmt.executeUpdate();
         } finally {
             stmt.getConnection().close();
         }
     } catch (Exception e) {
         throw new RuntimeException(e);
     }
 }
 public static ResultSet executeQuery(String sql,Object...args){
     try {
         PreparedStatement stmt=preparedStatement(sql, args);
         return stmt.executeQuery();
     } catch (Exception e) {
         throw new RuntimeException(e);
     }
 }}
