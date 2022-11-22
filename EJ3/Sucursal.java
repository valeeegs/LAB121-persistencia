
public class Sucursal implements java.io.Serializable{
	private String ubicacion;
	private int nroEmpleados, nroPedidoR, nroPedidoA;
	private Empleado[] empleados = new Empleado[100];
	private PedidoReserva[] pedidosR = new PedidoReserva[100];
	private PedidoApp[] pedidosA = new PedidoApp[100];
	
	public Sucursal(String ubicacion) {
		this.ubicacion = ubicacion;
		nroEmpleados = 3;
		empleados[0] = new Empleado();
		empleados[1] = new Empleado("Giselle Gomez", 213215, "Cajera");
		empleados[2] = new Empleado("Justin Bieber", 316141, "Chef");
		nroPedidoR = 2;
		pedidosR[0] = new PedidoReserva(1212852, "Jennie Kim", 15);
		pedidosR[1] = new PedidoReserva(5215156, "Michael Jackson", 20);
		nroPedidoA = 1;
		pedidosA[0] = new PedidoApp(421312, "Michelle Jobs", 30);
	}
	
	public void mostrar() {
		System.out.println("++++++++ DATOS SUCURSAL ++++++++");
		System.out.println("Ubicación: " + ubicacion);
		System.out.println("Nro empleados: " + nroEmpleados);
		for(int i=0; i<nroEmpleados; i++) {
			empleados[i].mostrar();
		}
		System.out.println("Nro pedidos reserva: " + nroPedidoR);
		for(int i=0; i<nroPedidoR; i++) {
			pedidosR[i].mostrar();
		}
		System.out.println("Nro pedidos app: " + nroPedidoA);
		for(int i=0; i<nroPedidoA; i++) {
			pedidosA[i].mostrar();
		}
		System.out.println("++++++++++++++++++++++++++++++++");
	}
	
	
}
