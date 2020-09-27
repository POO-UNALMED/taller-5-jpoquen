package zooAnimales;

import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(){}
	
	public Animal ( String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		++totalAnimales;
	}
	
	public String movimiento() { return "desplazarse"; }
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() +
				"\nAves: " + Ave.cantidadAves() + 
				"\nReptiles: " + Reptil.cantidadReptiles() +
				"\nPeces: " + Pez.cantidadPeces() +
				"\nAnfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + ", y mi genero es " + genero;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return zona;
	}
	
}
