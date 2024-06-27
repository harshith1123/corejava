package com.harshit.assignment3;

public class State {
	private String stateName;
	private String stateLanguage;
	private float stateSize;
	private int noOfDistricts;
	
	public State(String stateName, String stateLanguage, float stateSize, int noOfDistricts) {		
		this.stateName = stateName;
		this.stateLanguage = stateLanguage;
		this.stateSize = stateSize;
		this.noOfDistricts = noOfDistricts;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateLanguage
	 */
	public String getStateLanguage() {
		return stateLanguage;
	}

	/**
	 * @param stateLanguage the stateLanguage to set
	 */
	public void setStateLanguage(String stateLanguage) {
		this.stateLanguage = stateLanguage;
	}

	/**
	 * @return the stateSize
	 */
	public float getStateSize() {
		return stateSize;
	}

	/**
	 * @param stateSize the stateSize to set
	 */
	public void setStateSize(float stateSize) {
		this.stateSize = stateSize;
	}

	/**
	 * @return the noOfStates
	 */
	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	/**
	 * @param noOfStates the noOfStates to set
	 */
	public void setNoOfStates(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}
	
	
	
}
