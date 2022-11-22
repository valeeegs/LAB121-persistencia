import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		Scanner read = new Scanner(System.in);
		
		int op; 
		ArchEmpleado ae = new ArchEmpleado("empleado.dat");
		ArchRestaurante ar = new ArchRestaurante("restaurante.dat");
		do {
			System.out.println("\n               MENU");
			System.out.println("1. Crear archivo Empleado\n" 
					+ "2. Crear archivo Restaurante\n"
					+ "3. Adicionar Empleado \n"
					+ "4. Adicionar Restaurante \n"
					+ "5. Listar el archivo Empleado\n"
					+ "6. Listar el archivo Restaurante\n"
					+ "11. SALIR");
			System.out.print("Elegir la opción: ");
			op = read.nextInt();
			read.nextLine();
			
			switch(op) {
			case 1: ae.Crear();
					break;
			case 2: ar.Crear();
					break;
			case 3: Empleado td = new Empleado();
					ae.Adicionar(td);
					break;
			case 4: Restaurante tb = new Restaurante();
					ar.Adicionar(tb);
					break;
			case 5: ae.Listar();
					break;
			case 6: ar.Listar();
					break;
			case 11: System.out.println("Fin del programa");
					break;
			default: System.out.println("Escoga entre las opciones listadas");
			}
		} while(op != 11);
	}

}
