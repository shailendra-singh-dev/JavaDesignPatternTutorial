package com.shail.designpatterns.structural.facade;

public class DBConnection {

  private String mConnecionType;
  
  private int mConnectionTimeOut;

  public String getConnecionType() {
    return mConnecionType;
  }

  public DBConnection(String mConnecionType, int mConnectionTimeOut) {
    this.mConnecionType = mConnecionType;
    this.mConnectionTimeOut = mConnectionTimeOut;
  }

  public void setConnecionType(String mConnecionType) {
    this.mConnecionType = mConnecionType;
  }

  public int getConnectionTimeOut() {
    return mConnectionTimeOut;
  }

  public void setConnectionTimeOut(int mConnectionTimeOut) {
    this.mConnectionTimeOut = mConnectionTimeOut;
  }
  
  
  
}
