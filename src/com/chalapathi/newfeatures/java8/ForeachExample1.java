package com.chalapathi.newfeatures.java8;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
public class ForeachExample1 {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Maggie"); 
      names.add("Michonne");
      names.add("Rick");
      names.add("Merle");
      names.add("Governor"); 
      //forEach - the output would be in any order
      System.out.println("Print using forEach");
      names.stream() 
     .filter(f->f.startsWith("M"))
     .parallel() 
     .forEach(n->System.out.println(n)); 

     /* forEachOrdered - the output would always be in this order: 
      * Maggie, Michonne, Merle 
      */ 
     System.out.println("Print using forEachOrdered"); 
     names.stream()  
     .filter(f->f.startsWith("M"))  
     .parallel() 
     .forEachOrdered(n->System.out.println(n));
     System.out.println();
     loopMapClassic();
     System.out.println();
     loopMapJava8();
     System.out.println();
     loopMapJava81();
     System.out.println();
     loopListJava82();
     
   }
   
   public static void loopMapClassic() {

	      Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put("D", 40);
	      map.put("E", 50);
	      map.put("F", 60);

	      for (Map.Entry<String, Integer> entry : map.entrySet()) {
	          System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
	      }

	  }
   
   public static void loopMapJava8() {

	      Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put(null, 40);
	      map.put("E", null);
	      map.put("F", 60);

	      // ensure map is not null
	      if (map != null) {
	          map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	      }

	  }
   
   public static void loopMapJava81() {

	      Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put(null, 40);
	      map.put("E", null);
	      map.put("F", 60);

	      map.forEach(
	          (k, v) -> {
	              // yes, we can put logic here
	              if (k != null){
	                  System.out.println("Key : " + k + ", Value : " + v);
	              }
	          }
	      );

	  }
   
   public static void loopListJava82() {

	      List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");

	      // filter null value
	      list.stream()
	              .filter(Objects::nonNull)
	              .forEach(System.out::println);

	  }
}

