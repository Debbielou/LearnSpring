package Springtest.Springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pat {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configarations.class);

      
        Company comp = context.getBean(Company.class);
        System.out.println("Company details: " + comp);

      
        Employee emp = context.getBean(Employee.class);

       
        System.out.println("\nTesting overtime method:");
        emp.overtime();

       
        System.out.println("Employee details: " + emp);

        context.close(); 
    }
}