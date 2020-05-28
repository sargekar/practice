package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String args[]) 
	{ 
		List<String> myList = Arrays.asList("Aba","Swetha","Sneha","Martin","Ra","Avicii");
		System.out.println("myList		: "+ myList);
		
		//filter example
		List<String> myFilteredList = myList.stream().filter(s->s.startsWith("S"))
											.collect(Collectors.toList());
		System.out.println("myFilteredList	: "+ myFilteredList);
		
		//map example
		List<String> myMappedList = myList.stream().map(s->s+"S")
								          .collect(Collectors.toList());
		System.out.println("myMappedList	: "+myMappedList);
		
		
		//sorted example
		List<String> mySortedList = myList.stream().sorted()
								          .collect(Collectors.toList());
		System.out.println("mySortedList	: "+mySortedList);
		
		//forEach example
		myList.stream().forEach(x->System.out.println("list"));
		
		//reduce example
		List<Integer> numbers = Arrays.asList(1,4,5,6,7);
		int reducedNumbers = numbers.stream().reduce(0,(ans,i)->ans+i);
		System.out.println(reducedNumbers);											
		
		
	}


}
