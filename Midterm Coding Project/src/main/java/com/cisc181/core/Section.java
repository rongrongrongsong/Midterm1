package com.cisc181.core;
import java.util.ArrayList;
import java.util.UUID;

public class Section extends Person {
	private UUID courseID;
	private UUID semesterID;
	private UUID sectionID;
	private int roomID;
	
	public Section(){
	
	}
	public Section(UUID CourseID,UUID SemesterID,int RoomID, UUID SectionID) {
		
		this.courseID=CourseID;
		this.semesterID=SemesterID;
		this.roomID=RoomID;
		this.sectionID=SectionID;
	}
	public UUID getCourseID() {
		return courseID;
	}
	
	public void setCouseID(UUID couseID) {
		this.courseID = couseID;
	}
	public UUID getSemesterID() {
		return semesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}
	public UUID getSectionID() {
		return sectionID;
	}
	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public double courseAverageGrade(ArrayList<Enrollment> gradelist){
		ArrayList<Enrollment> gradeList=gradelist;
		double sumOfGrade=0;
		for (Enrollment Enrollement: gradeList){
			sumOfGrade=sumOfGrade+Enrollement.getGrade();
		}
		double courseAverageGrade=sumOfGrade/gradeList.size();
		System.out.println(courseAverageGrade);
		return courseAverageGrade;
		
	}
}

