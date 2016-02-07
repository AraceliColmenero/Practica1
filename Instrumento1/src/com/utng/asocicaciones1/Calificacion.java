package com.utng.asocicaciones1;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Calificacion *
 * 
 */
public class Calificacion {
	// Atribitos
	private int cal_ID;
	private String cal_descripcion;
	// Asociacion
	private ProveerdorCalificado da = new ProveerdorCalificado(null);
}
// Fin de la clase