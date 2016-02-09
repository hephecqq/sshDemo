package com.kostech.utils;

import java.text.DateFormat;
import java.util.Date;

/***
 * 
 * @author zlj
 *
 */
public class DateUtils {

	public static DateFormat df = null;

	/***
	 * 根据指定的格式获取当前系统的时间
	 * @return
	 */
	public static String currentTime() {

		Date date = new Date();
		df = DateFormat.getDateInstance(DateFormat.FULL);

		return df.format(date);
	}
	
}
