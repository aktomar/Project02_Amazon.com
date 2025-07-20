package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Base.Base_Class;

public class Logs {

	public static final Logger logger = LogManager.getLogger(Base_Class.class);

	public static void info(String messsage) {

		logger.info(messsage);
	}

	public static void warn(String messsage) {

		logger.info(messsage);
	}

	public static void error(String messsage) {

		logger.info(messsage);
	}

	public static void debug(String messsage) {

		logger.info(messsage);
	}
}
