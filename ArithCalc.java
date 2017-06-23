
public class ArithCalc implements Calculator {
	   Adapter adapter; 
	 String out;
	   @Override
	   public String calc(int request) {		

	      // built in support to play mp3 music files
	      if(request==1){
	         Addition a=new Addition();
	         a.get();
	         out=a.save();
	         
	        
			
	        		 } 
	      else if(request==2){
		         Subtraction s=new Subtraction();
		         s.get();
		          out=s.save();
					

		        		 } 
		      
	      //mediaAdapter is providing support to play other file formats
	     else if(request==3||request==4){
	         adapter = new Adapter(request);
	         out=adapter.calc(request);
	      }
	      
	      return out;
	    
	   }  
	   
	   
	   
	  
	}