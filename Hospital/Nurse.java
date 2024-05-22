package Hospital;

public class Nurse extends Person  {
	private int roomno,floor;
	public Nurse(String a,String b,String c,int rn,int fl)
	{
		super(a,b,c);
		roomno=rn;
		floor=fl;
	}
	void nurseoutput()
	{
		super.personoutput();
		System.out.println("Floor is:"+floor+"\nRoom no is :"+roomno);
	}

}
