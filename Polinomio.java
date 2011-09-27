//package calcupol;
import java.io.*;
import java.util.Vector;
import java.lang.String;



/**
 *
 * @author Gonzalo Pico
 */
public class Polinomio {

  // Vector de Terminos: polinomio.
  private Vector <Termino> terminos;


/*                                    
 * Crea un polinomio CAMBIO
 */
public Polinomio(){



 terminos = new Vector<Termino>();
}

Vector <Termino> getTerminos(){
	return this.terminos;
}


/**
 *
 * agrega un termino al polinomio, teniendo en cuenta repetidos.
 */
public void addTermPolinomio(int v, int e){
}


/**
 *
 * busca termino con el exponente pasado como parametro, sino se encuentra retorna -1.
 */
public int buscarTerm(int e){
 // Implementa Equipo I(Rojo)
return 0;
}



/**
 *
 * verPolinomio(): muestra el polinomio por la consola.
 */

public void verPolinomio(){
    
}

/**
 * makePolinomioFromFile() permite crear un polinomio a partir de un archivo de
 * texto.El nombre del archivo es pasado como parametro.
 * El formato del archivo debe contener un termino por linea, por ej. El archivo
 *  -45 6
 *   -3 2
 *    0 8
 *                           6       2      8
 *  creara el polinomio -45.X  -  3.X  + 0.X
 * 
 */
public void makePolinomioFromFile(String arch){
}

/**
 * ordenar: Deberá ordenar de mayor a menor el polinomio utilizando bubble sort
 */   
public void ordenar()
{
//  Implementa Equipo II(Azul)
return;
}

/**
 * completa un polinomio desde max exponente a 1.
 */
public void completar(){
	
 // Implementa Equipo I(Rojo)
return;
}


/**
  * Revisa si el polinomio esta ordenado
 */	
public boolean estaOrdenado() {
 // Implementa Equipo I(Rojo)
}
	
/**
  *	retorna grado del polinomio
 */ 	
public int grado()
{
 // Implementa Equipo II(Azul)

return 0;
}

/**
  *	simplifica un polinomio: Saca terminos con valor 0.
 */ 	
public void simplificar()
{
 // Implementa Equipo I(Rojo)
}
}
