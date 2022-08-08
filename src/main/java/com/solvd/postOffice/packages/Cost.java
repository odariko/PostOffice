package com.solvd.postOffice.packages;

public class Cost {
    private String currency;
    private double cost;

    public Cost() {}

    public Cost(String currency, double cost){
        this.currency = currency;
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) throws CostIncorrectException {
        if(cost < 0) throw new CostIncorrectException("Cost is < 0");
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Cost) obj).cost == this.cost && ((Cost) obj).currency == this.currency) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 200;
        result += cost;
        return result;
    }

    @Override
    public String toString() {
        return "Cost{" + "currency=" + currency + "cost=" + cost + "}";
    }
}
