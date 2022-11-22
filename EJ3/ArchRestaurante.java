import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchRestaurante {
	private String nombreArch;
	private Restaurante regRes;
	
	public ArchRestaurante(String nom) {
		nombreArch = nom;
	}
	
	public void Crear() throws FileNotFoundException, IOException{
		ObjectOutputStream archRes = new ObjectOutputStream(new FileOutputStream(nombreArch));
		archRes.close();
	}
	
	public void Adicionar(Restaurante X) throws IOException {
	     ObjectOutputStream archRes = null;
	        try {
	            if (!new File(nombreArch).exists()) {
	                archRes = new ObjectOutputStream(new FileOutputStream(nombreArch, true));
	            } else {
	                archRes = new AddObjectOutputStream(new FileOutputStream(nombreArch, true));
	            }

	            archRes.writeObject(X);
	        } catch (Exception e) {
	            System.out.println("Objeto añadido");
	        } finally {
	            archRes.close();
	        }
	 }
	    
	 public void Listar() throws IOException {
	        ObjectInputStream archRes = null;
	        try {
	            archRes = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	                regRes = (Restaurante) archRes.readObject();
	                regRes.mostrar();
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archRes.close();
	        }
	  }
}
