package com.app.geometry;

public class Point2D {
	double x;
	double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point2D() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		String xcord = String.valueOf(x);
		String ycord = String.valueOf(y);
		
		String ans = xcord;
		ans += ", ";
		ans += ycord;
		
		return ans;
	}
	
	public Boolean isEqual(Point2D p1, Point2D p2) {
		if(p1.x == p1.y && p1.y == p2.y) return true;
		
		return false;
		
	}
	
	public Double calculateDistance(Point2D p1, Point2D p2) {
		
		Double ans =  Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
		
		return ans ;
		
	}
	
}
