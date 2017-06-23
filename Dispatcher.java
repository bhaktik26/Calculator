
public class Dispatcher {
	 private ArithCalc a;
	   private Subtraction s;
	   String out;
	   
	   public Dispatcher(){
	      a = new ArithCalc();
	      
	   }

	   public String dispatch(int request){
	     out= a.calc(request);
	     return out;
	   }
}
