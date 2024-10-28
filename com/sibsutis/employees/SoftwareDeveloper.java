package com.sibsutis.employees;
import java.util.List;
import com.sibsutis.devices.Device;

public class SoftwareDeveloper extends Employee {
    
    public SoftwareDeveloper(int id, String fullName, Department department) {
        super(id, fullName, department);
    }

    public SoftwareDeveloper(int id, String fullName, Department department, String phone) {
        super(id, fullName, department, phone);
    }

    public SoftwareDeveloper(int id, String fullName, Department department, String phone, List<Device> devices) {
        super(id, fullName, department, phone, devices);
    }

    public SoftwareDeveloper(int id, String fullName, Department department, List<Device> devices) {
        super(id, fullName, department, devices);
    }

    @Override
    public String getPosition() {
        String pos = "SoftWareDeveloper";
        return pos;
    }
}
