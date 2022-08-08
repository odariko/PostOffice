package com.solvd.postOffice.packages;

import java.util.logging.Logger;

public interface Packable {
    default void packing() {
        Logger log = Logger.getLogger(Packable.class.getName());
        log.info("This package is packed");
    }
}
