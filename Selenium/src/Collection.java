

import java.util.HashSet;
import java.util.Iterator;

public class Collection {

	   public static void main(String [] args) {   
	      System.out.println( "Collection Example!\n" ); 
	      int size;
	      HashSet collection = new HashSet ();
	      String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";  
	      Iterator iterator;
	      collection.add(str1);    
	      collection.add(str2);   
	      collection.add(str3);   
	      collection.add(str4);
	      System.out.print("Collection data: ");  
	      iterator = collection.iterator();     
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      size = collection.size();
	      if (collection.isEmpty()){
	         System.out.println("Collection is empty");
	      }
	      else{
	         System.out.println( "Collection size: " + size);
	      }
	      System.out.println();
	   }
}