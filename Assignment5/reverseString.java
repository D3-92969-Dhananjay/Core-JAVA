
import java.util.Scanner;


public class reverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a string : ");
		String str = sc.next();
		String RevStr = "" ;
		
		String [] arr = str.split("");
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			RevStr += arr[i];
		}
		
		System.out.println("Reverse of "+str+" is :"+RevStr);
	
	}

}
