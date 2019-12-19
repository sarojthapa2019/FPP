package lesson8.exercise_6;

import java.util.*;
`

@SuppressWarnings("serial")
public class Main {
	
	public static void main(String[] args) {
		List<String> list1 = dataList1();
		List<String> list2 = dataList2();
		List<String> list3 = dataList3();
		
		//Step 1: Sort each list
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		
		//Step 2: Assemble the sorted lists into a single collection of lists
		var all = Arrays.asList(list1, list2, list3);
		
		//Step 3: Sort the combined list using a Comparator. Declare that
		//listA comes before listB if the 0th element of A precedes the 0th
		//element of B. Then print the combined list to the console
		Collections.sort(all, new ListComparator());
		System.out.println(all);
		
				
		Collections.sort(all, (List<String> l1, List<String> l2) -> l1.get(0).compareTo(l2.get(0)));
		System.out.println(all);	

	}
	
	//defining the Comparator as an inner class
	//unused
	static class ListComparator implements Comparator<List<String>> {
		@Override
		public int compare(List<String> l1, List<String> l2) {
			String s1 = l1.get(0);
			String s2 = l2.get(0);
			return s1.compareTo(s2);
		}
	}

	
	private static List<String> dataList1() {
		return new ArrayList<String>() {
			{
				add("Joe"); add("Bill");add("Sue");
				add("Rob"); add("Mohammed");add("Steven");
			}
		};
	}

	private static List<String> dataList2() {
		return new ArrayList<String>() {
			{
				add("Rick"); add("Sally");add("Tom");
				add("George"); 
			}
		};
	}

	private static List<String> dataList3() {
		return new ArrayList<String>() {
			{
				add("Talia"); add("Richard");add("Chloe");
				add("Celine"); add("Zahra");add("Rod");
				add("Frank");
			}
		};

	}

}
