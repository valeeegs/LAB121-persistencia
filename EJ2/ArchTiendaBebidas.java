import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchTiendaBebidas {
	private String nombreArch;
	private TiendaBebidas regTiendaB;
	
	public ArchTiendaBebidas(String nom) {
		nombreArch = nom;
	}
	
	public void Crear() throws FileNotFoundException, IOException{
		ObjectOutputStream archTB = new ObjectOutputStream(new FileOutputStream(nombreArch));
		archTB.close();
	}
	
	public void Adicionar(TiendaBebidas X) throws IOException {
	     ObjectOutputStream archTB = null;
	        try {
	            if (!new File(nombreArch).exists()) {
	                archTB = new ObjectOutputStream(new FileOutputStream(nombreArch, true));
	            } else {
	                archTB = new AddObjectOutputStream(new FileOutputStream(nombreArch, true));
	            }

	            archTB.writeObject(X);
	        } catch (Exception e) {
	            System.out.println("Objeto añadido");
	        } finally {
	            archTB.close();
	        }
	 }
	    
	 public void Listar() throws IOException {
	        ObjectInputStream archTB = null;
	        try {
	            archTB = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	                regTiendaB = (TiendaBebidas) archTB.readObject();
	                regTiendaB.mostrar();
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archTB.close();
	        }
	  }
	 
	 public void LowerPrice(int price) throws IOException {
		 ObjectInputStream archTB = null;
	        try {
	            archTB = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	            	regTiendaB = new TiendaBebidas();
	                regTiendaB = (TiendaBebidas) archTB.readObject();
	                for(int i=0; i<regTiendaB.getNroBebidas(); i++) {
	                	if(price >= regTiendaB.getBebidas()[i].getPrecio() && regTiendaB.NITprimo()) {
	                		regTiendaB.getBebidas()[i].mostrar();
	                	}
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archTB.close();
	        }
	 }
	 
	 public void Palindromo() throws IOException {
		 ObjectInputStream archTB = null;
	        try {
	            archTB = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	            	regTiendaB = new TiendaBebidas();
	                regTiendaB = (TiendaBebidas) archTB.readObject();
	                if(regTiendaB.nombrePalindromo()) {
	                	regTiendaB.mostrarT();
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archTB.close();
	        }
	 }
	 
	 public void multiplosL(int X) throws IOException{
		 ObjectInputStream archTB = null;
	        ObjectOutputStream archTB2 = null;
	        try {
	            archTB = new ObjectInputStream(new FileInputStream(nombreArch));
	            archTB2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
	            while (true) {
	            	regTiendaB = new TiendaBebidas();
	                regTiendaB = (TiendaBebidas) archTB.readObject();
	                ////////////////////////////////////////////////////////// SDFGHJKJHGFDSADFGHJKLKJHGFDSASDFGHJK
	            }
	        } catch (Exception e) {
	            System.out.println("----  Se elimino las Bebidas multiplos de  X ----");
	        } finally {
	            archTB.close();
	            archTB2.close();
	            File f1 = new File(nombreArch);
	            f1.delete();
	            File f2 = new File("copia.dat");
	            f2.renameTo(f1);
	        }
	 }
	 
}
