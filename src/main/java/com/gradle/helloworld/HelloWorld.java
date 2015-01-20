package com.gradle.helloworld;

import org.apache.log4j.Logger;
import org.joda.time.LocalTime;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("the current local time is :" + currentTime);

        Greeter greeter = new Greeter();
        System.out.println("the greeter say : " + greeter.sayHello());

        System.out.println();

        LOGGER.info(greeter.sayHello());
        LOGGER.debug("debug info");
        LOGGER.warn("warn info");
        LOGGER.error("error info");
        LOGGER.fatal("fatal info");
    }
}