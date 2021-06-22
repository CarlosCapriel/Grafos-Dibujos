# grafos-dibujos
Dibujo un grafo a partir de especificaciones dentro de un archivo .txt

Los archivos deberan tener la siguiente estructura:

//Inicio Documento
<text> # </text> 4 5 // 4 -> numero de nodos ; 5 -> numero de aristas, nunca olvidar el <text>  # </text>

A 1 1 //A -> nombre del nodo ; el primer 1 indica posicion en X, el segundo 1, indica posicion en Y
B 3 1
C 1 3
D 3 3
// Los siguientes pares de nodos indican la adyacencia de los nodos
A B
A C
A D
B D
C D
//Fin Documento
---------------------
Precauciones: el programa es sencible a espacios entre caracteres de las lineas que especifican la posicion o adyacencia de nodos.

Cambiar el valor de la varible: archivoDescripcionGrafo ; que se encuentra dentro de la clase PrincipalGrafoSVG.
Cambiar el valor de la variable: nombreArchivoSalidaSVG ; que se encuentra dentro de la clase PrincipalGrafoSVG si se quiere un archivo de salida .svg 
con nombre distinto.

Los archivos de lectura deberán estar dentro de la carpeta raiz del proyecto, NO en en dentro de la carpeta src.
El archivo SVG de sálida, se guardara dentro de la carpeta raiz del proyecto.

Cualquier aportacion es bienvenida.
