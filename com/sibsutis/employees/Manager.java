package com.sibsutis.employees;
import com.sibsutis.devices.Device;
import java.util.List;

public class Manager extends Employee {

    public Manager(int id, String fullName, Department department) {
        super(id, fullName, department);
    }

    public Manager(int id, String fullName, Department department, String phone) {
        super(id, fullName, department, phone);
    }

    public Manager(int id, String fullName, Department department, String phone, List<Device> devices) {
        super(id, fullName, department, phone, devices);
    }

    public Manager(int id, String fullName, Department department, List<Device> devices) {
        super(id, fullName, department, devices);
    }

    @Override
    public String getPosition() {
        String pos = "Manager";
        return pos;
    }
}
