
public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		
		/*
		 * Vorgehen 1 (try - catch  - finallys)
		try {
			System.out.println("Hello World .... !");
			int i = 1/0;
			System.out.println("Completed");
			
		}
		catch(Exception exp)  {
			System.out.println("I am inside catch block");
			System.out.println("Message is : " + exp.getMessage());
			System.out.println("Cause is : " + exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("I am inside finally block");
			
		}
		 */
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Alternatives Vorgehen:
	public static void demo() throws Exception {
		
		System.out.println("Hello World .... !");
		throw new ArithmeticException("not valid operation");
		//int i = 1/0;
		//System.out.println("Completed");
		
	}

}
