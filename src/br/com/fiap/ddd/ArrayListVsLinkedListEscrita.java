package br.com.fiap.ddd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListEscrita {

	public static void main(String[] args) {

		List<String> meuArrayList = new ArrayList<>();
		List<String> meuLinkedList = new LinkedList<>();

		for (String str : Arrays.asList("Bene", "Adriano", "Diego", "Bene")) {
			meuArrayList.add(str);
			meuLinkedList.add(str);
		}

		System.out.println("[ ArrayList  ] INSERE : " + meuArrayList);
		System.out.println("[ LinkedList ] INSERE : " + meuLinkedList);
	}

}
