package com.solvd.postOffice.delivery;

public class DeliveryTime {
    private int time;

    public DeliveryTime() {}

    public DeliveryTime(int time){
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) throws IncorrectTimeException {
        if(time < 0) throw new IncorrectTimeException("Time is < 0");
        else if (time > 200) throw new IncorrectTimeException("Time is up");
        this.time = time;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((DeliveryTime) obj).time == this.time)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 500;
        result += time;
        return result;
    }

    @Override
    public String toString() {
        return "DeliveryTime{" + "time=" + time + "}";
    }

}
