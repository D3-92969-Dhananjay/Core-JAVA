package com.app.fruits;

abstract class Fruit{
	String color;
	String weight;
	String name;
	boolean isfresh;
	
	public Fruit(String color, String weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isfresh = true;
	}
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isIsfresh() {
		return isfresh;
	}



	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}
	
	
	
	

	 public abstract String taste();
	 public String toString() {
			// TODO Auto-generated method stub
			return String.format("Name : %s , Color : %s ,Weight : %s , isfresh :%b", name,color,weight,isfresh);
		}
	
}
