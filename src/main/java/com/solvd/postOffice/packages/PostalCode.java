package com.solvd.postOffice.packages;

public class PostalCode {
    private String province;
    private String townDistrict;
    private String urbanPostOffice;

    public PostalCode() {}

    public PostalCode(String province, String townDistrict, String urbanPostOffice){
        this.province = province;
        this.townDistrict = townDistrict;
        this.urbanPostOffice = urbanPostOffice;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTownDistrict() {
        return townDistrict;
    }

    public void setTownDistrict(String townDistrict) {
        this.townDistrict = townDistrict;
    }

    public String getUrbanPostOffice() {
        return urbanPostOffice;
    }

    public void setUrbanPostOffice(String urbanPostOffice) {
        this.urbanPostOffice = urbanPostOffice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((PostalCode) obj).province == this.province && ((PostalCode) obj).townDistrict == this.townDistrict &&
                ((PostalCode) obj).urbanPostOffice == this.urbanPostOffice)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 1000;
        result += province.hashCode() + urbanPostOffice.hashCode() + townDistrict.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PostalCode{" + "province=" + province + "townDistrict=" + townDistrict + "urbanPostOffice=" +
                urbanPostOffice + "}";
    }
}
