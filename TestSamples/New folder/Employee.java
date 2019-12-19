package prob_final2.prob1;

//DO NOT MODIFY IN ANY WAY
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String fname;
	private String lname;
	private double salary;
	private LocalDate  hireDay;

	// constructor
	public Employee(String afname, String alname, double aSalary, int aYear,
			int aMonth, int aDay) {
		fname = afname;
		lname = alname;
		salary = aSalary;
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	// instance methods
	public String getfname() {
		return fname;
	}
	public String getlname() {
		return lname;
	}
	public void setlname(String alname) {
		lname = alname;
	}
	public double getSalary() {
		return salary;
	}
	// needs to be improved
	public LocalDate getHireDay() {
		return hireDay;
	}
	private String format = "fname = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, fname, salary, hireDay.toString());
	}
}
