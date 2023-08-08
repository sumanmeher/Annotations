package p1;

public class Student {
	String name;
	int id;
	String college;

	public Student(String name, int id, String college) {
		super();
		this.name = name;
		this.id = id;
		this.college = college;
	}
	@Course(cid=1,name="java",cost=2500)
	public void getDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(college);
	}
}
