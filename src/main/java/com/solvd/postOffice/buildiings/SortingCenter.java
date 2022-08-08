package com.solvd.postOffice.buildiings;
import com.solvd.postOffice.packages.Letter;
import com.solvd.postOffice.packages.Parcel;
import com.solvd.postOffice.persons.Customer;
import com.solvd.postOffice.persons.Employee;

import java.util.List;

public class SortingCenter {
    private Address address;
    private List<Employee> employees;
    private List<Customer> customers;
    private Storage storage;

    public SortingCenter() {}

    public SortingCenter(Address address, List<Letter> letters, List<Parcel> parcels, List<Employee> employees,
                         List<Customer> customers, Storage storage){
        this.address = address;
        this.employees = employees;
        this.customers = customers;
        this.storage = storage;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((SortingCenter) obj).employees == this.employees &&
                ((SortingCenter) obj).customers == this.customers)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 1400;
        result += address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SortingCenter{" + "Customers=" + getCustomers().size() + ", Employees=" + getEmployees().size() + "}";
    }
}
