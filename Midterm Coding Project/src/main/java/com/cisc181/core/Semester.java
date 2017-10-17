package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester extends Person {
	private UUID semesterID;
	private Date startDate;
	private Date endDate;
	public Semester(){
	}
	public Semester(UUID semesterID,Date startDate,Date endDate) {
		this.semesterID=semesterID;
		this.startDate=startDate;
		this.endDate=endDate;
		}
	public UUID getSemesterID() {
		return semesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
