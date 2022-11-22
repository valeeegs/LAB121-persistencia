
public class Dulce implements java.io.Serializable{
	private String tipo, sabor;
	private int precio;
	private double peso;
	
	public Dulce() {
		tipo = "Paleta";
		sabor = "Dulce de leche";
		precio = 1;
		peso = 5.7;
	}
	
	public Dulce(String tipo, String sabor, int precio, double peso) {
		this.tipo = tipo;
		this.sabor = sabor;
		this.precio = precio;
		this.peso = peso;
	}
	
	public void mostrar() {
		System.out.println("\t--- DULCE ---");
		System.out.println("\tTipo: " + tipo);
		System.out.println("\tSabor: " + sabor);
		System.out.println("\tPrecio: " + precio);
		System.out.println("\tPeso: " + peso);
		System.out.println("\t-------------");
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
