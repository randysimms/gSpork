package edu.cccti.gspork.util;

import java.util.Date;

public class DateUtils {

	//Milliseconds in time frame
	static final long ONE_HOUR = 60 * 60 * 1000L;
	static final long ONE_DAY = ONE_HOUR * 24;
	static final long ONE_YEAR = ONE_DAY * 365;
	
	/**
	 * This calculates (roughly) the number of days between two dates.  
	 * <p>NOTE: It does not factor in adjustments for Daylight Savings time 
	 * and/or leap years.
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double daysBetween(Date d1, Date d2){
		  long millis = (d2.getTime() - d1.getTime());
		  double days = millis / (ONE_DAY) ;
		  return Math.abs(days);
	}   

  	public static double yearsBetween(Date d1, Date d2) {
  		return Math.abs(daysBetween(d1, d2) / (double)365);
  	}
}
