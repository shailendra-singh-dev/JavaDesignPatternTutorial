package com.shail.designpatterns.structural.facade;

import java.io.File;

public interface IDBHelper {

  public abstract DBConnection establishConnection(final DBTYPE dbType);

  public abstract File generateReport(final DBTYPE dbType, final REPORT_TYPE reportType,
      final String tableName);

  public enum DBTYPE {
    ORACLE("oracle"), MYSQL("mysql");

    private String mDBName;

    DBTYPE(final String dbName) {
      mDBName = dbName;
    }

    public String getDBName() {
      return mDBName;
    }
  }

  public enum REPORT_TYPE {
    PDF("pdf"), HTML("xml");

    private String mReportType;

    REPORT_TYPE(final String reportName) {
      mReportType = reportName;
    }

    public String getReportType() {
      return mReportType;
    }
  }

}
