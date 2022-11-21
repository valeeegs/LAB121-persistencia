
public class TiendaBebidas extends Tienda implements java.io.Serializable{
	private int nroBebidas;
	private Bebida[] bebidas = new Bebida[50];
	private String regSanitario;
	
	public TiendaBebidas() {
		super(104683, "Fresh", "Calle 15");
		nroBebidas = 2;
		bebidas[0] = new Bebida();
		bebidas[1] = new Bebida("Coca Cola", "Fanta", 12, 3);
		regSanitario = "ADDF-7152";
	}
	
	public void mostrar() {
		System.out.println("****** DATOS TIENDA BEBIDAS ******");
		super.mostrarT();
		System.out.println("Nro de Bebidas: " + nroBebidas);
		for(int i=0; i<nroBebidas; i++) {
			bebidas[i].mostrar();
		}
		System.out.println("Registro sanitario: " + regSanitario);
		System.out.println("**********************************");
	}
	
	public boolean NITprimo() {
		if(nit%2 == 0) {return false;}
		for(int i=2; i<(nit/2); i++) {
			if(nit % i ==0) {
				return false;
			}
		}
		return true;
	}

	public int getNroBebidas() {
		return nroBebidas;
	}

	public Bebida[] getBebidas() {
		return bebidas;
	}

	public String getRegSanitario() {
		return regSanitario;
	}
	
}
