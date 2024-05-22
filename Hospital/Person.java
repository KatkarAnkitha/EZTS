package Hospital;

public class Person {
	private String name,age,gender;
	public Person(String a,String b,String c)
	{
		name=a;
		age=b;
		gender=c;
		
	}
	void personoutput()
	{
		System.out.println("Name Of person is:"+name);
		System.out.println("Age Of person is:"+age);
		System.out.println("Gender Of person is:"+gender);
	}
	

}
