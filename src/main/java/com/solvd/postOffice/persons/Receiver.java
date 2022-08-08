package com.solvd.postOffice.persons;

import com.solvd.postOffice.buildiings.Address;
import com.solvd.postOffice.packages.Order;
import com.solvd.postOffice.tools.CustomerType;

public class Receiver extends Customer {
    private Address address;

    public Receiver() {}

    public Receiver(Address address) {
        this.address = address;
    }

    public Receiver(String name, String surname, CustomerType customerType, Order order, Address address) {
        super(name, surname, customerType, order);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Receiver) obj).address == this.address)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 1200;
        result += address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Receiver{" + "address=" + address + "}";
    }
}
