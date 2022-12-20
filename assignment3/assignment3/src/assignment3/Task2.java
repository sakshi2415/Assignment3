package assignment3;

import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

     List<Integer> mylist=  Arrays.asList(10, 40, 50,80,90,876,974,10000);
		
		for(int i=0; i<mylist.size(); i++) {
			
			for(int j=0; j<mylist.size(); j++) {
				
				System.out.println(mylist.get(j) +"  ");
		}
			
			System.out.println(mylist.get(i) +"  ");
			


	}
	}

}
