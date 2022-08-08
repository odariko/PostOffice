package com.solvd.postOffice.buildiings;

public class Address {
    private String country;
    private String town;
    private String street;
    private int houseNumber;
    private int apartmentNumber;

    public Address() {}

    public Address(String country, String town, String street, int houseNumber, int apartmentNumber){
        this.country = country;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Address) obj).country == this.country && ((Address) obj).apartmentNumber == this.apartmentNumber &&
                ((Address) obj).town == this.town && ((Address) obj).street == this.street &&
                ((Address) obj).houseNumber == this.houseNumber) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 100;
        result += houseNumber * apartmentNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + "town=" + town + "street=" + street + "houseNumber=" + houseNumber +
                "apartmentNumber=" + apartmentNumber + "}";
    }
}
