package com.shail.designpatterns.structural.facade;

import java.io.File;

public class FacadeHelper implements IDBHelper {

  @Override
  public DBConnection establishConnection(DBTYPE dbType) {
    switch (dbType) {
      case MYSQL:
        return MySQLDBHelper.getDBConnection();
      case ORACLE:
        return OracleDBHelper.getDBConnection();

      default:
        break;
    }
    return null;
  }


  @Override
  public File generateReport(DBTYPE dbType, REPORT_TYPE reportType, String tableName) {
    switch (dbType) {
      case MYSQL:
        final DBConnection dbConnection = establishConnection(dbType);
        final MySQLDBHelper mySQLDBHelper = new MySQLDBHelper();

        switch (reportType) {
          case PDF:
            mySQLDBHelper.generateMySQLPDFReport(dbConnection, tableName);
            break;

          case HTML:
            mySQLDBHelper.generateMySQLHTMLReport(dbConnection, tableName);
            break;

          default:
            break;
        }
        break;

      case ORACLE:
        final DBConnection dbConnection1 = establishConnection(dbType);
        final OracleDBHelper oracleDBHelper = new OracleDBHelper();

        switch (reportType) {
          case PDF:
            oracleDBHelper.generateOraclePDFReport(dbConnection1, tableName);
            break;

          case HTML:
            oracleDBHelper.generateOracleHTMLReport(dbConnection1, tableName);
            break;

          default:
            break;
        }
        break;
        
      default:
        break;
    }
    return null;
  }
}
