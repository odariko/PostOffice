package com.solvd.postOffice.delivery;
import com.solvd.postOffice.tools.DeliveryType;

public class DeliveryService implements Delivering {
    private DeliveryType deliveryType;

    public DeliveryService() {}

    public DeliveryService(DeliveryType deliveryType){
        this.deliveryType = deliveryType;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((DeliveryService) obj).deliveryType == this.deliveryType)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 400;
        result += deliveryType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DeliveryService{" + "deliveryType=" + deliveryType + "}";
    }
}
