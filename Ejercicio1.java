public class Ejercicio1{
    public static void main(String[] args){
        Stack<Integer> pila = new StackArray<Integer>(6);
        try{
            pila.push(12);
            System.out.println("Tope: "+pila.top());
            pila.push(14);
            System.out.println("Tope: "+pila.top());
            pila.push(20);
            System.out.println("Tope: "+pila.top());
            pila.push(30);
            System.out.println("Tope: "+pila.top());

        }catch(ExceptionIsEmpty x){
            System.out.println(x.getMessage());
        }
            
        
    }


}
