package Refactoring;

public class Employee2 {
	private static final int basicRate = 1400000;
	String name;
	double bonus;
	double payRate;

	public double basicSalary() {
		return payRate * basicRate;
	}

	public double salary() {
		return bonus + basicSalary();
	}
}
