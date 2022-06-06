package Ejercicio_02_Pilas;

public class Node <T> {
	private T dato;
	private Node<T> siguiente;
// Metodos constructores

public Node(T data, Node<T> siguiente){
    this.dato = data;
    this.siguiente = siguiente;
}
public Node(T data){
    this(data, null);
}
public Node(){
    this(null, null);
}

// Metodos setter y getter
	
public Node<T> getsiguiente(){
    return this.siguiente;
}

public void setsiguiente(Node<T> siguiente){
    this.siguiente = siguiente;
}

public T getDato() {
    return this.dato;
}
public void setDato(T dato){
    this.dato = dato;
}

// Imprimir
public String toString(){
    if(dato != null)
        return dato.toString();
    else
        return null;
}
}