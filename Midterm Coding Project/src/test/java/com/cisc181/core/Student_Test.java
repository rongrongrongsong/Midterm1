package com.cisc181.core;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.UUID;


import org.junit.BeforeClass;
import org.junit.Test;


import com.cisc181.eNums.eMajor;



public class Student_Test {

	private static ArrayList<Course>courseList = new ArrayList<Course>(3);
	private static ArrayList<Semester>semesterList = new ArrayList<Semester>(2);
	private static ArrayList<Section>sectionList = new ArrayList<Section>(2);
	private static ArrayList<Student>studentList = new ArrayList<Student>(10);
	

	public static Date date(int year, int month, int day) {
		
		Calendar date = GregorianCalendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}
	@BeforeClass
	public static void setup() throws PersonException{
		courseList.add(new Course("chem101",4,eMajor.CHEM));
		courseList.add(new Course("cisc181",4,eMajor.COMPSI));
		courseList.add(new Course("phys208",4,eMajor.PHYSICS));
		Semester Spring=new Semester(UUID.randomUUID(), (new GregorianCalendar(2001,12, 12)).getTime(), (new GregorianCalendar(2001,12, 12)).getTime());
		Semester fall =new Semester(UUID.randomUUID(),(new GregorianCalendar(2001,12, 12)).getTime(), (new GregorianCalendar(2001,12, 12)).getTime());
		semesterList.add(Spring);
		semesterList.add(fall);
		for (Semester a: semesterList){
			for(Course b:courseList){
				sectionList.add(new Section(b.getCourseID(),a.getSemesterID(),(int) (Math.random()*100),UUID.randomUUID()));
			}
		}
		studentList.add(new Student("A","A","A", (new GregorianCalendar(2001,12, 12)).getTime(),eMajor.BUSINESS,  "DUKE ST","111-000-0000","A@udel.edu"));
		studentList.add(new Student("B","A","A", (new GregorianCalendar(2002,12, 12)).getTime(),eMajor.BUSINESS, "DUKE ST","111-000-0000","B@udel.edu" ));
		studentList.add(new Student("C","A","A", (new GregorianCalendar(2003,12, 12)).getTime(),eMajor.CHEM, " DUKE ST","111-000-0000","C@udel.edu" ));
		studentList.add(new Student("D","A","A", (new GregorianCalendar(2004,12, 12)).getTime(),eMajor.CHEM, "DUKE ST","111-000-0000","D@udel.edu" ));
		studentList.add(new Student("E","A","A", (new GregorianCalendar(2005,12, 12)).getTime(),eMajor.NURSING, " DUKE ST","111-000-0000","E@udel.edu" ));
		studentList.add(new Student("F","A","A", (new GregorianCalendar(2006,12, 12)).getTime(),eMajor.NURSING, "DUKE ST","111-000-0000","F@udel.edu" ));
		studentList.add(new Student("G","A","A", (new GregorianCalendar(2007,12, 12)).getTime(),eMajor.BUSINESS, " DUKE ST","111-000-0000","G@udel.edu" ));
		studentList.add(new Student("H","A","A", (new GregorianCalendar(2008,12, 12)).getTime(),eMajor.BUSINESS, "DUKE ST","111-000-0000","H@udel.edu" ));
		studentList.add(new Student("I","A","A", (new GregorianCalendar(2009,12, 12)).getTime(),eMajor.PHYSICS, " DUKE ST","111-000-0000","I@udel.edu" ));
		studentList.add(new Student("J","A","A", (new GregorianCalendar(2010,12, 12)).getTime(),eMajor.PHYSICS, "DUKE ST","111-000-0000","J@udel.edu" ));
		
	}
@Test
	public void test_GPA() {
		ArrayList<Enrollment> Enrollmentlist= new ArrayList<Enrollment>();
		
		int i=0;
		int j=0;
		
		for (Student students: studentList){
			i++;
			for(Section sections: sectionList  ){
				j++;
				Enrollmentlist.add(new Enrollment(students.getStudentID(), sections.getSectionID())); 
				
			}
		}
		
		Enrollmentlist.get(0).setGrade(100);
		Enrollmentlist.get(1).setGrade(90);
		Enrollmentlist.get(2).setGrade(80);
		Enrollmentlist.get(3).setGrade(80);
		Enrollmentlist.get(4).setGrade(84);
		Enrollmentlist.get(5).setGrade(95);
		
		
		double averageGPA=studentList.get(0).GPA(Enrollmentlist.get(0).getGrade(), Enrollmentlist.get(1).getGrade(),
					Enrollmentlist.get(2).getGrade(), Enrollmentlist.get(3).getGrade(), 
					Enrollmentlist.get(4).getGrade(), Enrollmentlist.get(5).getGrade());
		assertEquals(averageGPA,3.000,0.0001);
	}
	

@Test 
public void test_averageGrade(){
	ArrayList<Enrollment> Enrollmentlist= new ArrayList<Enrollment>();
	
	int i=0;
	int j=0;
	
	for (Student students:studentList){
		i+=1;
		for(Section sections: sectionList  ){
			j+=1;
			Enrollmentlist.add(new Enrollment(students.getStudentID(), sections.getSectionID())); 
			
		}
	}
	
	Enrollmentlist.get(1).setGrade(100);
	Enrollmentlist.get(2).setGrade(90);
	Enrollmentlist.get(3).setGrade(80);
	Enrollmentlist.get(4).setGrade(70);
	Enrollmentlist.get(5).setGrade(60);
	Enrollmentlist.get(6).setGrade(50);
	Enrollmentlist.get(7).setGrade(40);
	Enrollmentlist.get(8).setGrade(30);
	Enrollmentlist.get(9).setGrade(20);
	Enrollmentlist.get(10).setGrade(10);
	ArrayList<Enrollment> list=new ArrayList<Enrollment>(10);
	list.addAll(Arrays.asList(Enrollmentlist.get(1),Enrollmentlist.get(2),
			Enrollmentlist.get(3),Enrollmentlist.get(4),
			Enrollmentlist.get(5),Enrollmentlist.get(6),
			Enrollmentlist.get(7),Enrollmentlist.get(8),
			Enrollmentlist.get(9),Enrollmentlist.get(10)));
	
	assertEquals(sectionList.get(0).courseAverageGrade(list),55,0.000001);
	
}
}
