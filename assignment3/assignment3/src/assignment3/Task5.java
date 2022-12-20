package assignment3;

import java.util.ArrayList;


public class Task5 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove(list.get(1));
		System.out.println(list);
		
		list.add(2,90);
		System.out.println(list);
		
		list.size();
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
	
		
		
		
		
		
		
	}

}
