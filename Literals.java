public class Literals
{
	public static void main(String args[])
	{
		/***character Literals****/ 
		char A = 88;
		char B = 'B';
		System.out.println("The value of A is : "+ A); 
		System.out.println("The value of B is : "+ B);

		//operations on characters 
		char C = ++A;
		System.out.println("The value of A new is: " + A);
		System.out.println("The value of C is: " + C);

		// notations 
		char D = 012 ;      //octal ; Char literal as Integral literal
		char E = '\'';      //escape sequence
		char F = '\ua455';  //hex unicode
		char G = '\11';     //oct unicode 
		
		System.out.println("The value of D is " + D);
		System.out.println("The value of E is " + E);	
		System.out.println("The value of F is " + F);
		System.out.println("The value of F is " + G);

		/****Integer Literals ****/
        int num1 = 105;  // decimal 
        int num2 = 0123; //octal
        int num3 = 0xa2; //hex
        int num4 = 0b10; //binary
        System.out.println("num1 is " + num1 + "\nnum2 is " + num2+ 
        		          "\nnum3 is "+num3 +"\nnum4 is " + num4 + "\n");
        
        /**operation on integer and character literals ***/
        int num = '0';
        char ch = 'b';
        System.out.println("combination is " + num+ch);
        
        /***floating point and double***/
        float var1 = 10f; // float var1 = 10 is not valid - needs "f" at end .By default it is a double
        double var2 = 3.4;
        double var3 = 3.14159e0;//exponent
        double var4_d = 10.56888888d;
        double var4_f = 10.56888888f;
        float var5 = 10.56888888f;
        /* float var6 = 10.56888888d; - InValid as we can't convert convert 
           directly float to double */
         System.out.println("Var1 is " +var1 + "\nVar2 is " +var2 + "\nVar3 is " +var3 +  
                     		"\nVar4 double is " +var4_d + "\nVar4 float is " +var4_f +
                     		"\nVar5 is " +var5+"\n" );
                
        /***string literals***/
        String text = "hi";
        String text_1 = "hi" + " I am here"; //concatenation
        System.out.println("text is " +text + "\ntext_1 is" +text_1 +"\n");
        /* String text_2 = hi; Treats hi as variable .
           Hence, it is valid expression as long as hi is defined */
        
        /***boolean literals***/ 
        Boolean a = true; 
        System.out.println("Boolean a is " +a);     
  
	}
}