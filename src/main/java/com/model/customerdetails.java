package com.model;

public class customerdetails {
    int customerid;
    String customerName;
    int accountNo;

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerid() {
        return customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNo() {
        return accountNo;
    }
}
