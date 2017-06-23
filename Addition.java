import java.util.*;
import java.io.*;
public class Addition {
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
	double a;
	double b;
System.out.println("Enter 2 numbers");
	
a=sc.nextDouble();
b=sc.nextDouble();

Addition ad=new Addition();
ad.addn(a, b);
}

	 double addn(double a, double b) {
		 double result;
		result=a+b;
		String s;
		//s=result+"="+a+"+"+b;
		s=a+"+"+b+"="+result;
		System.out.println(result);
		System.out.println(s); 
		return result;
	}
	
}
