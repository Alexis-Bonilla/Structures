package Serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        FileInputStream fileInStr = null;
        ObjectInputStream entrada = null;
        Persona p;

        try {

        	fileInStr = new FileInputStream("archivos/personas.dat");
            entrada = new ObjectInputStream(fileInStr);
           
            p = (Persona) entrada.readObject(); 
            System.out.println(p.getId() + " " + p.getNombre() + " " + p.getEdad());
           
            p = (Persona) entrada.readObject();
            System.out.println(p.getId() + " " + p.getNombre() + " " + p.getEdad());
            
            p = (Persona) entrada.readObject();
            System.out.println(p.getId() + " " + p.getNombre() + " " + p.getEdad());
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileInStr != null) {
                	fileInStr.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

	}

}
