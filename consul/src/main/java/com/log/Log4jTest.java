package com.log;

import org.apache.log4j.Logger;

/**
 * Log原理:
 */
public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.info("info");
        logger.error("error");
        logger.trace("trace");
        logger.debug("debug");
    }
}
