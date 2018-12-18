package org.iesalandalus.programacion.baraja;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	public static void main(String[] args) {
		Baraja barajaSinBarajar;
		Baraja barajaBarajada;
		barajaSinBarajar = new Baraja();
		barajaBarajada = new Baraja();
		int veces;
		
		do {
			System.out.print("Dime el número de veces que quieres barajar: ");
			veces = Entrada.entero();
		} while (veces < 0);
		
		barajaBarajada.baraja(veces);
		
		int coincidencias = 0;
		for (int i = 0; i < 40; i++) {
			Carta cartaBarajada = barajaBarajada.getCarta(i);
			Carta cartaSinBarajar = barajaSinBarajar.getCarta(i);
			if (cartaBarajada.equals(cartaSinBarajar)) {
				System.out.printf("La carta: %s, no se ha movido%n", cartaBarajada.toString());
				coincidencias++;
			}	
		}
		System.out.printf("No se han movido %d cartas", coincidencias);
	}

}
