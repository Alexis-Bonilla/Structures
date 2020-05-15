package Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class Principal {
	public static void main(String[] args) {

	FileOutputStream fileOutS = null;
	ObjectOutputStream salida = null;
	Persona laPersona = null;

	try
	{
		
		fileOutS = new FileOutputStream("archivos/personas.dat");
		salida = new ObjectOutputStream(fileOutS);
		
		laPersona = new Persona("123456", "Amy Farrah Fowler", 31);		
		salida.writeObject(laPersona);
		
		laPersona = new Persona("654321", "Howard Wolowitz", 28);		
		salida.writeObject(laPersona);
		
		laPersona = new Persona("798654", "Bernadtte Rosten", 35);		
		salida.writeObject(laPersona);

	}catch(FileNotFoundException e)
	{
		System.out.println(e.getMessage());
	}catch(IOException e)
	{
		System.out.println(e.getMessage());
	}finally
	{
		try {
			if (laPersona != null)
				fileOutS.close();
			if (salida != null)
				salida.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
}


