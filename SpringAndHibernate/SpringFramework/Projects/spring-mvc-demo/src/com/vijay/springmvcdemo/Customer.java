package com.vijay.springmvcdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springmvcdemo.two.validation.CourseCode;

public class Customer {
	
	
	
	@NotNull(message = "Please provide the first name")
	@Size(min=2, message = "Please provide the first name with at lease two characters")
	private String firstName;
	
	
	@NotNull(message = "Please provide the last name")
	@Size(min=2, message = "Please provide the last name with at lease two characters")
	private String lastName;
	
	
	@NotNull(message = "Please provide the a value")
	@Min(value=0, message="should be greater than or equal to 0")
	@Max(value=10, message="should be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 five chars or digits")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public Integer getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
