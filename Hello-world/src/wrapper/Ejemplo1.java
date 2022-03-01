package wrapper;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ejemplo1 {
	
	public Ejemplo1() {
		
	}
	
	
	void wrapper() {		
		
		/*
		 * Set<Character> vocales = new HashSet<Character>();
		 * vocales.add(Character.valueOf('a')); vocales.add('e'); vocales.add('i');
		 * vocales.add('o'); vocales.add('u');
		 * 
		 * Integer sentidoDeLaVida = Integer.valueOf(42); System.out.println(
		 * sentidoDeLaVida); funcion1( sentidoDeLaVida );
		 * 
		 * int a = 42; Integer tracender = Integer.valueOf(sentidoDeLaVida.intValue() +
		 * 1);
		 * 
		 * Integer tracender1 = sentidoDeLaVida +1 ;
		 */
		
		List<Integer> listaDeEnteros = new LinkedList();
		
		System.out.println(listaDeEnteros );
		
		listaDeEnteros.add(42);
		
		System.out.println(listaDeEnteros);
		
	}
	
	void funcion1( Integer a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Ejemplo1 e1 = new Ejemplo1();
		
	}
}
