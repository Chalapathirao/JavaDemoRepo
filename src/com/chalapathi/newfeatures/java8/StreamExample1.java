package com.chalapathi.newfeatures.java8;
//finding String length lessthan 6

import java.util.ArrayList;
import java.util.List;
public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Adityaerty");
        names.add("Steveee");
        int count = 0;
        for (String str : names) {
            if (str.length() < 6)
                count++;
        }
        System.out.println("There are " + count + " strings with length less than 6");
        //In the first example, we are iterating the whole list to find the strings with
        //length less than 6. There is no parallelism in this code.
        long count1 = names.stream().filter(str -> str.length() < 6).count();
        System.out.println("There are "+count1+" strings with length less than 6");
//		In the second example, the stream() method returns a stream of all the names, the filter() method
//		returns another stream of names with length less than 6, the count() method reduces
//		this stream to the result. All these operations are happening parallelly which means
//		we are able to parallelize the code with the help of streams
    }
}
