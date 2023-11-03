package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		int i = 0;
		int j = 1;
		int[] arrayInts = {1, 5, 10, -2};
		ArrayList<String> listStrings = new ArrayList<String>();
		Persona per1 = new Persona("A", 27, 1.8);
		//Persona per2 = per1;
		Persona per2 = new Persona("A", 27, 1.8);
		
		if (i == j) {
			System.out.println("i y j son iguales");
		}

		if (per1 == per2) {
			System.out.println("Las personas son iguales");
		}

		for (int x = 1; x <= 10; x++) {
			System.out.println(x);
		}

		for (int x = 0; x < arrayInts.length; x++) {
			System.out.println(arrayInts[x]);
		}

		for (int elemento : arrayInts) {
			System.out.println(elemento);
		}

		listStrings.add("Elemento1");
		listStrings.add("Elemento2");
		listStrings.add(1, "Elemento1-2");
		System.out.println(listStrings.get(0));
	}
	public static void saludar(){
		System.out.println("Hola!! Ten un lindo dia");
	}
}
