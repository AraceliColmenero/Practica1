package com.utng.asociaciones2;

import java.util.Date;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Credito *
 * 
 */
public class Credito extends Pago {
	// Atributos
	private int numeroTdeCredito;
	private String tipo;
	private Date fechaDeExp;
	private String nombre;
	
	public boolean hacerCargo(double total){
		return false;
	}
}
