package zooAnimales;
import java.util.*;

import gestion.Zona;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<Mamifero> ();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	static {
		caballos = 0;
		leones = 0;
	}
	
	public Mamifero(){listado.add(this);}
	
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero){
		Mamifero nuevo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		++caballos;
		return nuevo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero nuevo = new Mamifero(nombre, edad, "selva", genero, true, 4);
		++leones;
		return nuevo;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return patas;
	}
}
