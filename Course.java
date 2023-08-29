package com.training.list;

public class Course {

	private Integer courseId;
	private String courseName;
	private float  fee;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer courseId, String courseName, float fee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	
	  @Override 
	  public String toString()
	  { return "Course [courseId=" + courseId +
	  ", courseName=" + courseName + ", fee=" + fee + "]"; 
	  }
	  
	 
	
	
	
	
}
