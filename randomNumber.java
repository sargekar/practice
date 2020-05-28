/**simple program to generate random number 3 ways **/

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class randomNumber
{
	public static void main(String args[])
	{
		/***implementation using random Class - import java.util.Random***/
		Random rand = new Random();

		//generate random integer
		int rand_Int1 = rand.nextInt(1000); // 0-1000 range
		int rand_Int2 = rand.nextInt(1000);
		System.out.println("The random integers generated via Random class are :\n"+ rand_Int1+"\n"+rand_Int2+"\n");

		//generate random double
		double rand_Double1 = rand.nextDouble();
		double rand_Double2 = rand.nextDouble();

		System.out.println("The random doubles generated via Random class are :\n"+ rand_Double1+"\n"+rand_Double2+"\n");


		/***implementation using Math.random()***/
		System.out.println("Random number generated via Math class is :" + Math.random()+"\n");



		/***implementation using  ThreadLocalRandom class -- import the concurrent class***/

		//generate random integer
		int tRand_Int1 =ThreadLocalRandom.current().nextInt();
        int tRand_Int2 =ThreadLocalRandom.current().nextInt();
        System.out.println("The random integers generated via thread class are :\n"+ tRand_Int1+"\n"+tRand_Int2+"\n");

		//generate random Double
        Double tRand_Double1 =ThreadLocalRandom.current().nextDouble();
        Double tRand_Double2 =ThreadLocalRandom.current().nextDouble();
        System.out.println("The random doubles generated via thread class are :\n"+ tRand_Double1+"\n"+tRand_Double2+"\n");
        
      //generate random Boolean
        Boolean tRand_Bool1=ThreadLocalRandom.current().nextBoolean();
        Boolean tRand_Bool2 =ThreadLocalRandom.current().nextBoolean();
        System.out.println("The random doubles generated via thread class are :\n"+ tRand_Bool1+"\n"+tRand_Bool2+"\n");
	}
}
