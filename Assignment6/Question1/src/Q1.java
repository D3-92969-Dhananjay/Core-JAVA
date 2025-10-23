import java.util.Scanner;
public class Q1 {
	public static void main(String[]args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter your string :");
		String str = x.nextLine();
		
		try {
			
			int length = calculatelength(str);
			System.out.println("Length of string is :"+ length);
			 
		}catch(ExceptionLineTooLong e){
			System.out.println(e.getMessage());
			
		}
		
		
		
		
	}

	private static int calculatelength(String str) throws ExceptionLineTooLong {
		// TODO Auto-generated method stub
		
		int length = 20;
		if(str.length() >20)
			throw new ExceptionLineTooLong("The strings is too long");
		
		return str.length();
	}

}
