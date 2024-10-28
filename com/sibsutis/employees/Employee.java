package com.sibsutis.employees;
import com.sibsutis.Printable;
import com.sibsutis.devices.Device;
import java.util.List;

public abstract class Employee implements Printable {
    int id;
    String fullName;
    String phone;
    public List<Device> devices;
    final Department department;

    public Employee(int id, String fullName, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
    }

    public Employee(int id, String fullName, Department department, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.phone = phone;
    }

    public Employee(int id, String fullName, Department department, List<Device> devices) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.devices = devices;
    }

    public Employee(int id, String fullName, Department department, String phone, List<Device> devices) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.phone = phone;
        this.devices = devices;
    }

    abstract String getPosition();

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String print() {
        String infoEmployee = "Id:" + id + "\nFullName: " + fullName + "\nPhone: " + phone +
        "\nDevices: " + devices + "\nDepartment: " + department;
        return infoEmployee;
    }

}
