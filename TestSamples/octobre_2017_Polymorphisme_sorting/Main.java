package prob1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Faculty[] flist = { new Faculty("Wint", 3000,1000,Gender.MALE),
							new Faculty("Anne", 3500,2700,Gender.FEMALE),
							new Faculty("David", 2060,350,Gender.MALE),
							new Faculty("Rabin", 5000,2000,Gender.MALE), 
							new Faculty("Genefer", 3000,1000,Gender.FEMALE)
		};

		Staff[] slist = { new Staff("Britto", 20,110,Gender.MALE),
				new Staff("Amila", 35,200,Gender.FEMALE),
				new Staff("Hilton", 25,150,Gender.MALE),
				new Staff("Rod", 18,200,Gender.MALE), 
				new Staff("Girma", 23,170,Gender.FEMALE)
		};
		List<Faculty> list1 = Arrays.asList(flist);
		List<Staff> list2 = Arrays.asList(slist);
		List<Payable> plist = Utility.MakePayableList(list1, list2);
		System.out.println("Combined List : ");
		System.out.println("~~~~~~~~~~~~~~~~~\n");
		for(Payable x : plist)
			System.out.println(x);
		double tsalary = Utility.computeTotalSalary(plist);
		System.out.println("\nTotal Salary : " + tsalary);
		
		System.out.println("Gender Male Count : ");
		System.out.println(Utility.GenderCount(plist, Gender.MALE));
		
		System.out.println("Gender Female Count:");
		System.out.println(Utility.GenderCount(plist, Gender.FEMALE));
		
		System.out.println("Sorted List by Name");
		System.out.println("~~~~~~~~~~~~~~~~~~~~\n");
		Utility.sort(plist, SortType.NAME);
		
		
		System.out.println("Sorted List by Salary");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n");
		Utility.sort(plist, SortType.SALARY);
		
		
	}
}
