
public class Pedido implements java.io.Serializable{
	protected String nombreCliente;
	protected int ciCliente, nroPlatos;
	protected Plato[] platos = new Plato[100];
	
	public Pedido(int ciCliente, String nombreCliente) {
		this.ciCliente = ciCliente;
		this.nombreCliente = nombreCliente;
		this.nroPlatos = 0;
	}
	
	public void addPlato(Plato P) {
		platos[nroPlatos] = P;
		nroPlatos ++;
	}
	
	public void mostrar() {
		System.out.println("\tCI: " + ciCliente);
		System.out.println("\tNombre: " + nombreCliente);
		System.out.println("\tNro Platos: " + nroPlatos);
		for(int i=0; i<nroPlatos; i++) {
			System.out.println("\t\tPlato " + (i+1) + ": " + platos[i]);
		}
	}

	public int getCiCliente() {
		return ciCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public int getNroPlatos() {
		return nroPlatos;
	}

	public Plato[] getPlatos() {
		return platos;
	}
}