package com.dto;

public class CourseImpl implements Course{
	
	private int  courseid;
	private String coursename;
	private int fee;
	private String courseDescription;
	
	public CourseImpl() {
		
	}
	
	public CourseImpl(int courseid, String coursename, int fee, String courseDescription) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.fee = fee;
		this.courseDescription = courseDescription;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "   courseid=" + courseid + ", coursename=" + coursename + ", fee=" + fee
				+ ", courseDescription=" + courseDescription + "";
	}
	
	
}
