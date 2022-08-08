package com.solvd.postOffice.packages;
import com.solvd.postOffice.persons.Customer;
import com.solvd.postOffice.tools.WhoPays;

public class Order {
    private Cost cost;
    private Customer customer;
    private WhoPays whoPays;

    private Package aPackage;

    public Order() {}

    public Order(Cost cost, Customer customer, WhoPays whoPays, Package aPackage){
        this.cost = cost;
        this.customer = customer;
        this.whoPays = whoPays;
        this.aPackage = aPackage;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public WhoPays getWhoPays() {
        return whoPays;
    }

    public void setWhoPays(WhoPays whoPays) {
        this.whoPays = whoPays;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Order) obj).cost == this.cost && ((Order) obj).customer == this.customer)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 800;
        result += cost.hashCode() + customer.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" + "cost=" + cost + "customer=" + customer + "}";
    }
}
