package com.utng.herencia;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Auto que hereda de Vehiculo *
 * 
 */
public class Auto extends Vehiculo {
	// Atrubutos de la clase
	private boolean descapotable;

	// M�todos exclusivos de la clase Auto
	public void subir() {

	}

	public void bajar() {

	}

	// M�todo que se hereda de la clase Vehiculo
	@Override
	public void caracteristicas() {
		// TODO Auto-generated method stub
		super.caracteristicas();
		System.out.println("El auto es familiar");
		
	}

}// Fin de la clase
