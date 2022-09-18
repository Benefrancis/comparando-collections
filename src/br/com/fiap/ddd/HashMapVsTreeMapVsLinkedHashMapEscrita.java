package br.com.fiap.ddd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapVsTreeMapVsLinkedHashMapEscrita {

	public static void main(String[] args) {

		Map<String, Aluno> meuLinkedHashSet = new LinkedHashMap<>();
		Map<String, Aluno> meuTreeMap = new TreeMap<>();
		Map<String, Aluno> meuHashMap = new HashMap<>();

		Aluno a = new Aluno("Bene", "Linux básico", 0);
		Aluno b = new Aluno("Adriano", "OpenOffice", 0);
		Aluno c = new Aluno("Diego", "Internet", 0);
		Aluno d = new Aluno("Bene", "OpenOffice", 0);

		for (Aluno aluno : Arrays.asList(c, b, a, d)) {
			meuLinkedHashSet.put(aluno.getNome(), aluno);
			meuTreeMap.put(aluno.getNome(), aluno);
			meuHashMap.put(aluno.getNome(), aluno);
		}
		// @formatter:off
		System.out.println("[ LinkedHashMap  ] INSERE : " + meuLinkedHashSet.keySet());
		System.out.println("[ TreeMap               ] INSERE : " + meuTreeMap.keySet());
		System.out.println("[ HashMap              ] INSERE : " + meuHashMap.keySet());
		// @formatter:on
	}
}

