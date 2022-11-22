
public class PedidoReserva extends Pedido implements java.io.Serializable{
	private int horaLlegada;
	
	public PedidoReserva(int ciCliente, String nombreCliente, int horaLlegada) {
		super(ciCliente, nombreCliente);
		this.horaLlegada = horaLlegada;
	}
	
	
	public void mostrar() {
		System.out.println("\t------ DATOS PEDIDO RESERVA ------");
		System.out.println("\tHora llegada: " + horaLlegada);
		System.out.println("\t------------------------------");
	}

	public int getHoraLlegada() {
		return horaLlegada;
	}
}
