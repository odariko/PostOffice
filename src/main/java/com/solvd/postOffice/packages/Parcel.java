package com.solvd.postOffice.packages;

import com.solvd.postOffice.persons.Receiver;
import com.solvd.postOffice.persons.Sender;
import com.solvd.postOffice.tools.ParcelType;

public class Parcel extends Package {
    private ParcelType parcelType;
    private double weight;
    private Cost worth;

    public Parcel() {}

    public Parcel(ParcelType parcelType, double weight, Cost worth){
        this.parcelType = parcelType;
        this.weight = weight;
        this.worth = worth;
    }

    public Parcel(PostalCode postalCode, ParcelType parcelType,
                  double weight, Cost worth){
        super(postalCode);
        this.parcelType = parcelType;
        this.weight = weight;
        this.worth = worth;
    }

    public ParcelType getParcelType() {
        return parcelType;
    }

    public void setParcelType(ParcelType parcelType) {
        this.parcelType = parcelType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws WeightIncorrectException {
        if(weight < 0) throw new WeightIncorrectException("Weight is < 0");
        this.weight = weight;
    }

    public Cost getWorth() {
        return worth;
    }

    public void setWorth(Cost worth) {
        this.worth = worth;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Parcel) obj).weight == this.weight && ((Parcel) obj).worth == this.worth &&
                ((Parcel) obj).parcelType == this.parcelType && ((Parcel) obj).getPostalCode() == this.getPostalCode())
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 900;
        result += weight;
        return result;
    }

    @Override
    public String toString() {
        return "Parcel{" + "parcelType=" + parcelType + "postalCode=" + getPostalCode() + "}";
    }
}
