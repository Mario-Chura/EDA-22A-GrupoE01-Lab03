package Ejercicio_02_Pilas;

public class Prueba_Pila {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==> Apilamos 10 numeros del 1 al 10");
		pila<Integer> pilanum = new pila<Integer>();
		for (int i = 1; i <=10; i++) {
			pilanum.apilar(new Integer(i));
		}
		System.out.println(pilanum);

        System.out.println("==> Desapilamos el ultimo en ingresar");
		pilanum.desapilar();
		System.out.println(pilanum);

        System.out.println("==> Preguntamos si esta vacia la pila");
		System.out.println(pilanum.empty());

        System.out.println("==> Preguntamos cual es el primer numero en la pila");
		System.out.println(pilanum.primero());

        System.out.println("==> Vaciamos la pila");
		pilanum.vaciar();
		System.out.println(pilanum);
    }
}
