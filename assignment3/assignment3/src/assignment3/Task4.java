package assignment3;

import java.util.Arrays;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {

    List<Integer> mylist=  Arrays.asList(10, 40, 50,80,90,876,974,10000);
    
	long intSum = mylist.stream().mapToLong(Integer::longValue).sum();
	
	  System.out.println(String.format("SUM: %s",intSum));	
	}


}
