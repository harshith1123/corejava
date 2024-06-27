package com.harshit.assignment3;

public class Country extends State{
	private String counrtyName;
	private float countrySize;
	private String countryLanguage;
	
	public Country(String stateName, String stateLanguage, float stateSize, int noOfDistricts,String countryName,float countrySize,String countryLanguage) {
		super(stateName, stateLanguage, stateSize, noOfDistricts);
		// TODO Auto-generated constructor stub
		this.counrtyName=countryName;
		this.countrySize=countrySize;
		this.countryLanguage=countryLanguage;
	}

	/**
	 * @return the counrtyName
	 */
	public String getCounrtyName() {
		return counrtyName;
	}

	/**
	 * @param counrtyName the counrtyName to set
	 */
	public void setCounrtyName(String counrtyName) {
		this.counrtyName = counrtyName;
	}

	/**
	 * @return the countrySize
	 */
	public float getCountrySize() {
		return countrySize;
	}

	/**
	 * @param countrySize the countrySize to set
	 */
	public void setCountrySize(float countrySize) {
		this.countrySize = countrySize;
	}

	/**
	 * @return the countryLanguage
	 */
	public String getCountryLanguage() {
		return countryLanguage;
	}

	/**
	 * @param countryLanguage the countryLanguage to set
	 */
	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}
	
	
	
	
}
