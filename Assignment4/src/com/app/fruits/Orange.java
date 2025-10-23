package com.app.fruits;

class Orange extends Fruit{

	public Orange(String color, String weight) {
		super(color, weight, "Orange");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
}