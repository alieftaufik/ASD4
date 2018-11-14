	import java.util.Hashtable;
	import java.util.Enumeration;

	public class HashtableSearching {
	 
	 public static void main(String[] args) {
	 
	   Enumeration names;
	   String key;
	 
	   Hashtable<String, String> hashtable = new Hashtable<String, String>();
	 
	
	   hashtable.put("Key1","alief");
	   hashtable.put("Key2","taufik");
	   hashtable.put("Key3","qadri");
	   hashtable.put("Key4","amin");
	   hashtable.put("Key5","abdi");
	 
	   names = hashtable.keys();
	   while(names.hasMoreElements()) {
	      key = (String) names.nextElement();
	      System.out.println("Key: " +key+ " & Value: " +
	      hashtable.get(key));
	   }
	 }
	}

