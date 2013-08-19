package com.jd.jdpc.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author sdc
 * @date 2013.8.16
 * Get the LOG object to store the special log info which generates from code.
 * */
public class LOG {

	private static String infoLogFileName = null;
	private static String debugLogFileName = null;
		
	/**
	 * Set the property to log4j.properties
	 * */
	private static void setProperty(String logDir, String logName){
		infoLogFileName = ConfigKeys.INFO_LOG_FILE_NAME_PREFIX + logName;
		debugLogFileName = ConfigKeys.DEBUG_LOG_FILE_NAME_PREFIX + logName;
		
		System.setProperty(ConfigKeys.LOG_FILE_DIR, logDir);
		System.setProperty(ConfigKeys.INFO_LOG_FILE, infoLogFileName);
		System.setProperty(ConfigKeys.DEBUG_LOG_FILE, debugLogFileName);
	}
	
	/**
	 * Get the log instance by string.
	 * @param logDir the directory of the log file;
	 * @param logName the name of the log file, the info level log file name will be
	 *        INFO_LOG_FILE_NAME_PREFIX + logName, and the debug level log file name will
	 *        be DEBUG_LOG_FILE_NAME_PREFIX + logName;
	 * @param className the name of the class which generates the log file information.
	 * */
	public static Log getLog(String logDir, String logName, String className){
		setProperty(logDir, logName);
		return LogFactory.getLog(className);
	}
	
	/**
	 * Get the log instance by Class.
	 * @param logDir the directory of the log file;
	 * @param logName the name of the log file, the info level log file name will be
	 *        INFO_LOG_FILE_NAME_PREFIX + logName, and the debug level log file name will
	 *        be DEBUG_LOG_FILE_NAME_PREFIX + logName;
	 * @param className the name of the class which generates the log file information.
	 * */
	@SuppressWarnings("rawtypes")
	public static Log getLog(String logDir, String logName, Class className){
		setProperty(logDir, logName);
		return LogFactory.getLog(className);
	}
}
