package assignment_1;
import java.util.* ;

public class assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int i = sc.nextInt();	
		
		System.out.println("Given number : "+i);
	
		
		String bin = Integer.toBinaryString(i);
		String oct = Integer.toOctalString(i);
		String hex = Integer.toHexString(i);
		
		System.out.println("Binary equivalent : " + bin);
		System.out.println("Octal equivalent : " + oct);
		System.out.println("Hexadecimal equivalent : " + hex);


	}

}
