import java.math.*;
import java.util.*;
import java.io.*;
public class Cosine implements AdvancedCalc {
Scanner sc=new Scanner(System.in);
public static String s; 
public void get(){
	
	double a;
	 System.out.println("Enter the angle(in degrees)");
	 a=sc.nextDouble();
	 cosine(a);
}

	 public double cosine(double a) {
		 double result,temp;
		temp=Math.toRadians(a);
		result=Math.cos(temp);
		s="cos"+a+"="+result;
		System.out.println(result);
		//System.out.println(s);
		return result;
	}
	 public double sine(double a) {
		 double result,temp;
		temp=Math.toRadians(a);
		result=Math.sin(temp);
		s="sin"+a+"="+result;
		System.out.println(result);
		//System.out.println(s);
		return result;
	}
	 public String save()
	 {
		 
		 return s;
	 }
	
}
