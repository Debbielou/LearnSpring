package Springtest.Springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pat {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configarations.class);
		Company comp = context.getBean(Company.class);
		 Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp.myCompany());


	}

}
