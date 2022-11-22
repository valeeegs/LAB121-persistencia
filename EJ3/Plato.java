
public class Plato implements java.io.Serializable{
	private String nombre;
	private double precio;
	private int tiempoPreparacion;
	
	public Plato(String nombre, double precio, int tiempoPreparacion) {
		this.nombre = nombre;
		this.precio = precio;
		this.tiempoPreparacion = tiempoPreparacion;
	}
	
	public void mostrar() {
		System.out.println("\t----- DATOS PLATOS -----");
		System.out.println("\tNombre: " + nombre);
		System.out.println("\tPrecio: " + precio);
		System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " min");
		System.out.println("\t------------------------");
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
}
