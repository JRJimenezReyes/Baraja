package org.iesalandalus.programacion.baraja;

import java.util.Random;

public class Baraja {
	
	private static final int MAX_CARTAS = 40;
	private Carta[] mazo;
	private static Random generador = new Random();
	
	public Baraja() {
		mazo = new Carta[MAX_CARTAS];
		for (int i = 0; i < 10; i++) {
			mazo[i] = new Carta(i+1, Palo.OROS);
			mazo[10 + i] = new Carta(i+1, Palo.COPAS);
			mazo[20 + i] = new Carta(i+1, Palo.ESPADAS);
			mazo[30 + i] = new Carta(i+1, Palo.BASTOS);
		}
	}
	
	public Carta getCarta(int posicion) {
		comprobarPosicion(posicion);
		return mazo[posicion];
	}
	
	private void comprobarPosicion(int posicion) {
		if (posicion < 0 || posicion >= MAX_CARTAS) {
			throw new IllegalArgumentException("La posición de la carta no es correcta.");
		}
	}
	
	private void intercambia(int pos1, int pos2) {
		comprobarPosicion(pos1);
		comprobarPosicion(pos2);
		Carta aux = mazo[pos1];
		mazo[pos1] = mazo[pos2];
		mazo[pos2] = aux;
	}
	
	public void baraja(int veces) {
		for (int i = 0; i < veces; i++) {
			int pos1 = generador.nextInt(MAX_CARTAS);
			int pos2 = generador.nextInt(MAX_CARTAS);
			intercambia(pos1, pos2);
		}
	}
}
