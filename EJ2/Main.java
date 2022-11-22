
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		Scanner read =  new Scanner(System.in);
		
		int op;
		ArchTiendaDulces atd = new ArchTiendaDulces("tiendaDulces.dat");
		ArchTiendaBebidas atb = new ArchTiendaBebidas("tiendaBebidas.dat");
		do {
			System.out.println("\n               MENU");
			System.out.println("a) Implementar los métodos crear, adicionar y listar \n"
					+ "de ArchTiendaDulces y ArchTiendaBebidas.\n"
					+ "1. Crear archivo Tienda Dulces\n" 
					+ "2. Crear archivo Tienda Bebidas\n"
					+ "3. Adicionar Tienda Dulces \n"
					+ "4. Adicionar Tienda Bebidas \n"
					+ "5. Listar el archivo Tienda Dulces\n"
					+ "6. Listar el archivo Tienda Bebidas\n"
					+ "7. b) Listar las bebidas que tengan un precio menor o \n"
					+ "igual a X, de las tiendas de bebidas que tengan como \n"
					+ "NIT a un número primo.\r\n" 
					+ "8. c) Mostrar el NIT, nombre y dirección de las tiendas de \n"
					+ "dulces y bebidas que tengan nombre palíndromo.\r\n" 
					+ "9. d) Eliminar todas las bebidas con litros múltiplos de X, \n"
					+ "de todas las tiendas de bebidas.\r\n"  
					+ "10. e) Duplicar el precio de cada dulce de todas \n"
					+ "las tiendas de dulces\n"
					+ "11. SALIR");
			System.out.print("Elegir la opción: ");
			op = read.nextInt();
			read.nextLine();
			
			switch(op) {
			case 1: atd.Crear();
					break;
			case 2: atb.Crear();
					break;
			case 3: TiendaDulces td = new TiendaDulces();
					atd.Adicionar(td);
					break;
			case 4: TiendaBebidas tb = new TiendaBebidas();
					atb.Adicionar(tb);
					break;
			case 5: atd.Listar();
					break;
			case 6: atb.Listar();
					break;
			case 7: int price;
					System.out.print("Ingrese el precio: ");
					price = read.nextInt();
					read.nextLine();
					atb.LowerPrice(price);
					break;
			case 8: atd.Palindromo();
					atb.Palindromo();
					break;
			case 9: int multi;
					System.out.print("Ingrese el número a buscar múltiplo: ");
					multi = read.nextInt();
					read.nextLine();
					atb.multiplosL(multi);
					break;
			case 10: atd.DuplicatePrice();
					break;
			case 11: System.out.println("Fin del programa");
					break;
			default: System.out.println("Escoga entre las opciones listadas");
			}
		} while(op != 11);
	}

}
