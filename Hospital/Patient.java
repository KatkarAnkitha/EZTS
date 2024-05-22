package Hospital;

public class Patient extends Person{
	private String disease;
	private int bedno;
	public Patient(String a,String b,String c,String di,int bn)
	{
		super(a,b,c);
		disease=di;
		bedno=bn;
	}
    void patientoutput()
    {
    	super.personoutput();
    	System.out.println("Bed number of patient is:"+bedno+"\nDisease is :"+disease);
    }
}
