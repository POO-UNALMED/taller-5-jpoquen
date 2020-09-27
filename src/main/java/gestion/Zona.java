package gestion;

import java.util.*;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	//private Animal[] animales;
	private static List<Animal> animales = new ArrayList<Animal> ();
	
	public Zona(){}
	
	public Zona (String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
}
