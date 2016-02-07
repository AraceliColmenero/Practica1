package com.utng.asocicaciones1;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Proveedor *
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Proveedor {

	// Atributos
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private Short pr_telefono2;
	private Short pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;

	// Agregación
	private List<Rubro> rubros;
	private Direccion direccion;
	// Asociacion
	private Precios da = new Precios();
	private List<Articulo> necesita = new ArrayList<Articulo>();
	// Asociacion
	private Calificacion tiene = new Calificacion();

	public Proveedor(List<Rubro> rubros, Direccion direccion) {
		this.rubros = rubros;
		this.direccion = direccion;
		// TODO Auto-generated constructor stub
	}
}
// Fin de la clase
