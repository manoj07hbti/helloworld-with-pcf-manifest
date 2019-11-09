package com.Controller;

import com.Service.service;
import com.model.customerdetails;
import com.model.doctor;
import com.model.employee;
import com.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    service obj;
    @Autowired
    service objservice;


    //creating a end point
    @RequestMapping("/Hello")
    //creating a method
    //Access Specifier ReturnType mthodName (inpunt parameter){}
    public String hello() {
        //Creating a object
        // ClassName objname=new CalssName();
        //  service obj=new service();

        //Declaring a variable
        // VariableType variable_Name;
        String message = "";

        //calling a method
        // objname.methodname
        // assigning a value
        // variable name = call method
        message = obj.helloservice();
        return message;

    }

    @RequestMapping("/add")
    //access specifier returntype methodname( perameter){}
    public int add() {
        //service obj=new service();
        int add = obj.add();
        return add;
    }

    @RequestMapping("/employee")
    public employee getEmployee() {
        employee obj = new employee();
        service objservice = new service();
        obj = objservice.getEmployee();

        return obj;

    }

    @RequestMapping("/student")
    public student getstudent() {
        student sobj = new student();
        service objservice = new service();
        sobj = objservice.getstudent();
        return sobj;

    }

    @RequestMapping("/doctor")
    public doctor getdoctor() {
        doctor dobj = new doctor();
        //service objservice=new service();
        dobj = objservice.getdoctor();
        return dobj;

    }
    @RequestMapping("/detail")
    public customerdetails getdetail(){
        customerdetails obj=new customerdetails();
        service objservice=new service();
        obj=objservice.gedetail();
        return obj;

    }

}





