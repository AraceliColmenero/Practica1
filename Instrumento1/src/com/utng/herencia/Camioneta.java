package com.utng.herencia;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Camioneta que hereda de Vehiculo *
 * 
 */
public class Camioneta extends Vehiculo {
	// Atrubutos de la clase
	private float tara;
	private float carga;

	// Constructor
	public Camioneta() {
		// TODO Auto-generated constructor stub
	}

	// Métodos exclusivos de la clase Auto
	public void cargar(float kilos) {

	}

	// Método que se hereda de la clase Vehiculo
	@Override
	public void caracteristicas() {
		// TODO Auto-generated method stub
		super.caracteristicas();
		System.out.println("La camioneta tiene espacio oara carga");
		
	}

}// Fin de la clase
