package p2;

import java.lang.reflect.Method;

public class mainApp2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Suman", 30000);
		e1.getDetails();

		Class<? extends Employee> a1 = e1.getClass();
		try {
			Method m1 = a1.getMethod("getDetails");
			boolean b = m1.isAnnotationPresent(Address.class);
			if (b == true) {
				Address ad = m1.getAnnotation(Address.class);
				System.out.println(ad.addline());
				System.out.println(ad.city());
				System.out.println(ad.state());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
