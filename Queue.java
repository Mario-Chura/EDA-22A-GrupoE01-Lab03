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
    public boolean add(E e){//Funciona igual que offer() con la diferencia que muestra un mensaje de limite maximo alcanzado
        if(offer(e))//Si el elemento es añadido exitosamente devuelve true
          return true;
        else{//caso contratrio que la cola este llena mostrara un mensaje
          System.out.println("Limite maximo alcanzado");
          return false;//y se retornara false
        }
      }
     //peek() : Recupera, pero no elimina, la cabeza de esta cola, o devuelve null si esta cola está vacía.
     public E peek(){
        if(this.isEmpty())
          return null;
        return this.root.getData();
      }
    //element(): Este método difiere de peek() sólo en que lanza un mensaje si esta cola está vacía.
    public E element(){
        if(this.peek() != null)
          return this.root.getData();
        else{
          System.out.println("La cola esta vacia");
          return null;
        }
      }
}
    