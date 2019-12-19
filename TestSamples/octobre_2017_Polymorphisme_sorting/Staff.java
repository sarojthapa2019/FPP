package prob1;

public final class Staff implements Payable{
	String name;
	double wage;
	double hours;
	Gender gen;
	public Staff(String name, double wage, double hours, Gender gen) {
		this.name = name;
		this.wage = wage;
		this.hours = hours;
		this.gen = gen;
	}
	public double calculatePay() {
		return wage*hours;
	}
	public Gender getGender() {
		return gen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" +name + ", "+ this.gen + ", " + calculatePay();
	}
	
}
