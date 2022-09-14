package br.com.fiap.ddd;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetVsTreeSetVsHashSetPerformance {

	final static int MAX = 100000;

	public static void main(String[] args) {

		Set<Integer> meuLinkedHashSet = new LinkedHashSet<>();
		Set<Integer> meuTreeSet = new TreeSet<Integer>();
		Set<Integer> meuHashSet = new HashSet<Integer>();

		// @formatter:off
 		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuLinkedHashSet.add(i); }
			long fim = System.nanoTime();
			System.out.println("[ LinkedHashSet  ] ADD: " + (fim - inicio) + " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuTreeSet.add(i); }
			long fim = System.nanoTime();
			System.out.println("[ TreeSet        ] ADD: " + (fim - inicio)+ " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuHashSet.add(i); }
			long fim = System.nanoTime();
			System.out.println("[ HashSet        ] ADD: " + (fim - inicio)+ " ns");
		}
		
		// Continuação ....
		
			
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuLinkedHashSet.contains(i); }
			long fim = System.nanoTime();
			System.out.println("[ LinkedHashSet  ] CONTAINS: " + (fim - inicio) + " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuTreeSet.contains(i); }
			long fim = System.nanoTime();
			System.out.println("[ TreeSet        ] CONTAINS: " + (fim - inicio)+ " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuHashSet.contains(i); }
			long fim = System.nanoTime();
			System.out.println("[ HashSet        ] CONTAINS: " + (fim - inicio)+ " ns");
		}
		// @formatter:on
	}

}


