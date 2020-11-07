package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
static Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world");
		logger.debug("This is a debug message");
		logger.info("This is info message");
		logger.fatal("This is fatal message");
		logger.warn("This is Warn message");
		logger.error("This is error message");
	System.out.println("\n completed");
	}

}
