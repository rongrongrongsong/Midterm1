package com.cisc181.core;

import static org.junit.Assert.*;
import org.junit.Test;
import com.cisc181.core.Person;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cisc181.eNums.eTitle;


import org.junit.BeforeClass;

public class Staff_Test {
	

	
	@BeforeClass
	public static void setup(){
	}
	
	
	

	@Test
	public void test() {
		ArrayList<Staff> staffArrayList= new ArrayList<Staff>();
		double Salary1=10;
		double Salary2=20;
		double Salary3=30;
		double Salary4=40;
		double Salary5=50;
		staffArrayList.add(new Staff(Salary1));
		staffArrayList.add(new Staff(Salary2));
		staffArrayList.add(new Staff(Salary3));
		staffArrayList.add(new Staff(Salary4));
		staffArrayList.add(new Staff(Salary5));
		double expectedSalary=30;
		double sumofSalary=0;
		for (Staff staff: staffArrayList){
			sumofSalary+=staff.getSalary();
		}
		double averageSalary=sumofSalary/staffArrayList.size();
		assertEquals(expectedSalary, averageSalary,0.1);
	}
	@Test(expected = PersonException.class)
	public void InValidPhoneTest() throws PersonException {
		new Staff("Rong", "Rong", "Song", (new GregorianCalendar(2008,12, 12)).getTime(),
				"China China.", "33-555-1111", "rongsong@udel.edu", "Fri 2:00 - 4:00pm", 6, 150000,
				(new GregorianCalendar(2122, 9, 1)).getTime(), eTitle.MS);
	}

	@Test(expected = PersonException.class)
public void InvalidDOBTest() throws PersonException {
	new Staff("Y", "A", "B", (new GregorianCalendar(1899,12, 12)).getTime(),
			"China China China.", "(302)750-3689", "idonknow@udel.edu", "Mon 1:00 - 2:00pm", 2, 11110,
			(new GregorianCalendar(2008, 9, 1)).getTime(), eTitle.MS);
}
}
