package com.solvd.postOffice.buildiings;
import com.solvd.postOffice.persons.Customer;
import com.solvd.postOffice.persons.Employee;

import java.util.List;
import java.util.Set;

public class PostOffice {
    private Address address;
    private Set<Employee> employees;
    private List<Customer> customers;
    private Storage storage;

    public PostOffice() {}

    public PostOffice(Address address, Set<Employee> employees, List<Customer> customers, Storage storage){
        this.address = address;
        this.employees = employees;
        this.customers = customers;
        this.storage = storage;
    }

    public Address getAddress() {
        return address;
    }

    public void setEmployees(Address address) {
        this.address = address;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setCustomers(Storage storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((PostOffice) obj).address == this.address && ((PostOffice) obj).employees == this.employees &&
                ((PostOffice) obj).customers == this.customers && ((PostOffice) obj).storage == this.storage)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 1100;
        result += address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PostOffice{" + "address=" + address + "}";
    }
}
