package com.refactoring;


import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
public class UnitTest {
	private static Logger LOGGER = null;
	 @BeforeClass
	 public static void setLogger() throws MalformedURLException
	    {
	        System.setProperty("log4j2.configurationFile","log4j2.xml");
	        LOGGER = LogManager.getLogger();
	    }
	  
	    @Test
	    public void testOne()
	    {
	    	int number=2019;
	        LOGGER.debug("Debug Message Logged !!!");
	        LOGGER.info("Info Message Logged !!!");
	        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
	        LOGGER.info("Info : number is " + number);
	        LOGGER.warn("Warning : number is " + number);
	        LOGGER.debug("Debug : number is " + number);
	        LOGGER.error("Error : number is " + number);
	        LOGGER.fatal("Fatal : number is " + number);

	    }
}
