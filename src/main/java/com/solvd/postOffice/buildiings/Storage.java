package com.solvd.postOffice.buildiings;

import com.solvd.postOffice.packages.Cost;
import com.solvd.postOffice.packages.Letter;
import com.solvd.postOffice.packages.Parcel;

import java.util.List;

public class Storage implements SavingThings {
    private List<Letter> letters;
    private List<Parcel> parcels;
    private int freeDaysOfStorage;
    private Cost cost;

    public Storage() {}

    public Storage(List<Letter> letters, List<Parcel> parcels, int freeDaysOfStorage, Cost cost){
        this.letters = letters;
        this.parcels = parcels;
        this.freeDaysOfStorage = freeDaysOfStorage;
        this.cost = cost;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public int getFreeDaysOfStorage() {
        return freeDaysOfStorage;
    }

    public void setFreeDaysOfStorage(int freeDaysOfStorage) {
        this.freeDaysOfStorage = freeDaysOfStorage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Storage) obj).freeDaysOfStorage == this.freeDaysOfStorage && ((Storage) obj).cost == this.cost)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 1500;
        result += freeDaysOfStorage;
        return result;
    }

    @Override
    public String toString() {
        return "Storage{" + "freeDaysOfStorage=" + freeDaysOfStorage + ", cost=" + cost + "}";
    }
}
