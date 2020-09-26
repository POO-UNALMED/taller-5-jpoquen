package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(){}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public static int cantidadReptiles() {
		int total = iguanas + serpientes;
		return total;
	}
	
	public String movimiento() { return "reptar"; }
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil nuevo = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		++iguanas;
		listado[listado.length] = nuevo;
		return nuevo;
		
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil nuevo = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		++serpientes;
		listado[listado.length] = nuevo;
		return nuevo;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
}
