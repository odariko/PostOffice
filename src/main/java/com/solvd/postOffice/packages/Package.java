package com.solvd.postOffice.packages;

import com.solvd.postOffice.persons.Receiver;
import com.solvd.postOffice.persons.Sender;

public abstract class Package implements Packable {
    private PostalCode postalCode;
    private Cost cost;
    private Sender sender;
    private Receiver receiver;

    public Package() {};

    public Package(PostalCode postalCode, Cost cost, Sender sender, Receiver receiver){
        this.postalCode = postalCode;
        this.cost = cost;
        this.sender = sender;
        this.receiver = receiver;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
