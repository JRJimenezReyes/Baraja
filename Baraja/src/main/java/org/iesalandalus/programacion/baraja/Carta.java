package org.iesalandalus.programacion.baraja;

public class Carta {
	private int numero;
	private Palo palo;
	
	private static final String[] NUMEROS_STR = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey" };
	
	public Carta(int numero, Palo palo) {
		setNumero(numero);
		setPalo(palo);
	}
	
	public int getNumero() {
		return numero;
	}
	
	private void setNumero(int numero) {
		if (numero < 1 || numero > 10) {
			throw new IllegalArgumentException("El número de una carta debe estar comprendido entre 1 y 10.");
		}
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}
	
	private void setPalo(Palo palo) {
		if (palo == null) {
			throw new IllegalArgumentException("El palo de una carta no puede estar vacío.");
		}
		this.palo = palo;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Carta)) {
			return false;
		}
		Carta other = (Carta) obj;
		return numero == other.numero && palo == other.palo;
	}

	@Override
	public String toString() {
		return NUMEROS_STR[numero - 1] + " de " + palo;
	}

}
