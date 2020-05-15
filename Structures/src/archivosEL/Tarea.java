package archivosEL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Tarea {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader filein = new BufferedReader(new FileReader("Entrada.txt"));
		// Objeto para escritura de archivos
		PrintWriter fileout = new PrintWriter(new FileWriter("test.out"));
		// Objeto String para almacenar lineas
		String line;

		while ((line = filein.readLine()) != null) {
			// Objeto para partir las lineas segun el token
			StringTokenizer st = new StringTokenizer(line);
			// Variable donde quedaran sumados los nums
			long sum = 0;

			// Recorrido de todos los tokens de una linea
			while (st.hasMoreElements()) {
				sum += Integer.parseInt(st.nextToken());
			}

			// Escritura de la suma de los numeros en el archivo
			fileout.println(sum);
			System.out.println(sum);

		}
		// Envio todos los stream al archivo
		fileout.flush();
		// Cierre del archivo
		fileout.close();

	}

}
