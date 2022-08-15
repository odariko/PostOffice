package com.solvd.postOffice.packages;

import com.solvd.postOffice.persons.Receiver;
import com.solvd.postOffice.persons.Sender;

public abstract class Package implements Packable {
    private PostalCode postalCode;

    public Package() {};

    public Package(PostalCode postalCode){
        this.postalCode = postalCode;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }
}
