package areaofrectangle;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		area ar=new area();
		int l,b;
		System.out.println("Enter the length of Rectangle:");
		l=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle:");
		b=sc.nextInt();
		
		ar.setdim(l, b);
		ar.getarea();
		
	}

}
