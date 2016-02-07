package com.utng.asociaciones2;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Orden *
 * 
 */
public class Orden {
	// Atributos
	private int hora;
	private String mesero;
	// Asociaciones
	private Platillo platillo;
	private Bebida bebida;
	private Pago pago = new Pago();
	private Cliente orden = new Cliente();

	public Orden(Platillo platillo, Bebida bebida) {
		this.platillo = platillo;
		this.bebida = bebida;
		// TODO Auto-generated constructor stub
	}
}//Fin de la clase
