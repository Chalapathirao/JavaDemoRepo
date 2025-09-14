package com.chalapathi.newfeatures.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTraverseAllMethodsExample {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		
		System.out.println("1 ------------Iterating by list index -------------");
		for (int i = 0; i < gamesList.size(); i++) {
			System.out.println(gamesList.get(i));
		}
		
		System.out.println("2 ------------Iterating by for each loop--------------");
		for (String game : gamesList) {
			System.out.println(game);
		}
		
		System.out.println("3 ------------Iterating by Iterator loopping--------------");
		for (Iterator iterator = gamesList.iterator(); iterator.hasNext();) {
			String game = (String) iterator.next();
			System.out.println(game);
		}
		
		System.out.println("4 ------------Iterating by List Iterator --------------");
		ListIterator<String> listIterator = gamesList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
		
		System.out.println("5 ------------Iterating by passing lambda expression--------------");
		gamesList.forEach(games -> {
			System.out.println(games);
		});
		
		System.out.println("6 ------------Iterating by streams -------------");
		gamesList.stream().forEach((gamesTemp) -> System.out.println(gamesTemp));
		
		System.out.println("7 ------------Iterating by method reference -------------");
		gamesList.forEach(System.out::println);  
		
		System.out.println("8 ------------Iterating by forEachRemaining method  -------------");
		Iterator<String> itr = gamesList.iterator();
		itr.forEachRemaining(games -> System.out.println(games));

	}
}