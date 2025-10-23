package code.string;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter string :");
		Scanner x = new Scanner(System.in);
		String str = x.nextLine();
		
		System.out.println("Reversed string is : "+ reversedString(str)); 

	}

	public static String reversedString(String str) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder(str);
		
		int start =0; 
		int end = str.length() -1;
		while(start<end) {
			char temp = s.charAt(start);
	        s.setCharAt(start, s.charAt(end));
	        s.setCharAt(end, temp);
	        start++;
	        end --;
		}
		return s.toString();
	}

}
