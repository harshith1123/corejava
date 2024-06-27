package com.harshit.assignment3;

public class Continent extends Country {
	private int noOfContinents;
	private String continentName;
	private	float continentSize;
	
	public Continent(String stateName, String stateLanguage, float stateSize, int noOfDistricts, String countryName,
			float countrySize, String countryLanguage,int noOfContinents,String continentName,float continentSize) {
		super(stateName, stateLanguage, stateSize, noOfDistricts, countryName, countrySize, countryLanguage);
		// TODO Auto-generated constructor stub
		this.noOfContinents=noOfContinents;
		this.continentName=continentName;
		this.continentSize=continentSize;
	}

	@Override
	public String toString() {
		return "Continent [noOfContinents=" + noOfContinents + ", continentName=" + continentName + ", continentSize="
				+ continentSize + ", getCounrtyName()=" + getCounrtyName() + ", getCountrySize()=" + getCountrySize()
				+ ", getCountryLanguage()=" + getCountryLanguage() + ", getStateName()=" + getStateName()
				+ ", getStateLanguage()=" + getStateLanguage() + ", getStateSize()=" + getStateSize()
				+ ", getNoOfDistricts()=" + getNoOfDistricts() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}




	
	
	
	
}
