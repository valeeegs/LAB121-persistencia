import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchAvion {
	private String nomArch;
	private Avion regAvion;
	
	 public ArchAvion(String nom) {
	        nomArch = nom;
	    }
					 
	    public void Crear() throws FileNotFoundException, IOException {
	        ObjectOutputStream archAvi = new ObjectOutputStream(new FileOutputStream(nomArch));
	        archAvi.close();
	    }

	    public void Adicionar(Avion X) throws IOException {
	        ObjectOutputStream archAvion = null;
	        try {
	            if (!new File(nomArch).exists()) {
	                archAvion = new ObjectOutputStream(new FileOutputStream(nomArch, true));
	            } else {
	                archAvion = new AddObjectOutputStream(new FileOutputStream(nomArch, true));
	            }

	            archAvion.writeObject(X);
	        } catch (Exception e) {
	            System.out.println("Objeto añadido");
	        } finally {
	            archAvion.close();
	        }
	    }
	    
	    public void Listar() throws IOException {
	        ObjectInputStream archAvion = null;
	        try {
	            archAvion = new ObjectInputStream(new FileInputStream(nomArch));
	            while (true) {
	                regAvion = (Avion) archAvion.readObject();
	                regAvion.mostrar();
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archAvion.close();
	        }
	    }
	    
	    public void Eliminar(String matricula) throws IOException {
	        ObjectInputStream archAvi = null;
	        ObjectOutputStream archAvi2 = null;
	        try {
	            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
	            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
	            while (true) {
	                regAvion = new Avion();
	                regAvion = (Avion) archAvi.readObject();
	                if (!regAvion.getMatricula().equals(matricula)) {
	                    archAvi2.writeObject(regAvion);
	                } 
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin proceso ----");
	        } finally {
	            archAvi.close();
	            archAvi2.close();
	            File f1 = new File(nomArch);
	            f1.delete();
	            File f2 = new File("copia.dat");
	            f2.renameTo(f1);
	        }
	    }
	    
}
