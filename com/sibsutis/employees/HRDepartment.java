package com.sibsutis.employees;

public class HRDepartment extends Department {
    int id;

    public HRDepartment(int id) {
        super(id);
    }

    @Override
    String getDepartmentName() {
        String depName = "HRDepartment";
        return depName;
    }
}
