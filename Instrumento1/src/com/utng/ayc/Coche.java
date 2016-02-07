package com.utng.ayc;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Coche *
 * 
 */
public class Coche {

	// Asociacion
	private Motor m;

	public Coche(Motor m) {
		this.m = m;
	}

	// Metodo asignar conductor
	public void asignaConductor(Persona maneja) {
		maneja = new Persona("");
	}

	// Metodos del coche
	public void enciende() {

	}

	public void acelera() {

	}

	public void apaga() {

	}

	public void frena() {

	}

	public boolean estaEncendido() {
		return true;
	}
}
