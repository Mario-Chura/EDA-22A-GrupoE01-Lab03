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

    //Para insertar un elemento usamos el atributo root el cual es de tipo generico
	public void apilar( T dato ) {
		this.root = new Node<T>(dato , this.root);
		this.conteo++;
	}

    //Este metodo extrae el primer elemento de la pila si es que esta llena
    public T desapilar () {
		if ( empty()) {
			throw new NoSuchElementException("La Pila esta vacia");
		}
		T dato = root.getDato();
		root = root.getsiguiente();
		conteo--;
		if(conteo == 0) {
			vaciar();
		}
		return dato;
	}

    //Este metodo me devuelve el primer elemento de la pila si es que esta llena
    public T primero () {
		if ( empty()) {
			throw new NoSuchElementException("La Pila esta vacia");
		}
		T dato = root.getDato();
		return dato;
	}

    public String toString() {
		StringBuilder sb = new StringBuilder ();
		sb.append("[");
		if ( empty ()) {
			sb.append("]");
		} else {
			Node<T> recorrer = root;
			while (recorrer != null) {
				sb.append(recorrer.getDato() + ((recorrer.getsiguiente() != null)?", ":"]"));
				recorrer = recorrer.getsiguiente();
			}
		}
		return sb.toString();
	}
}
