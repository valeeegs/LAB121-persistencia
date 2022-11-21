import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		Scanner read = new Scanner(System.in);
		
		int op; 
		ArchAvion a = new ArchAvion("avion.dat");
		
		do {
			System.out.println("\nMen� archivo avi�n");
			System.out.println("1. a) Crear el archivo \n"
					+ "2. b) Adicionar 3 objetos Avion al archivo \n"
					+ "3. c) Listar el archivo \n" 
					+ "4. d) Eliminar al avion con matricula M. \n"
					+ "5. SALIR");
			System.out.print("Elegir la opci�n: ");
			op = read.nextInt();
			read.nextLine();
			
			switch(op) {
				case 1: a.Crear();
						break;
				case 2: Avion av = new Avion();
						av.leer();
						a.Adicionar(av);
						break;
				case 3: a.Listar();
						break;
				case 4: System.out.print("Ingrese la matr�cula del avi�n a eliminar: ");
						String matricula; matricula = read.nextLine();
						a.Eliminar(matricula);
						break;
				case 5: System.out.println("FIN DEL PROGRAMA");
						break;
			}
		} while (op != 5);
	}

}
