package p1;

import java.lang.reflect.Method;

public class mainApp {

	public static void main(String[] args) {
		Student s1=new Student("Suman",18,"ITER");
		s1.getDetails();
		
		Class<? extends Student> c1 = s1.getClass();
		try {
			Method m1=c1.getMethod("getDetails");
			boolean b = m1.isAnnotationPresent(Course.class);
			if(b==true) {
				Course cou=m1.getAnnotation(Course.class);
				System.out.println(cou.cid());
				System.out.println(cou.name());
				System.out.println(cou.cost());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
