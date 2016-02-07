package com.utng.asocicaciones1;

import java.util.Date;
/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Pedido *
 * 
 */
import java.util.List;

public class Pedido {
	// Atributos
	private double pe_id;
	private Date pe_fechaPedido;
	private Date pe_fechaNecesidad;
	private Date pe_fechaProgramada;
	private Date pe_fechaEntrega;
	private int pe_estado;
	// Agregación
	private List<Articulo> contacts;

	public Pedido(List<Articulo> contacts) {
		this.contacts = contacts;
		// TODO Auto-generated constructor stub
	}
}// Fin de la clase
