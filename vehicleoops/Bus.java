package vehicleoops;

public class Bus extends vehicle {
	private int seatingcapacity;
	public Bus(int a ,int b,String c,int sc)
	{   super(a,b,c);
		seatingcapacity=sc;
		
	}
	void Busoutput()
	{
		super.vehicleoutput();
		System.out.print("Seating capacity of bus is:"+seatingcapacity);
	}

}
