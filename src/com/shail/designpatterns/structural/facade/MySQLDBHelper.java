package com.shail.designpatterns.structural.facade;

public class MySQLDBHelper {

  public static DBConnection getDBConnection(){
    return new DBConnection("MySQL",1000);
  }
  
  public void generateMySQLPDFReport(final DBConnection dbConnection,final String tableName){
    System.out.print("generateMySQLPDFReport()");
  }
  
  public void generateMySQLHTMLReport(final DBConnection dbConnection,final String tableName){
    System.out.print("generateMySQLHTMLReport()");
  }
  
  
}
