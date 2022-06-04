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
    public boolean offer(E e){//Añade un elemento a Queue sin sobrepasar la capacidad de la cola
        if(tope == capacidad - 1)//Evalua si no se sobrepasa la capacidad de la cola
          return false;
        Node <E> aux = new Node <E> (e, null);//se crea el nodo que almacenara del elemento
        if(this.isEmpty())//Evalua si la cola esta vacia
          this.root = aux;
        else
          this.cola.setNextNode(aux);
        this.cola = aux;
        tope++;//incrementa el contador de los elementos presentes en la cola
        return true;
    }
}
    