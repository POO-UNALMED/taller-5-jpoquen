package gestion;
import java.util.*;
import zooAnimales.Animal;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	//private Zona[] zona;
	private List<Zona> zona = new ArrayList<Zona> ();
	
	public Zoologico(){}
	
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zone) {
		zona.add(zone);
	}
	
	public int cantidadTotalAnimales() {
		int acum = 0;
		
		for (int i = 0; i < zona.size(); i++) {
			acum += zona.get(i).cantidadAnimales();
		}
		
		return acum;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public List<Zona> getZona() {
		return zona;
		
	}
	
	
}
