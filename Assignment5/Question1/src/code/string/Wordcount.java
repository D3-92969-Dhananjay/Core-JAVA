package code.string;

import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter string :");
		Scanner x = new Scanner(System.in);
		String str = x.nextLine();
		
		System.out.println("word count :" + wordCount(str));

	}

	private static int wordCount(String str) {
		// TODO Auto-generated method stub
		String []arr = str.trim().split(" ");
		
		return arr.length;
	}

}
