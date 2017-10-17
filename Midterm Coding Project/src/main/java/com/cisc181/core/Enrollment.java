package com.cisc181.core;

import java.util.UUID;

public class Enrollment extends Person{
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	private Enrollment() {
		this.enrollmentID = UUID.randomUUID();
	}
	public UUID getEnrollmentID() {
		return enrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}
	private void Enrollment() {
		
	}
	public Enrollment(UUID studentID,UUID sectionID) {
		this();
		this.studentID=studentID;
		this.sectionID=sectionID;
		
	}
	public void setGrade(double grade) {
			this.grade = grade;
		}
	public double getGrade() {
		return grade;
	}
	
}
