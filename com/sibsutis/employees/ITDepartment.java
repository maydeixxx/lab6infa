package com.sibsutis.employees;

public class ITDepartment extends Department {
    int id;

    public ITDepartment(int id) {
        super(id);
    }

    @Override
    String getDepartmentName() {
        String depName = "ITDepartment";
        return depName;
    }
}
