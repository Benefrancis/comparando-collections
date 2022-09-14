package br.com.fiap.ddd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListPerformance {

	final static int MAX = 100000;

	public static void main(String[] args) {

		List<Integer> meuArrayList = new ArrayList<>();
		List<Integer> meuLinkedList = new LinkedList<>();

		// @formatter:off
 		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuArrayList.add(i); }
			long fim = System.nanoTime();
			System.out.println("[ ArrayList  ] ADD: " + (fim - inicio) + " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuLinkedList.add(i); }
			long fim = System.nanoTime();
			System.out.println("[ LinkedList ] ADD: " + (fim - inicio)+ " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuArrayList.contains(i); }
			long fim = System.nanoTime();
			System.out.println("[ ArrayList  ] CONTAINS: " + (fim - inicio) + " ns");
		}
		{
			long inicio = System.nanoTime();
			for (int i = 0; i < MAX; i++) { meuLinkedList.contains(i); }
			long fim = System.nanoTime();
			System.out.println("[ LinkedList ] CONTAINS: " + (fim - inicio)+ " ns");
		}
		// @formatter:on
	}
}
