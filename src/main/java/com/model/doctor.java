package com.model;

public class doctor {
    int DoctorAge;
    int Doctoridnumber;
    String DoctorName;

    public void setDoctorAge(int doctorAge) {
        DoctorAge = doctorAge;
    }

    public void setDoctoridnumber(int doctoridnumber) {
        Doctoridnumber = doctoridnumber;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public int getDoctorAge() {
        return DoctorAge;
    }

    public int getDoctoridnumber() {
        return Doctoridnumber;
    }

    public String getDoctorName() {
        return DoctorName;
    }
}
