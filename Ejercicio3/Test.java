public class Test{
  public static void main(String [] args){
    Queue <Integer> lista = new Queue<>(3);

    		System.out.println("==> Añadiendo valores a la cola <==");
 		lista.add(15);
		System.out.println(lista.getCola());// 15
		lista.add(20);
		System.out.println(lista.getCola());// 20
		lista.add(25);
		System.out.println(lista.getCola());// 25
		System.out.println("==> Agregamos un elemento mas a la cola superando el limite <==");
		lista.add(30);//No se añada a la cola retornando el mensaje correspondiente
		System.out.println("==> Removemos elemento de la cola <==");
		lista.remove();//elimina el 15
		System.out.println("==> Llamamos a la nodo de la cola  <==");
		System.out.println(lista.element());// 20
		System.out.println("==> Removemos elemento de la cola <==");
		lista.remove();//elimina el 20
		System.out.println("==> Llamamos a la nodo de la cola  <==");
		System.out.println(lista.element());// 25
		System.out.println("==> Removemos elemento de la cola <==");
		lista.remove();//elimina el 25
		System.out.println("==> Llamamos a nodo cola, como esta vacia sale el sig. mensaje <==");
		lista.element();//No existe nodo de cabeza en la cola por lo que muestra el mensaje correspondiente
		System.out.println("==> Eliminamos elementos, como esta vacia sale el sig. mensaje <==");
		lista.remove();//No es posible eliminar elementos ya que la cola esta vacia asi que muestra el mensaje correspondiente
  }
}
