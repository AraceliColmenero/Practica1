package com.utng.herencia;
/**
 * * @author Araceli Colmenero * Ultima revision: Febrero 2016
 * 
 * * Declaracion de la Clase Test *
 * 
 */
import java.util.Scanner;

public class Test {

	// Método test 
	
	public static void main(String[] args) {
		Vehiculo vehiculo;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Teclea el auto que deces");
		System.out.println("1: Auto");
		System.out.println("2: Camioneta");
		int seleccion = scaner.nextInt();

		switch (seleccion) {
		case 1:
			vehiculo= new Auto();
			vehiculo.caracteristicas();
			break;
		case 2:
			vehiculo= new Camioneta();
			vehiculo.caracteristicas();
			break;
		
		default:
			break;
		}

	}

}
