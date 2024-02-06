package Demo;

import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;


public class LoggerDemo {

	public static void main(String[] args) {
	org.apache.logging.log4j.Logger log = LogManager.getLogger("LoggerDemo");
	System.out.println("This is Logging Testing ");
	log.info("This is Logging FrameWork");
	log.warn("Test");
	log.fatal("Testing ");
	log.debug("All");

	}

}
