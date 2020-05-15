package archivosEL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivos {
	
	public static void main(String[] args) {
		
		File file = new File ("Hola Mundo.txt");//Carga el archivo
		
		try {
			FileReader reader = new FileReader(file); //Se prepara para la lectura del archivo
			BufferedReader br = new BufferedReader(reader); //Se carga en el buffer para su manipulación
			String line = "";
			
			while((line = br.readLine()) != null){ //Se leen las lineas hasta el final del documento
				System.out.println(line);
			}
			
			br.close(); //Se cierra el buffer
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			
		}
		
		
	}

}
