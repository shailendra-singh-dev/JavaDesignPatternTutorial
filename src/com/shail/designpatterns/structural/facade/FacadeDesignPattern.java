package com.shail.designpatterns.structural.facade;

import java.util.Scanner;

import com.shail.designpatterns.structural.facade.IDBHelper.DBTYPE;
import com.shail.designpatterns.structural.facade.IDBHelper.REPORT_TYPE;

public class FacadeDesignPattern {

  public static void testFacadeDesignPattern(String[] args) {
    FacadeHelper facadeHelper = new FacadeHelper();

    Scanner scanner = new Scanner(System.in);
    int dbTypeInput = scanner.nextInt();
    int reportTypeInput = scanner.nextInt();

    DBTYPE[] dbTypes = DBTYPE.values();
    REPORT_TYPE[] reportTypes = REPORT_TYPE.values();

    final String tableName = "Employee";
    final DBTYPE dbType = dbTypes[dbTypeInput];
    final REPORT_TYPE reportType = reportTypes[reportTypeInput];

    facadeHelper.generateReport(dbType, reportType, tableName);
  }

}
