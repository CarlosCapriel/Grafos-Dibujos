package grafoSVG;

import java.io.IOException;

public class PrincipalGrafoSVG {
	public static void main(String[] args) {
		
		String archivoDescripcionGrafo = "grafo1";
		String nombreArchivoSalidaSVG = "grafo2";
		
		try {
			Archivo.leerArchivo(archivoDescripcionGrafo + ".txt");
			Archivo.escribirArchivo(nombreArchivoSalidaSVG, Archivo.numeroNodos, Archivo.numeroAristas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
