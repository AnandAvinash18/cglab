
import java.util.Scanner;
	 
	class AgeValidException extends Exception 
	{ 
	 public AgeValidException(String str) 
	 {
	  System.out.println(str);
	 }
	}
	public class PersonAge {
	 
	 public static void main(String[] args) 
	 {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter age : ");
	  int age = s.nextInt();
	  
	  try {
	   if(age < 15) 
	    throw new AgeValidException("Invalid age");
	   else
	    System.out.println("Valid age");
	  }
	  catch (AgeValidException a) {
	   System.out.println(a);
	  }
	 }
	
}
