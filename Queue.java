public class Queue<E> {
    private Node <E> root;//Nodo de cabeza
    private Node <E> cola;//Nodo final de la cola
    private final int capacidad;//Capacidad de la cola
    private int tope = -1;//cuenta el numero de elementos actuales

    public Queue(int n){
      this.root = null;
      this.cola = null;
      this.capacidad = n;
    }
}