package com.solvd.postOffice.packages;
import com.solvd.postOffice.persons.Customer;
import com.solvd.postOffice.persons.Receiver;
import com.solvd.postOffice.persons.Sender;
import com.solvd.postOffice.tools.WhoPays;

public class Order {
    private Cost cost;
    private WhoPays whoPays;
    private Package aPackage;

    public Order() {}

    public Order(Cost cost, WhoPays whoPays, Package aPackage){
        this.cost = cost;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Order) obj).cost == this.cost)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 800;
        result += cost.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" + "cost=" + cost + "}";
    }
}
