package Ejercicio_02_Pilas;
import java.util.*;

public class pila {
    //Atributos
	
	private Node<T> root;
	private int conteo;

    	//Constructor
	
	public pila() {
		this.conteo = 0;
	}

    //Metodos
	
	// Se devolvera verdadero si la pila tiene cero elementos
	public boolean empty() {
		return(conteo == 0);
	}

    //Vaciamos toda la pila al declarar que root es igual a null
	public void vaciar() {
		root = null;
		conteo = 0;
	}
}
