package com.utng.asocicaciones1;

import java.util.Date;
/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Proveedor calificado *
 * 
 */
import java.util.List;

public class ProveerdorCalificado {
	// ATRIBUTOS
	private Date fechaCalificacion;
	private int cal_ID;
	private int pr_ID;
	// Agregación
	private List<Calificacion> calificacions;

	public ProveerdorCalificado(List<Calificacion> calificacions) {
		// TODO Auto-generated constructor stub
		this.calificacions = calificacions;

	}
}
// Fin de clase