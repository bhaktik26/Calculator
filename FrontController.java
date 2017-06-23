import java.util.Scanner;

public class FrontController {
	String out;
	 private Dispatcher dispatcher;
	 Scanner sc=new Scanner(System.in);

	   public FrontController(){
	      dispatcher = new Dispatcher();
	   }

	   private boolean isAuthenticUser(){
		  System.out.println("Enter password");
		  int pass=sc.nextInt();
	      if(pass==123)
		  return true;
	      else
	      {
	      System.out.println("Wrong password");
	      return false;
	      }
	   }

	   private void trackRequest(int request){
	      System.out.println("Your request: " + request);
	   }

	   public String dispatchRequest(int request){
	      //log each request
	      trackRequest(request);
	      
	      //authenticate the user
	      if(isAuthenticUser()){
	         out=dispatcher.dispatch(request);
	         
	      }	
	      return out;
	   }
}
