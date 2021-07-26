package com.springmvcdemo.two.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//define default course code
	public String value() default "super";
	
	//define default error message
	public String message() default "Must start with super";
	
	//define default group
	public Class<?>[] groups() default {};
	
	//define default payload
	public Class<? extends Payload>[] payload() default {};

}
