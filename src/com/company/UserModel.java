package com.company;

public class UserModel {

    private int code;
    private String name;
    private String fname;
    private int age ;
    private String gender;
    private long cnic;


    // constructor ALways Same As CLass Name
    //alt + insert Short key
    public UserModel(int code, String name, String fname, int age, String gender, long cnic) {
        this.code = code;
        this.name = name;
        this.fname = fname;
        this.age = age;
        this.gender = gender;
        this.cnic = cnic;
    }
//Compalsary data
    public UserModel(String name, String fname , long cnic) {
        this.name = name;
        this.cnic = cnic;
        this.fname= fname;
    }

    public String getFname() {

        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public long getCnic() {
        return cnic;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCnic(long cnic) {
        this.cnic = cnic;
    }
}
