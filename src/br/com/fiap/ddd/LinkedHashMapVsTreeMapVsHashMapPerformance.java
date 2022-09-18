package br.com.fiap.ddd;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapVsTreeMapVsHashMapPerformance {
	
	final static int MAX = 10000;
	public static void main(String[] args) {

		Map<String, Integer> meuLinkedHashMap = new LinkedHashMap<>();
		Map<String, Integer> meuTreeMap = new TreeMap<>();
		Map<String, Integer> meuHashMap = new HashMap<>();

		// @formatter:off
 		{
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < MAX; i++) { meuLinkedHashMap.put(i+"º", i); }
			long fim = System.currentTimeMillis();
			System.out.println("[ LinkedHashSet  ] ADD: " + (fim - inicio) + " ms");
		}
		{
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < MAX; i++) { meuTreeMap.put(i+"º", i); }
			long fim = System.currentTimeMillis();
			System.out.println("[ TreeSet               ] ADD: " + (fim - inicio)+ " ms");
		}
		{
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < MAX; i++) { meuHashMap.put(i+"º", i); }
			long fim = System.currentTimeMillis();
			System.out.println("[ HashSet              ] ADD: " + (fim - inicio)+ " ms");
		}
		
		// Continuação ....
		
			
		{
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < MAX; i++) { meuLinkedHashMap.containsValue( i);}
			long fim = System.currentTimeMillis();
			System.out.println("[ LinkedHashSet  ] CONTAINS: " + (fim - inicio) + " ms");
		}
		{
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < MAX; i++) { meuTreeMap.containsValue( i); }
			long fim = System.currentTimeMillis();
			System.out.println("[ TreeSet               ] CONTAINS: " + (fim - inicio)+ " ms");
		}
		{
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < MAX; i++) { meuHashMap.containsValue( i); }
			long fim = System.currentTimeMillis();
			System.out.println("[ HashSet              ] CONTAINS: " + (fim - inicio)+ " ms");
		}
		// @formatter:on
	}

}
