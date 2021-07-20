package com.vijay.springmvcdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student()
	{
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "india");
		countryOptions.put("US", "united states");
		countryOptions.put("UK", "united kingdom");
		countryOptions.put("AUS", "australia");
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
}
