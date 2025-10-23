package circle;

import java.util.Scanner;

public class Circle {
	double mx ;
	double my;
	double diameter;
	public double getMx() {
		return mx;
	}
	public double getMy() {
		return my;
	}
	public double getDiameter() {
		return diameter;
	}

	public Circle(double mx, double my, double diameter) throws NegativeDiameterException {
		super();
		this.mx = mx;
		this.my = my;
		
		if( diameter <0) {
			throw new NegativeDiameterException("diameter must be greater than 0");
		}
		this.diameter = diameter;
	}
	public Circle() {
		this.mx = 0;
		this.my = 0;
		this.diameter =100;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter x co-ordinate point of center of circle :");
			double x = sc.nextDouble() ;
			
			System.out.print("Enter y co-ordinate point of center of circle :");
			double y = sc.nextDouble() ;
			
			System.out.print("Enter diameter :");
			double z = sc.nextDouble() ;
			
			Circle c1 = new Circle(x,y,z);
			
		}catch( NegativeDiameterException e) {
			System.out.println(e.getMessage());
		}
	}

}
