package com.solvd.postOffice.packages;
import com.solvd.postOffice.persons.Receiver;
import com.solvd.postOffice.persons.Sender;
import com.solvd.postOffice.tools.LetterType;

public class Letter extends Package {
    private LetterType letterType;

    public Letter() {}

    public Letter(LetterType letterType){
        this.letterType = letterType;
    }

    public Letter(PostalCode postalCode, Cost cost, Sender sender, Receiver receiver, LetterType letterType){
        super(postalCode, cost, sender, receiver);
        this.letterType = letterType;
    }

    public LetterType getLetterType() {
        return letterType;
    }

    public void setLetterType(LetterType letterType) {
        this.letterType = letterType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Letter) obj).letterType == this.letterType && ((Letter) obj).getPostalCode() == getPostalCode() &&
                ((Letter) obj).getCost() == getCost() && ((Letter) obj).getSender() == this.getSender() &&
                ((Letter) obj).getReceiver() == this.getReceiver())
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 700;
        result += letterType.hashCode() + getPostalCode().hashCode() + getReceiver().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Letter{" + "letterType=" + letterType + "postalCode=" + getPostalCode() + "}";
    }
}
