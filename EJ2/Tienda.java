import java.util.Scanner;

public class Tienda implements java.io.Serializable{
	protected int nit;
	protected String nombre, direccion;
	
	public Tienda(int nit, String nombre, String direccion) {
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
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
	
	public void mostrarT() {
		System.out.println("NIT: " + nit);
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
	}
	
	public boolean nombrePalindromo() {
		int inicio = 0;
		int fin = nombre.length() - 1;
		while(inicio < fin){
            if(nombre.charAt(inicio)!= nombre.charAt(fin)){
                return false;
            }
        inicio++;
        fin--;
        } return true;
	}
}