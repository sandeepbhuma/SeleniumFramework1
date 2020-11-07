package demo;

public class ExceptionHandlingUsingThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		System.out.println("Hi");
		int i = 1/0;
		System.out.println("completed");
		}
		catch(Exception exp)
		{
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
//Final block will be executed at the end. 
		finally
{
	System.out.println("this is final block ");
	}
	}

}
