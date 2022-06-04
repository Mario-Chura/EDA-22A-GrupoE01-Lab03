public class Test{
  public static void main(String [] args){
    Queue <Integer> lista = new Queue<>(3);

    lista.add(15);
    System.out.println(lista.getCola());// 15
    lista.add(20);
    System.out.println(lista.getCola());// 20
    lista.add(25);
    System.out.println(lista.getCola());// 25
    lista.add(30);//No se añada a la cola retornando el mensaje correspondiente
    lista.remove();//elimina el 15
    System.out.println(lista.element());// 20
    lista.remove();//elimina el 20
    System.out.println(lista.element());// 25
    lista.remove();//elimina el 25
    lista.element();//No existe nodo de cabeza en la cola por lo que muestra el mensaje correspondiente
    lista.remove();//No es posible eliminar elementos ya que la cola esta vacia asi que muestra el mensaje correspondiente
  }
}
