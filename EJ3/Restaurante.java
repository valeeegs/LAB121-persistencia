
public class Restaurante {
	private String nombre;
	private int nroSucursales, nroPlatosMenu;
	private Sucursal[] sucursales = new Sucursal[50];
	private Plato[] platos = new Plato[100];
	
	public Restaurante() {
		nombre = "Rick's place";
		nroSucursales = 2;
		sucursales[0] = new Sucursal("Av Arce");
		sucursales[1] = new Sucursal("Av Camacho");
		nroPlatosMenu = 3;
		platos[0] = new Plato("Choripan", 8.50, 5);
		platos[1] = new Plato("Pizza", 80, 80);
		platos[2] = new Plato("Silpancho", 12.50, 20);
	}
	
	public void mostrar() {
		System.out.println("******* DATOS RESTAURANTE *******");
		System.out.println("Nombre: " + nombre);
		System.out.println("Nro Sucursales: " + nroSucursales);
		for(int i=0; i<nroSucursales; i++){
			sucursales[i].mostrar();
		}
		System.out.println("Nro platos: " + nroPlatosMenu);
		for(int i=0; i<nroPlatosMenu; i++){
			platos[i].mostrar(); 
		}
		System.out.println("*********************************");
	}
} 
