
import java.util.*;	
import java.io.*;	

public class FrontControllerPatternDemo {
	  
		   public static void main(String[] args) {
		   int choice=0;
		   ArithCalc c=new ArithCalc();
		   Caretaker caretaker = new Caretaker();
		   Originator originator = new Originator();
		   int saveFiles = 0, currentArticle = 0;
		   String str;

		      FrontController frontController = new FrontController();
		      while(true)
		      {
		      System.out.println("Calculator");
		      System.out.println("Enter your choice");
		      System.out.println("1:Add");
		      System.out.println("2:Sub");
		      System.out.println("3:Sine");
		      System.out.println("4:Cosine");
		      System.out.println("6:Undo");
		      System.out.println("7:Redo");
		      System.out.println("8:Exit");
		      Scanner sc=new Scanner(System.in);
		      choice=sc.nextInt();
		      if(choice==8)
		    	  break;
		      else if (choice==6)
		      {
		    	  if(currentArticle >= 1)
		    	  {
		    		  
						currentArticle--;
						String textBoxString = originator.restoreFromMemento( caretaker.getMemento(currentArticle) );
						System.out.println(textBoxString);
		    	  }
		      }
		      else if(choice==7)
		      {
		    	  if((saveFiles - 1) > currentArticle)
		    	  {
						currentArticle++;
						String textBoxString = originator.restoreFromMemento( caretaker.getMemento(currentArticle) );
						System.out.println(textBoxString);

		    		  
		    	  }
		    	  
		      }
		      else
		      {
		      str=frontController.dispatchRequest(choice);
				originator.set(str);
				caretaker.addMemento( originator.storeInMemento() );
				saveFiles++;
				currentArticle++;
			
		      }
		      }
		      
		      
		}
}

