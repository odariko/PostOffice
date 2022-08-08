package com.solvd.postOffice.delivery;

import java.util.logging.Logger;

public interface Delivering {
    default void deliveringPackage() {
        Logger log = Logger.getLogger(Delivering.class.getName());
        log.info("Delivering package");
    }
}
