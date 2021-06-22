package grafoSVG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Archivo {

	public static int numeroNodos = 0;
	public static int numeroAristas = 0;
	public static ArrayList<NodosUbicacion> nodosU = new ArrayList<>();
	public static ArrayList<AristasUbicacion> aristasU = new ArrayList<>();
	private static int sepX = 10;
	private static int sepY = 24;

	public static void leerArchivo(String archivo) throws IOException {
		String cadena;
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);// lee el archivo una linea entera y no caracter por caracter

		while ((cadena = br.readLine()) != null) {
			System.out.print(cadena + "\n");
			if (!cadena.isEmpty()) {
				
				if (cadena.charAt(0) == '#') {
					numeroNodos = Integer.parseInt(cadena.charAt(2) + "");
					numeroAristas = Integer.parseInt(cadena.charAt(4) + "");
					System.out.println("numero nodos: " + numeroNodos + " numero aristas: " + numeroAristas);
				}

				String letra = cadena.charAt(0) + "";
				Pattern pat = Pattern.compile("^[A-Z].*");
				Matcher mat = pat.matcher(cadena);
				
				if (mat.matches() && cadena.length() > 4) { // si son ubicaciones de los nodos
					String nombre = cadena.charAt(0) + "";
					int coordX = Integer.parseInt(cadena.charAt(2) + "");
					int coordY = Integer.parseInt(cadena.charAt(4) + "");
					nodosU.add(new NodosUbicacion(nombre, coordX, coordY));
					System.out.println("Coordenadas: " + cadena.charAt(0) + " x: " + coordX + " y: " + coordY);
					
				} else if (mat.matches()) {// Para validar que sean las instrucciones de union
					String nodoOrigen = cadena.charAt(0) + "";
					String nodoDestino = cadena.charAt(2) + "";
					System.out.println("El nodo: " + nodoOrigen + " Conecta al nodo: " + nodoDestino);

					for (int i = 0; i < numeroNodos; i++) {
						if (nodosU.get(i).getNombre().equals(nodoOrigen)) { // busca a el nodo origen de la arista

							for (int j = 0; j < numeroNodos; ++j) {

								// esto no funciona si hay mas de un destino que tiene origen en A
								if (nodosU.get(j).getNombre().equals(nodoDestino)) { // Busca el nodo destino de la
																						// arista

									//// ******************************posOrigenX, posOrigenY, posDestinoX,
									//// posDestinoY
									aristasU.add(new AristasUbicacion(nodosU.get(i).getX(), nodosU.get(i).getY(),
											nodosU.get(j).getX(), nodosU.get(j).getY()));

									j = numeroNodos;
									i = numeroNodos;
								}

							}
						}

					}

				}
			}
		}
		br.close();
	}

	public static void escribirArchivo(String nombreArchivo, int numeroNodos, int numeroAristas) {
		int radioCircle = 25;
		try (FileWriter fw = new FileWriter(nombreArchivo + ".svg", false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);) {
			out.println("<?xml version=\"1.0\" standalone=\"no\"?>");
			// more code
			out.println("<svg width=\"100%\" height=\"100%\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">");
			out.println("<rect width=\"100%\" height=\"100%\" fill=\"#202020\"/>");
//			Dibuja las aristas
			out.println("<g stroke=\"#87CEFA\" stroke-width=\"5\">");
			for (AristasUbicacion arista : aristasU) {
				out.println(" <line x1=\"" + (sepX * arista.getPosicionOrigenX()) + "%\" y1=\""
						+ (sepY * arista.getPosicionOrigenY()) + "%\" x2=\"" + (sepX * arista.getPosicionDestinoX())
						+ "%\" y2=\"" + (sepY * arista.getPosicionDetinoY()) + "%\"/>");
			}
			out.println("</g> ");

//			dibuja los nodos
			out.println("<g fill=\"#FFD700\">");
			for (NodosUbicacion nodo : nodosU) {
				out.println("<circle cx=\" " + (sepX * nodo.getX()) + "%\" cy=\" " + (sepY * nodo.getY()) + "%\" r=\" "
						+ radioCircle + " \"/> ");
			}
			out.println("</g>");

//			dibuja nombre de los nodos
			out.println("<g fill=\"#000000\" font-size=\"30\" text-anchor=\"middle\">");
			for (NodosUbicacion nodo : nodosU) {
				out.println("<text x=\"" + (sepX * nodo.getX()) + "%\" y=\"" + (sepY * nodo.getY()) + "%\" dy=\".3em\">"
						+ nodo.getNombre() + "</text> ");
			}

			out.println("</g> ");
			out.println("</svg> ");
			// more code
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}
	}
}
