package br.com.fiap.ddd;

import java.util.Arrays;
import java.util.HashSet;

public class Hs {
	public static void main(String[] args) {

		HashSet<String> meuHashSet = new HashSet<>();

		for (String str : Arrays.asList("Bene", "Adriano", "Diego", "Bene")) {
			meuHashSet.add(str);
		}

		
		System.out.println("testando inserção de elementos: " + meuHashSet);

	}
}
