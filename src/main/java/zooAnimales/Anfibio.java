package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
 	
	public Anfibio(){}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		
	}
	
	public static int cantidadAnfibios() {
		int total = ranas + salamandras;
		return total;
	}
	
	public String movimiento() { return "saltar"; }
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio nuevo = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		++ranas;
		listado[listado.length] = nuevo;
		return nuevo;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio nuevo = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		++salamandras;
		listado[listado.length] = nuevo;
		return nuevo;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
}
