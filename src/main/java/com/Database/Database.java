package com.Database;

import com.model.customerdetails;
import com.model.doctor;
import com.model.employee;
import com.model.student;

public class Database {
    private Object employee;

    public String hello(){
        return "hello";
    }
    public int addFromDb(){
        int a= 10;
        int b=10;
        return a+b;
    }
    public employee getEmployee(){

        employee obj=new employee();
        obj.setAge(25);
        obj.setId("XYZ");
        obj.setName("amit");
        obj.setSalary(2500);
        obj.setLastname("kumar");


        return obj;


    }
    public student getstudent(){

        student studentobj=new student();
        studentobj.setStudentAge(15);
        studentobj.setStudentClass(5);
        studentobj.setStudentCollegename("xye");
        studentobj.setStudentName("amit");

        return studentobj;
    }

public doctor getdoctor(){
        doctor doctorobj=new doctor();
        doctorobj.setDoctorAge(48);
        doctorobj.setDoctoridnumber(201242);
        doctorobj.setDoctorName("Dr. ram kumar");

        return doctorobj;

}
public customerdetails getdetails(){
    customerdetails detailobj=new customerdetails();
    detailobj.setAccountNo(20125376);
    detailobj.setCustomerName("neeraj kumar");
    detailobj.setCustomerid(555555);
    return detailobj;
}


}
