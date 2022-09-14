package br.com.fiap.ddd;
// Java program to demonstrate difference between

// HashSet, LinkedHashSet and TreeSet according
// to insertion order and insertion time

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class GFG1 {
	
	public final static int MAX = 10000;
	
	//@formatter:off
    // Function show insertion order of LinkedHashSet, TreeSet and HashSet
    private static void insertionOrder(){
        
    	LinkedHashSet<String> geekLinkSet = new LinkedHashSet<>();
        TreeSet<String> geekTreeSet = new TreeSet<>();
        HashSet<String> geekHashSet = new HashSet<String>();
 
        // Add three object in LinkedHashSet and TreeSet
        for (String str : Arrays.asList("Geek2", "Geek1", "Geek3", "Geek1")) {
            geekLinkSet.add(str);
            geekTreeSet.add(str);
            geekHashSet.add(str);
        }
 
        // should be sorted order HashSet stores element in sorted order
        System.out.println("Insertion Order of objects in HashSet : "+ geekHashSet);
 
        // insertion order or elements LinkedHashSet storeds elements as insertion
        System.out.println("Insertion Order of objects in LinkedHashSet : " + geekLinkSet);
 
        // should be sorted order TreeSet stores element in sorted order
        System.out.println("Insertion Order of objects in TreeSet : " +geekTreeSet);
    }
 
    // Function calculate insertion time of 1000 objects of LinkedHashSet, TreeSet and HashSet 
    private static void insertionTime(){
    	
        // HashSet performance Test inserting 1000 elements
        HashSet<Integer> numbersHS = new HashSet<>();
        long startTime = System.nanoTime();
        
        for (int i = 0; i < MAX; i++) {
            numbersHS.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Total time to insert "+MAX+" elements in HashSet in nanoseconds : "+ (endTime - startTime));
 
        // LinkedHashSet performance Test inserting 1000 elements
        LinkedHashSet<Integer> numbersLLS = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) { numbersLLS.add(i); }
        endTime = System.nanoTime();
        System.out.println("Total time to insert "+MAX+" elements in LinkedHashSet nanoseconds : " + (endTime - startTime));
 
        // TreeSet performance Test inserting 1000 objects
        TreeSet<Integer> numbersTS = new TreeSet<>();
 
        startTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) { numbersTS.add(i); }
        endTime = System.nanoTime();
        System.out.println("Total time to insert "+MAX+" elements in TreeSet in nanoseconds : " + (endTime - startTime));
    }
 
    // Function calculate deletion time of objects LinkedHashSet, TreeSet and HashSet Deletion time always vary
    private static void deletion()
    {
        // HashSet performance Test inserting and deletion 1000 elements
        HashSet<Integer> deletionHS = new HashSet<>();
        for (int i = 0; i < MAX; i++) { deletionHS.add(i); }
 
        long startingTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) { deletionHS.remove(i); }
 
        long endedTime = System.nanoTime();
        System.out.println("Total time to Deletion "+MAX+" elements in HashSet in nanoseconds : " + Math.abs(startingTime - endedTime));
 
        // LinkedHashSet  performance Test inserting and deletion elements
        LinkedHashSet<Integer> deletionLLS = new LinkedHashSet<>();
 
        for (int i = 0; i < MAX; i++) { deletionLLS.add(i); }
        
        startingTime = System.nanoTime();
        
        for (int i = 0; i < MAX; i++) { deletionLLS.remove(i); }
 
        endedTime = System.nanoTime();
        System.out.println("Total time to Deletion "+MAX+" elements in LinkedHashSet in nanoseconds : " + Math.abs(startingTime - endedTime));
 
        // TreeSet performance Test inserting and deletion elements
        TreeSet<Integer> deletionTS = new TreeSet<>();
 
        for (int i = 0; i < MAX; i++) { deletionTS.add(i); }
 
        startingTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) { deletionTS.remove(i); }
 
        endedTime = System.nanoTime();
        System.out.println("Total time to Deletion "+MAX+" elements in TreeSet in nanoseconds : "+ Math.abs(startingTime - endedTime));
    
        //@formatter: on
    }
 
    public static void main(String args[]){
        insertionOrder();
        insertionTime();
        deletion();
    }
}