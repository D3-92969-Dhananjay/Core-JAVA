package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		System.out.print("Enter x,y coordinate of P1 :");
		p1.setX(sc.nextDouble());
		p1.setY(sc.nextDouble());
		
		System.out.print("Enter x,y coordinate of P2 :");
		p2.setX(sc.nextDouble());
		p2.setY(sc.nextDouble());
		
		
		System.out.println("Details of p1 point : "+ p1.getDetails());
		
		System.out.println("Details of p2 point : "+ p2.getDetails());
		
		System.out.print("Are the points same :" );
		
		if(p1.isEqual(p1, p2)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
			double dist = p1.calculateDistance(p1, p2);
			System.out.printf("The distance between 2 points is : %.2f", dist );
		}
	}

}
