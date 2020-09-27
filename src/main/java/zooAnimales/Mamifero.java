package zooAnimales;

public class Mamifero extends Animal {
	static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	static {
		caballos = 0;
		leones = 0;
	}
	
	public Mamifero(){}
	
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		int total = caballos + leones;
		return total;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero){
		Mamifero nuevo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		++caballos;
		listado[listado.length] = nuevo;
		return nuevo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero nuevo = new Mamifero(nombre, edad, "selva", genero, true, 4);
		++leones;
		listado[listado.length] = nuevo;
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
