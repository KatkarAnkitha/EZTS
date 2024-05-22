package Hospital;

public class Doctor extends Person {
	private String speciality;
	public Doctor(String a,String b,String c,String sp)
	{
		super(a,b,c);
		speciality=sp;
	}
	void docoutput()
	{
		super.personoutput();
		System.out.println("Speciality of doctor is:"+speciality);
	}

}