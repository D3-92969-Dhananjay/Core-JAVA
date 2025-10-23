
public class ExceptionLineTooLong extends Exception {
	String str = "";
	
	 public ExceptionLineTooLong(String str) {
         super(str); 
     }
	
	 @Override
     public String getMessage() {
         return "Exception :" +  super.getMessage();
     }

}
