package Prototype;

/**
 * Created by Serhat CAN on 07.11.2015.
 */
public class Secretary implements Employee{

    private String employeeId;
    private String name;
    private Address address;

    public Secretary(String employeeId, String name, String street, String no) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = new Address(street, no);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Secretary clone() throws CloneNotSupportedException {
        return (Secretary) super.clone();
    }
}