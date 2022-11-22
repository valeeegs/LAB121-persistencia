
public class PedidoApp extends Pedido implements java.io.Serializable{
	private int descuento;
	
	public PedidoApp(int ciCliente, String nombreCliente, int descuento) {
		super(ciCliente, nombreCliente);
		this.descuento = descuento;
	}
	
	public void mostrar() {
		System.out.println("\t------ DATOS PEDIDO APP ------");
		System.out.println("\tDescuento: " + descuento);
		System.out.println("\t------------------------------");
	}

	public int getDescuento() {
		return descuento;
	}
}
