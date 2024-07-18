package com.tnsif.collections;

public class Laptop implements Comparable<Laptop> {
	private String brand;
	private int price;
	private int ram;
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if(this.getRam()<o.getRam()) {
			return 1;
		}
		return 0;
	}
	
	
}
