package com.shail.designpatterns.structural.facade;

import java.io.File;
import java.sql.Connection;

import com.shail.designpatterns.structural.facade.IDBHelper.DBTYPE;
import com.shail.designpatterns.structural.facade.IDBHelper.REPORT_TYPE;

public class OracleDBHelper  {

  public static DBConnection getDBConnection(){
    return new DBConnection("Oracle",1000);
  }
  
  public void generateOraclePDFReport(final DBConnection dbConnection,final String tableName){
    System.out.print("generateOraclePDFReport()");
  }
  
  public void generateOracleHTMLReport(final DBConnection dbConnection,final String tableName){
    System.out.print("generateOracleHTMLReport()");
  }

}
