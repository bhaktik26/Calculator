
public class Memento {
	// The article stored in memento Object
	
		private String out;

		// Save a new article String to the memento Object
		
		public Memento(String outSave) { out = outSave; }
		
		// Return the value stored in article 
		
		public String getSavedArticle() { return out; }
}
