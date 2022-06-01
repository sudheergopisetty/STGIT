package main;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import service.AppServeice;

public class logNameApp {
	private static final Logger logger = LogManager.getLogger(logNameApp.class);
	public static void main(String[] args) {
		
		System.out.println("Good Morning");
		logger.info("info method");
		logger.debug("info method");
		logger.error("info method");
		logger.fatal("Fatal...!!");
		
		AppServeice appServeice = new AppServeice();
		appServeice.validate("24");
		EmploySort employSort = new EmploySort();
		Set  v = new TreeSet();
		logger.info("ll");
		logger.info("info method");
	}

}
