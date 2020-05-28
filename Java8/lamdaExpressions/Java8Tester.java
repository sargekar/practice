/***
 * https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm
 */
package lamdaExpressions;

public class Java8Tester {
	
	int operate(int a, int b, MathOperation mathOperation) 
	{
		return mathOperation.operation(a,b);
	}
	
	interface MathOperation{
		int operation(int a, int b);
	}

	interface GreetingService{
		void sayMessage(String message);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java8Tester tester = new Java8Tester();
			
		//operations
		MathOperation multiplication = (x,y)->(x*y);
		MathOperation addition = (x,y)->(x+y);
		MathOperation substraction = (x,y)->(x-y);
		MathOperation division = (x,y)->(x/y);
		
		//Greetings
		GreetingService greetService = message ->
		System.out.println("Hello "+ message);
		
		greetService.sayMessage("Swetha");
		System.out.println(tester.operate(1,2,multiplication));
				
		
		
	}

}
