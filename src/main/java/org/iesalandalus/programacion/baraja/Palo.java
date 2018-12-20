package org.iesalandalus.programacion.baraja;

public enum Palo {
	OROS, COPAS, ESPADAS, BASTOS;
	
	@Override
	public String toString() {
		return this.name().charAt(0) + this.name().substring(1).toLowerCase();
	}
}
