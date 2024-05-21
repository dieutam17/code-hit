package Refactoring;

class Employee {
	public string Name { get; set; }
    public string ID { get; set; }

    public void DoWork() {
        // Common implementation for all employees
    }	
}

	class Coder extends Employee {
	}

	class Manager extends Employee {
}