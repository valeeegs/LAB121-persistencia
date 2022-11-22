import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchEmpleado {
	private String nombreArch;
	private Empleado regEmp;
	
	public ArchEmpleado(String nom) {
		nombreArch = nom;
	}
	
	public void Crear() throws FileNotFoundException, IOException{
		ObjectOutputStream archEmp = new ObjectOutputStream(new FileOutputStream(nombreArch));
		archEmp.close();
	}
	
	public void Adicionar(Empleado X) throws IOException {
	     ObjectOutputStream archEmp = null;
	        try {
	            if (!new File(nombreArch).exists()) {
	                archEmp = new ObjectOutputStream(new FileOutputStream(nombreArch, true));
	            } else {
	                archEmp = new AddObjectOutputStream(new FileOutputStream(nombreArch, true));
	            }

	            archEmp.writeObject(X);
	        } catch (Exception e) {
	            System.out.println("Objeto añadido");
	        } finally {
	            archEmp.close();
	        }
	 }
	    
	 public void Listar() throws IOException {
	        ObjectInputStream archEmp = null;
	        try {
	            archEmp = new ObjectInputStream(new FileInputStream(nombreArch));
	            while (true) {
	                regEmp = (Empleado) archEmp.readObject();
	                regEmp.mostrar();
	            }
	        } catch (Exception e) {
	            System.out.println("----  Fin del Listado!!  ----");
	        } finally {
	            archEmp.close();
	        }
	  }
}
