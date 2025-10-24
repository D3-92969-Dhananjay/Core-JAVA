import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str ;
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		
		System.out.println("The number of words in given String : "+ arr.length);
	}

}
