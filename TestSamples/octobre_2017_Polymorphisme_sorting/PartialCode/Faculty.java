package prob1;

public final class Faculty{
	String name;
	double salary;
	double overPay;
	Gender gen;
	public Faculty(String name, double salary, double overPay, Gender gen) {
		this.name = name;
		this.salary = salary;
		this.overPay = overPay;
		this.gen = gen;
	}
	public double calculatePay() {
		return salary+overPay;
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
	public double getOverPay() {
		return overPay;
	}
	public void setOverPay(double overPay) {
		this.overPay = overPay;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" +name + ", "+ this.gen + ", " + calculatePay();
	}
}
