package p2;


public class Employee {
	int empid;
	String empname;
	int salary;

	public Employee(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	@Address(addline="2nd Cross",city="Bengaluru",state="Karnataka")
	@Address2(addline="4th Cross",city="Bengaluru",state="Karnataka")
	public void getDetails() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
	}
}
