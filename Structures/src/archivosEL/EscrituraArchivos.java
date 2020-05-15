package archivosEL;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File ("Hola Munda.txt");//Creación del archivo 
		try {
			FileWriter fw = new FileWriter(file); //Lo cargamos para su escritura
			BufferedWriter bw = new BufferedWriter(fw); //Lo pasamos por buffer para su manipulación
			bw.append("XDE", 0,3);
			bw.write("Hola jedi!");
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
