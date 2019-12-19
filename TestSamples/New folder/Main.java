package prob_final2.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Joe","Bruen", 5000,2015,5,5);
		Employee e2 = new Employee("Joe","Lerman", 3000,2016,12,25);
		Employee e3 = new Employee("Tennis","Rich", 4400,2013,11,13);
		Employee e4 = new Employee("Mark","Antony", 2700,2006,6,15);
		Employee e5 = new Employee("Anne","Dew", 4000,2012,5,11);
		
		Account a1 = new Account(e1,AccountType.CHECKING,300);
		Account a2 = new Account(e2, AccountType.SAVINGS, 500);
		Account a3= new Account(e3,AccountType.RETIREMENT,400);
		Account a4= new Account(e4,AccountType.CHECKING,100);
		Account a5= new Account(e5,AccountType.CHECKING,200);
		Account a6= new Account(e4,AccountType.SAVINGS,100);
		Account a7= new Account(e4,AccountType.CHECKING,600);
		Account a8= new Account(e2,AccountType.SAVINGS,500);
	    	   
	    List<String> ids = Arrays.asList("123452639", 
                "123452740",
                "342892138",
                "123452942",
                "123453043",
                "123453245",
                "123453346",
                "212341557",
                "115513151");
	
	Hashtable<String, Account> h = new Hashtable<String, Account>(){
		{
		put("123452639",a1);
		put("123452740",a2);
		put("123452841",a3);
		put("123452942",a4);
		put("123453043",a5);
		put("123453144",a6);
		put("123453245",a7);
		put("123453346",a8);
		}
	};
	List<Account> report = AccountAdmin.prepareReport(h, ids);
	report.forEach(x->System.out.println(x));
	/* Must produce the output like this
fname = Mark, salary = 2700.00, hireDay = 2006-06-15 Acc-Id =123452942 type = CHECKING, balance = 100.0
fname = Anne, salary = 4000.00, hireDay = 2012-05-11 Acc-Id =123453043 type = CHECKING, balance = 200.0
fname = Joe, salary = 5000.00, hireDay = 2015-05-05 Acc-Id =123452639 type = CHECKING, balance = 300.0
fname = Mark, salary = 2700.00, hireDay = 2006-06-15 Acc-Id =123453245 type = CHECKING, balance = 600.0
*/
}
}
