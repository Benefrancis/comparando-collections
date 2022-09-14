package br.com.fiap.ddd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetVsTreeSetVsHashSetEscrita {

	public static void main(String[] args) {

		Set<String> meuLinkedHashSet = new LinkedHashSet<>();
		Set<String> meuTreeSet = new TreeSet<>();
		Set<String> meuHashSet = new HashSet<>();

		// @formatter:off
		for (String str : Arrays.asList("Bene", "Adriano", "Diego", "Bene")) {
			meuLinkedHashSet.add(str);
			meuTreeSet.add(str);
			meuHashSet.add(str);
		}

		System.out.println("[ LinkedHashSet  ] INSERE : " + meuLinkedHashSet);
		System.out.println("[ TreeSet        ] INSERE : " + meuTreeSet);
		System.out.println("[ HashSet        ] INSERE : " + meuHashSet);
		// @formatter:on
	}

}


