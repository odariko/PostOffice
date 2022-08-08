package com.solvd.postOffice.persons;

import com.solvd.postOffice.buildiings.SavingThings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Workable {
    default void work(){
        Logger log = LogManager.getLogger(Workable.class.getName());
        log.info("This employee is working");
    }
}
