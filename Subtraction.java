
import java.util.*;
import java.io.*;
public class Subtraction {
	
Scanner sc=new Scanner(System.in);
String s;
double a;
double b;
void get(){
System.out.println("Enter 2 numbers");

a=sc.nextDouble();
b=sc.nextDouble();
sub(a,b);

}


	 double sub(double a,double b) {
		
		double result;
		result=a-b;
		
		//s=result+"="+a+"+"+b;
		s=a+"-"+b+"="+result;
		System.out.println(result);
		//System.out.println(s);
		return result;
	}
	 String save()
	 {
		 
		 return s;
	 }
	
}
