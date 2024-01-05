package com.kdic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        while( true) {

            System.out.println("Hello world!");
    
            logger.info("Hello World!ss");
            logger.debug("Hello World!fdsfds");
            logger.error("Hello World! ERROR!!!!");
        }
    }
}