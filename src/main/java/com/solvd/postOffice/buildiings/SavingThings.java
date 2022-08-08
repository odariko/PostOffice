package com.solvd.postOffice.buildiings;

import com.solvd.postOffice.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface SavingThings {
    default void storingPackages() {
        Logger log = LogManager.getLogger(SavingThings.class.getName());
        log.info("Storing packages");
    }
}
