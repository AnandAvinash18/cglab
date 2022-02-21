import java.util.*;	
	class InvalidNameException extends Exception
	{
	}
	class EmployeeName
	{
		public static void main(String[] args)
		{
			String fname="";
			String lname="";
			String fullname=fname.concat(lname);
			if(fname=="" && lname=="")
			{
				System.out.println(fullname);
			}
			try 
			{
				empName( fname, lname);
			}
			catch(InvalidNameException e)
			{
				System.out.println("Firstname and Lastname should not be empty");
			}			
		}
		public static void empName(String firstName,String lastName) throws InvalidNameException
		{			
			if(firstName=="" || lastName=="")
			{
				 throw new InvalidNameException();
				 }
			else
			{
				System.out.println("Firstname and Lastname entered correctly" );
			}
		
		}
		
}

