
public class TiendaDulces extends Tienda implements java.io.Serializable{
	private int nroDulces;
	private Dulce[] dulces = new Dulce[50];
	private String marca;
	
	public TiendaDulces() {
		super(2625561, "Dulcezotes", "Av Arce");
		nroDulces = 2;
		dulces[0] = new Dulce();
		dulces[1] = new Dulce("Chocolate", "70% amargo", 15, 50.2);
		marca = "Ceibo";
	}
	
	public void mostrar() {
		System.out.println("****** DATOS TIENDA DULCES ******");
		super.mostrarT();
		System.out.println("Numero de dulces: " + nroDulces);
		for(int i=0; i<nroDulces; i++) {
			dulces[i].mostrar();
		}
		System.out.println("Marca: " + marca);
		System.out.println("*********************************");
	}

	public void duplicarPrecio() {
		for(int i=0; i<nroDulces; i++) {
			dulces[i].setPrecio(dulces[i].getPrecio() * 2);
		}
	}
	
	public int getNroDulces() {
		return nroDulces;
	}

	public Dulce[] getDulces() {
		return dulces;
	}

	public String getMarca() {
		return marca;
	}
}
