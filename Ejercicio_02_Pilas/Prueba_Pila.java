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
}
