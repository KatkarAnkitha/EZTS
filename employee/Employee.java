package employee;

public class Employee {
   private String name;
   private int age;
   public void setDetails(String n,int a)
   {
	   name=n;
	   age=a;
   }
   public String getDetails()
   {
	   return "Name of employee is: " + name + "\nAge of employee : " + age;   
   }

}
