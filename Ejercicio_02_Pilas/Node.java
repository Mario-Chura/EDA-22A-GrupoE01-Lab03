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
}