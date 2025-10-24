import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		String str = "";
		System.out.println("Enter the String :");
		str = sc.next();
		
		String RevStr = Reeverse(str);
		
		if(str.equals(RevStr) ) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
		
	}
	
	static String Reeverse(String str) {
		
		String [] arr = str.split("");
		String RevStr = "";
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			RevStr += arr[i];
		}
		return RevStr ;
		
	}

}
