package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal{

	//private static Ave[] listado;
	private static List<Ave> listado = new ArrayList<Ave> ();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(){}
	
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}
	
	public static int cantidadAves() {
		//int total = halcones + aguilas;
		//return total;
		return listado.size();
	}
	
	public String movimiento() { return "volar"; }
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave nuevo = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		++halcones;
		listado.add(nuevo);
		return nuevo;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave nuevo = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		++aguilas;
		listado.add(nuevo);
		return nuevo;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

}
