package com.sibsutis.employees;

public abstract class Department {
    int id;

    public Department(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    } 
    
    abstract String getDepartmentName();

}