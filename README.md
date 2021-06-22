# grafos-dibujos
Dibujo un grafo a partir de especificaciones dentro de un archivo .txt

Los archivos .txt deberán tener la siguiente estructura:

--------------------

<text> #</text> 4 5   // 4 -> numero de nodos ;  5 -> numero de aristas, nunca olvidar el <text>  # </text>

A 1 1 //A -> nombre del nodo ; el primer 1 indica posicion en X, el segundo 1, indica posicion en Y, que son posiciones en las que queremos que se situen los nodos 

B 3 1

C 1 3

D 3 3

// Los siguientes pares de nodos indican la adyacencia de los nodos

A B

A C

A D

B D

C D

---------------------

_Precauciones: el programa es sencible a espacios entre caracteres de las lineas que especifican la posicion o adyacencia de nodos._

Cambiar el valor de la variable: archivoDescripcionGrafo que se encuentra dentro de la clase PrincipalGrafoSVG, sí se quiere leer otro archivo .txt.

Cambiar el valor de la variable: nombreArchivoSalidaSVG que se encuentra dentro de la clase PrincipalGrafoSVG si se quiere un archivo de salida .svg 
 con nombre distinto.

Los archivos de lectura deberán estar dentro de la carpeta raíz del proyecto, NO en en dentro de la carpeta src.

El archivo SVG de salida, se guardará dentro de la carpeta raíz del proyecto.

Cualquier aportacion es bienvenida.
