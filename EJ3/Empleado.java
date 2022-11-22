
public class Empleado implements java.io.Serializable{
	private String nombre, puesto, horario;
	private int ci, nroDiasTrabajo, nroEmpSupervisar;
	private String[] diasTrabajar = new String[7];
	private Empleado[] empSupervisados = new Empleado[100];
	
	public Empleado() {
		nombre = "Karina Mendes";
		ci = 132153;
		puesto = "Manager";
		nroDiasTrabajo = 6;
		diasTrabajar[0] = "Lunes"; diasTrabajar[1] = "Martes"; diasTrabajar[2] = "Miércoles";
		diasTrabajar[3] = "Jueves"; diasTrabajar[4] = "Viernes"; diasTrabajar[5] = "Feriado";
		horario = "10:00 - 18:00";
		nroEmpSupervisar = 2;
		empSupervisados[0] = new Empleado("Giselle Gomez", 213215, "Cajera");
		empSupervisados[1] = new Empleado("Justin Bieber", 316141, "Chef");
	}
	
	public Empleado(String nombre, int ci, String puesto) {
		this.nombre = nombre;
		this.ci = ci;
		this.puesto = puesto;
		nroDiasTrabajo = 5;
		diasTrabajar[0] = "Lunes"; diasTrabajar[1] = "Martes"; diasTrabajar[2] = "Miércoles";
		diasTrabajar[3] = "Jueves"; diasTrabajar[4] = "Viernes"; 
		horario = "8:00 - 16:00";
		nroEmpSupervisar = 0;
	}
	
	public void mostrar(){
		System.out.println("\t----- DATOS EMPLEADO -----");
		System.out.println("\tNombre: " + nombre);
		System.out.println("\tCI: " + ci);
		System.out.println("\tPuesto: " + puesto);
		System.out.println("\tNro días de trabajo: " + nroDiasTrabajo);
		System.out.print("\t");
		for(int i=0; i<nroDiasTrabajo-1; i++) {
			System.out.print( diasTrabajar[i] + " - ");
		} System.out.print(diasTrabajar[nroDiasTrabajo-1] + "\n");
		System.out.println("\tHorario: " + horario);
		System.out.println("\tNro empleados a supervisar: " + nroEmpSupervisar);
		for(int i=0; i<nroEmpSupervisar; i++) {
			System.out.println("\t\tNombre: " + empSupervisados[i].getNombre());
			System.out.println("\t\tPuesto: " + empSupervisados[i].getPuesto());
		}
		System.out.println("\t--------------------------");
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getHorario() {
		return horario;
	}

	public int getCi() {
		return ci;
	}

	public int getNroDiasTrabajo() {
		return nroDiasTrabajo;
	}

	public int getNroEmpSupervisar() {
		return nroEmpSupervisar;
	}

	public String[] getDiasTrabajar() {
		return diasTrabajar;
	}

	public Empleado[] getEmpSupervisados() {
		return empSupervisados;
	}
	
}
