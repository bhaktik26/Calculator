
public class Originator {
	private String out;

	// Sets the value for the article
	
	public void set(String newOut) { 
		System.out.println("Current operation\n"+newOut+ "\n");
	    this.out = newOut; 
	}

	// Creates a new Memento with a new article
	
	public Memento storeInMemento() { 
	    System.out.println("Saving to Memento");
	    return new Memento(out); 
	}
	   
	// Gets the article currently stored in memento
	
	public String restoreFromMemento(Memento memento) {
		   
		out = memento.getSavedArticle(); 
	       
		System.out.println("Previous operation Saved in Memento\n"+out + "\n");
		
		return out;
	   
	}
	
}
