package com.utng.asocicaciones1;

/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Articulo *
 * 
 */
import java.util.List;

public class Articulo {
	// Atributos de la clase
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadCritica;
	private double art_cantidadMinima;

	// Agregación
	private List<Rubro> rubros;
	// Asociacion
	private Precios tiene = new Precios();

	public Articulo(List<Rubro> rubros) {
		this.rubros = rubros;
		// TODO Auto-generated constructor stub
	}

}
// Fin de la clase