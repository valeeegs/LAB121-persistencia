
public class Bebida implements java.io.Serializable{
	private String marca, nombre;
	private int precio, litros;
	
	public Bebida() {
		marca = "Coca Cola";
		nombre = "Sprite";
		precio = 12;
		litros = 3;
	}
	
	public Bebida(String marca, String nombre, int precio, int litros) {
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
		this.litros = litros;
	}
	
	public void mostrar() {
		System.out.println("\t----- DATOS BEBIDA -----");
		System.out.println("\tMarca: " + marca);
		System.out.println("\tNombre: " + nombre);
		System.out.println("\tPrecio: " + precio);
		System.out.println("\tLitros: " + litros);
		System.out.println("\t------------------------");
	}

	public String getMarca() {
		return marca;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getLitros() {
		return litros;
	}
}
