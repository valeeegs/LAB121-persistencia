import java.util.Scanner;

public class Tienda implements java.io.Serializable{
	private int nit;
	private String nombre, direccion;
	
	public void leer() {
		Scanner read = new Scanner(System.in);
		System.out.print("NIT: ");
		nit = read.nextInt();
		read.nextLine();
		System.out.print("Nombre: ");
		nombre = read.nextLine();
		System.out.print("Direccion: ");
		direccion = read.nextLine();
	}
	
	public void mostrar() {
		System.out.println("NIT: " + nit);
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
	}
}
