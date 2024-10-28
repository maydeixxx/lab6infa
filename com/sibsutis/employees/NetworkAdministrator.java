package com.sibsutis.employees;
import java.util.List;
import com.sibsutis.devices.Device;

public class NetworkAdministrator extends Employee {
    
    public NetworkAdministrator(int id, String fullName, Department department) {
        super(id, fullName, department);
    }

    public NetworkAdministrator(int id, String fullName, Department department, String phone) {
        super(id, fullName, department, phone);
    }

    public NetworkAdministrator(int id, String fullName, Department department, String phone, List<Device> devices) {
        super(id, fullName, department, phone, devices);
    }

    public NetworkAdministrator(int id, String fullName, Department department, List<Device> devices) {
        super(id, fullName, department, devices);
    }

    @Override
    public String getPosition() {
        String pos = "NetworkAdministrator";
        return pos;
    }

}
