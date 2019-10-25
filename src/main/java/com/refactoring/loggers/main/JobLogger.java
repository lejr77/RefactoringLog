package com.refactoring.loggers.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JobLogger {
	static Logger log = LogManager.getLogger(JobLogger.class.getName());
	public static void main(String[] args) throws IOException {
		System.out.println("/******* Choose a number *******/ \n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.valueOf(br.readLine());
		log.info("Info : number is " + number);
		log.warn("Warning : number is " + number);
		log.debug("Debug : number is " + number);
		log.error("Error : number is " + number);
		log.fatal("Fatal : number is " + number);

	}
}