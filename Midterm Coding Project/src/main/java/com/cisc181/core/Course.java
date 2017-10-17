package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;


public class Course extends Person {
	private UUID courseID;
	private String courseName;
	private int gradePoints;
	private eMajor eMajor;
	public Course( String courseName, int gradePoints,eMajor major){
		this.courseID = UUID.randomUUID();
		this.courseName=courseName;
		this.gradePoints=gradePoints;
		this.eMajor=eMajor;
	}
	public UUID getCourseID() {
		return courseID;
	}

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	public eMajor geteMajor() {
		return eMajor;
	}

	public void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}

	
}
