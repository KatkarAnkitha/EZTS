import java.util.*;
 class Main {
  public static void main(String[] args) {
    int unit;
double bill,totalbill;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no.of units:");
    unit=sc.nextInt();

if(unit<=50)
{
bill=0.5*unit;
}
else if(unit<=150)
{
bill=25+(unit-50)*0.75;
}
else if (unit<=250)
{
bill=100+(unit-150)*1.20;
}
else
{
bill=220+(unit-250)*1.25;
}
totalbill=bill*0.2+bill;
System.out.print("Total bill is:"+totalbill);
  }
}

