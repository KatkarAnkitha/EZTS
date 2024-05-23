package javabasics;
import java.util.*;
public class secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n,i,max1=0,max2=0;
      System.out.print("Enter no.of elements:");
      n=sc.nextInt();
      System.out.print("Enter elements in array:");
      int arr[]=new int[n];
      for(i=0;i<n;i++)
    	  arr[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
    	  if(max1<arr[i])
    	  { max2=max1;
    		  max1=arr[i];
    		  
    		  
    	  }
    	  else if(max2<arr[i])
    	  {
    		  max2=arr[i];
    	  }
      }
  
      System.out.print(max2);
      
	}

}
