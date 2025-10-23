package code.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter string :");
		Scanner x = new Scanner(System.in);
		String str = x.nextLine();
		
		System.out.println("ispalindrome :"+isPalindrome(str) ); 

	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int start =0; 
		int end = str.length() -1;
		while(start<end) {
			if(str.charAt(start)!= str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
