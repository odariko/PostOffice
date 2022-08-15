package com.solvd.postOffice;
import com.solvd.postOffice.buildiings.Address;
import com.solvd.postOffice.packages.*;
import com.solvd.postOffice.packages.Package;
import com.solvd.postOffice.persons.Receiver;
import com.solvd.postOffice.tools.CustomerType;
import com.solvd.postOffice.persons.Sender;
import com.solvd.postOffice.tools.ParcelType;
import com.solvd.postOffice.tools.WhoPays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Console;

public class Main {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        Cost cost1 = new Cost("grn", 20);
        PostalCode postalCode1 = new PostalCode("province1", "town1", "postoff1");
        Parcel package1 = new Parcel(postalCode1, ParcelType.Standard, 20, cost1);
        Address address1 = new Address("Ukraine", "Chernigiv", "Dubova", 21, 1);
        Order order1 = new Order(cost1, WhoPays.Sender, package1);
        Sender sender1 = new Sender("Natalia", "Marchenko", CustomerType.Sender, null, address1);
        sender1.makeOrder(order1);
        sender1.pay();

        Cost cost2 = new Cost("grn", 15);
        PostalCode postalCode2 = new PostalCode("province2", "town2", "postoff2");
        Parcel package2 = new Parcel(postalCode1, ParcelType.Standard, 30, cost1);
        Address address2 = new Address("Ukraine", "Odesa", "Pushkina", 3, 5);
        Order order2 = new Order(cost1, WhoPays.Sender, package2);
        Receiver receiver2 = new Receiver("Hrystyna", "Avramenko", CustomerType.Receiver, order2, address2);
    }
}