package com.solvd.postOffice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public static void main(String[] args) {
        final Logger log = LogManager.getLogger();
        log.info("Hello this is an info message");
        log.debug("on");
    }
}