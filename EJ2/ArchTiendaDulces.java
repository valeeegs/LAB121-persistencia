import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchTiendaDulces {
	private String nombreArch;
	private TiendaDulces regTiendaD;
	
	public ArchTiendaDulces(String nom) {
		nombreArch = nom;
	}
	
	public void Crear() throws FileNotFoundException, IOException{
		ObjectOutputStream archTD = new ObjectOutputStream(new FileOutputStream(nombreArch));
		archTD.close();
	}
	
	public void Adicionar(TiendaDulces X) throws IOException {
	     ObjectOutputStream archTD = null;
	        try {
	            if (!new File(nombreArch).exists()) {
	                archTD = new ObjectOutputStream(new FileOutputStream(nombreArch, true));
	            } else {
	                archTD = new AddObjectOutputStream(new FileOutputStream(nombreArch, true));
	            }

	            archTD.writeObject(X);
	        } catch (Exception e) {
	            System.out.println("Objeto añadido");
	        } finally {
	            archTD.close();
	        }
	 }
	    
	 public void Listar() throws IOException {
	        ObjectInputStream archTD = null;
	        try {
	            archTD = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	                regTiendaD = (TiendaDulces) archTD.readObject();
	                regTiendaD.mostrar();
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archTD.close();
	        }
	  }
	 
	 public void Palindromo() throws IOException {
		 ObjectInputStream archTB = null;
	        try {
	            archTB = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	            	regTiendaD = new TiendaDulces();
	                regTiendaD = (TiendaDulces) archTB.readObject();
	                if(regTiendaD.nombrePalindromo()) {
	                	regTiendaD.mostrarT();
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archTB.close();
	        }
	 }
}
