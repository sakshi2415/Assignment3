package assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Task3 {

	public static void main(String[] args) {

		List<Integer> myList=  Arrays.asList(10, 40, 50,80,90,876,974,10000);
		
		 for (Iterator<Integer> itr=myList.iterator(); itr.hasNext(); )
			 
			 System.out.println(itr.next());
	        {
	}

}
}
