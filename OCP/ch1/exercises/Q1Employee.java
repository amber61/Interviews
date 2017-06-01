package ch1.exercises;

// Q1
public class Q1Employee {
	public int employeeId;
	public String firstName, lastName;
	public int yearStarted;

	@Override
	public int hashCode() {
		return employeeId;
	}

	public boolean equals(Q1Employee e) {
		return this.employeeId == e.employeeId;
	}

	public static void main(String[] args) {
		Q1Employee one = new Q1Employee();
		one.employeeId = 101;
		Q1Employee two = new Q1Employee();
		two.employeeId = 101;
		if (one.equals(two))
			System.out.println("Success");
		else
			System.out.println("Failure");
	}
}
