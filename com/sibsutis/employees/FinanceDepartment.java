package com.sibsutis.employees;

public class FinanceDepartment extends Department {

    public FinanceDepartment(int id) {
        super(id);
    }

    int id;
   

    @Override
    String getDepartmentName() {
        String depName = "FinanceDepartment";
        return depName;
    }
}

