package com.solvd.postOffice.persons;
import com.solvd.postOffice.buildiings.SavingThings;
import com.solvd.postOffice.packages.Order;
import com.solvd.postOffice.tools.CustomerType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Customer extends Person implements Payable {
    private Logger log = LogManager.getLogger(Customer.class.getName());
    private CustomerType customerType;
    private Order order;

    public Customer() {}

    public Customer(CustomerType customerType, Order order){
        this.customerType = customerType;
        this.order = order;
    }

    public Customer(String name, String surname, CustomerType customerType, Order order){
        super(name, surname);
        this.customerType = customerType;
        this.order = order;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(int customerID) {
        this.order = order;
    }

    public void makeOrder() {
        log.info("Customer makes order");
    };

    @Override
    public void pay() {
        log.info("Customer pays order");
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Customer) obj).order == this.order && ((Customer) obj).customerType == this.customerType)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 300;
        result += order.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerType=" + customerType + "customerID=" + order + "}";
    }
}
