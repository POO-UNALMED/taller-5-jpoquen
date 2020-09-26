package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(){}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public static int cantidadPeces() {
		int total = salmones + bacalaos;
		return total;
	}
	
	public String movimiento() { return "nadar"; }
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez nuevo = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		++salmones;
		listado[listado.length] = nuevo;
		return nuevo;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez nuevo = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		++bacalaos;
		listado[listado.length] = nuevo;
		return nuevo;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
}
