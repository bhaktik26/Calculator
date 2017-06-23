public class Adapter implements Calculator {

	   AdvancedCalc advancedCalc;
	   String out;

	   public Adapter(int request){
	   
	      if(request==3){
	         advancedCalc = new Sine();			
	         }
	      if(request==4){
		         advancedCalc = new Cosine();			
		         }
	   }

	   @Override
	   public String calc(int request) {
	   
	      if(request==3){
	         advancedCalc.get();
	         Sine so=new Sine();
	         out=so.save();
	         
	      }
	      else if(request==4){
	         advancedCalc.get();
	         Cosine co=new Cosine();
	         out=co.save();
	      }
	      return out;
	  
	   }
	   
	}