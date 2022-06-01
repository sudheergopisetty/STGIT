package service;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AppServeice {
	private static final Logger logger = LogManager.getLogger(AppServeice.class);
	public void validate(String s) {
		logger.info(s);
	}
		

}
