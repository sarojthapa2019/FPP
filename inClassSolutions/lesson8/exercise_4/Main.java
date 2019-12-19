package lesson8.exercise_4;

import java.util.*;

@SuppressWarnings("rawtypes")
public class Main {
	public static void main(String[] args) {
		//soln1();
		soln2();
		
	}
	
	static void soln1() {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("W", "X", "Y");
		List<List<String>> listOfLists = Arrays.asList(list1, list2);
		var listOfLists2 = Arrays.asList(list1, list2);
		System.out.println(listOfLists);
		System.out.println(listOfLists2);
	}
	
	
	
	
	
	
	
	
	
	static void soln2() {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("W", "X", "Y");
		List[] arrOfLists = {list1, list2};
		System.out.println(Arrays.toString(arrOfLists));
	}
}
    


