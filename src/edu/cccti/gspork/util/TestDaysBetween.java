package edu.cccti.gspork.util;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

public class TestDaysBetween {

	@Test
	public void testDaysBetween() {
		
		//Test: roughly 30 days between them
		Date dt1 = null;
		Date dt2 = null;
		try {
			dt1 = new SimpleDateFormat("yyyy-MM-dd hh:mm").parse("1969-12-31 1:30");
			//dt2 = new SimpleDateFormat("yyyy-MM-dd").parse("2011-07-01");
			dt2 = new Date();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		double days = DateUtils.daysBetween(dt1, dt2);
		System.out.println(" Days between " + dt1 + " and " + dt2 + " is: " + days);
		assertTrue("Days are positive", days > -1 );
		
		double years = DateUtils.yearsBetween(dt2, dt1);
		System.out.println(" Years between " + dt1 + " and " + dt2 + " is: " + years);
		assertTrue("Years are positive", years > -1 );
	}

	
}
