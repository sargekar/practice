
public class array_basics {

	public static void main(String[] args)
	{

		// ways to declare int arrays:
		int a[] = new int[3];
		int b[] = { 1,2,3};
		int i = 0;

		System.out.println("The array a contains :" + a);// prints the reference
		for(i=0;i<a.length;i++){
			System.out.println("The array a contains :" + a[i]);
		}

		// alternate way to transverse array
		for(int num : b){	
			System.out.println("num is :" + num);
			System.out.println("The array a contains :" + b [num-1]);
		}
		// Multi dimensional array -- array of arrays (maybe of diff length)

		/** initialized and declared in same line **/
		int [][] grid = 
			{
					{1,2},  // 0th row
					{3,4,5} // 1st row
			};

		System.out.println( "the array grid contains: "+ grid[0][1]); // 0th row, 1st col
		System.out.println( "the array grid contains: "+ grid[1][2]); // 1st row, 2nd col

		/** initialized and declared separately**/
		String[][] list = new String[2][3];

		list[1][2]= "honey";

		System.out.println(list.length);
		System.out.println("list [0] has" + list[0]);
		System.out.println("looping through the multi-dimensional array: ");	
		
		//looping through the multi-dimensional array;
		for (int r =0;r<list.length;r++)
		{
			for (int c=0;c<list[r].length;c++)

			{
				System.out.print(  list[r][c] + "\t");
			}
			System.out.println();
		}
	}
}









