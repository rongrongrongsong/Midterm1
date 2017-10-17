package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.*;

import com.cisc181.eNums.eMajor;


public class Student extends Person {

	private eMajor eMajor;
	private UUID StudentID;
	
	public eMajor geteMajor()
    {
        return this.eMajor;
    }
    private void seteMajor(eMajor eMajor)
    {
        this.eMajor = eMajor;    
    }
    
    public UUID getStudentID(){
    		return this.StudentID;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor eMajor,
			String Address, String Phone_number, String Email) throws PersonException
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.eMajor = geteMajor();
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
	
	/*
	 * Here is to calculate GPA of each student
	 */
	public double GPA(double grade1,double grade2,double grade3,double grade4,double grade5,double grade6)
	{
		double [] Grades=new double[6];
		double [] GradePoints=new double[6];
		int i=0;
		Grades[0]=grade1;
		Grades[1]=grade2;
		Grades[2]=grade3;
		Grades[3]=grade4;
		Grades[4]=grade5;
		Grades[5]=grade6;
		double totalGrade=0;
	
		for (i=0;i<Grades.length;i++){
		  	if(Grades[i]>=90.0) {
			 	GradePoints[i]= 4.00;
		  		}
	
		  	else if(Grades[i]>=85.0&Grades[i]< 90.0)
			 	{GradePoints[i]= 3.00;
		  	
			 	}
		  	else if(Grades[i]>=80.0&Grades[i]< 85.0) {
			 	GradePoints[i]= 2.00;
		  		
		  	}
		  	else if (Grades[i]>=75.0&Grades[i]< 80.0) {
			 	GradePoints[i]= 1.00;
		
		  	}
		  	else {
		  		GradePoints[i]= 0.00;
		  		
		}
		totalGrade+=GradePoints[i];
		
		double gpa=totalGrade/(Grades.length);	
		System.out.println(gpa);
		
	}
		return totalGrade/(Grades.length);	
	}
}

