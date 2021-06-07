package com.example.arvores.model;

import java.util.ArrayList;
import java.util.List;

public class BancoFake {

	private static int contador = 1;

	private static List<Arvore> arvores = new ArrayList<>();

	public static void save(Arvore arvore) {
		arvore.setId(contador);
		arvores.add(arvore);
		contador++;
	}
	public static List<Arvore> findAll(){
		return arvores;
	}

}
