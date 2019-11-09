package com.Service;

import com.Database.Database;
import com.model.customerdetails;
import com.model.doctor;
import com.model.employee;
import com.model.student;
import org.springframework.beans.factory.annotation.Autowired;

public class service {
    @Autowired
    Database obj;

    public String helloservice(){


       // Database obj=new Database();
        String message;
      message=obj.hello();
        return message;

    }
    public int add(){
        Database obj=new Database();
        int addfromdb= obj.addFromDb();
        return addfromdb;
    }
    public employee getEmployee(){
        employee empobj;
        Database obj=new Database();
        empobj=obj.getEmployee();
        return empobj;

    }
    public student getstudent(){
        student stdobj;
        Database OBJ=new Database();
       stdobj= OBJ.getstudent();
        return stdobj;
    }
public doctor getdoctor(){
        doctor docobj;
        Database obj=new Database();
       docobj  =obj.getdoctor();
       return docobj;
}
public customerdetails gedetail(){
    customerdetails detailobj;

    Database obj=new Database();
    detailobj=obj.getdetails();
    return detailobj;
}

}
