package com.solvd.postOffice.tools;

public enum CustomerType{
    Sender(0),
    Receiver(1);

    private int type;

    CustomerType(int type){
        this.type = type;
    }

    public int getType(){
        return type;
    }
}
