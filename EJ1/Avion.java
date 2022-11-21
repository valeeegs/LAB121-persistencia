import java.util.Scanner;

public class Avion implements java.io.Serializable{
	private String matricula, origen, destino, horaSalida, piloto;
	
	public Avion(){
		matricula = "235-CVF";
		origen = "La Paz";
		destino = "Cochabamba";
		horaSalida = "16:30";
		piloto = "Alex";
	}
	
	public void leer(){
		Scanner read = new Scanner(System.in);
		System.out.println("INGRESE LOS DATOS DEL AVIÓN");
		System.out.print("Matricula: ");
		matricula = read.nextLine();
		System.out.print("Origen: ");
		origen = read.nextLine();
		System.out.print("Destino: ");
		destino = read.nextLine();
		System.out.print("Hora de Salida: ");
		horaSalida = read.nextLine();
		System.out.print("Piloto: ");
		piloto = read.nextLine();
	}

	public void mostrar(){
		System.out.println("----- DATOS DEL AVIÓN -----");
		System.out.println("Matricula: " + matricula);
		System.out.println("Origen: " + origen);
		System.out.println("Destino: " + destino);
		System.out.println("Hora de Salida: " + horaSalida);
		System.out.println("Piloto: " + piloto);
		System.out.println("---------------------------");
	}
	
	public String getMatricula() {
		return matricula;
	}
}
