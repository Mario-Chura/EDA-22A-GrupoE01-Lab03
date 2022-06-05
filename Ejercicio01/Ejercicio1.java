import java.util.*;
public class Ejercicio1{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t1,t2,t3;
        System.out.print("Ingrese tamaño de la pila-1: ");
        t1=sc.nextInt();
        System.out.print("Ingrese tamaño de la pila-2: ");
        t2=sc.nextInt();
        System.out.print("Ingrese tamaño de la pila-3: ");
        t3=sc.nextInt();

        StackArray<Integer> pila1 = new StackArray<Integer>(t1);
        StackArray<Integer> pila2 = new StackArray<Integer>(t2);
        StackArray<Integer> pila3 = new StackArray<Integer>(t3);
        try{
            System.out.println("PILA-1");
            pushElements(pila1, t1);
            System.out.println("Lista pila-1");
            System.out.println(pila1);
            System.out.println("PILA-2");
            pushElements(pila2, t2);
            System.out.println("Lista pila-2");
            System.out.println(pila2);
            System.out.println("PILA-3");
            pushElements(pila3, t3);
            System.out.println("Lista pila-3");
            System.out.println(pila3);            

            System.out.println("-------Sumas Iniciales--------------");
            System.out.println("suma pila 1: "+pila1.summationStack());
            System.out.println("suma pila 2: "+pila2.summationStack());
            System.out.println("suma pila 3: "+pila3.summationStack());
            System.out.println("------------------");
            int valor = equalStack(pila1, pila2, pila3);
            System.out.println("Altura de las pilas igualadas:"+valor);

        }catch(ExceptionIsEmpty x){
            System.out.println(x.getMessage());
        }
            
        
    }
    public static int equalStack(StackArray h1,StackArray h2,StackArray h3)throws ExceptionIsEmpty{
        int altura=0;
        int s1,s2,s3;        
        boolean cond=true;
        StackArray may;
        while(cond){            
            mayorStack(h1,h2,h3).pop();
            System.out.println("suma p1:"+h1.summationStack());
            System.out.println("suma p2:"+h2.summationStack());
            System.out.println("suma p3:"+h3.summationStack());
            System.out.println("--------------");
            s1=h1.summationStack();
            s2=h2.summationStack();
            s3=h3.summationStack();
            if(s1 == s2 && s1 == s3){
                cond=false;
            }
        }
        altura = h1.summationStack();//los 3 tendran la misma altura
        return altura;
    }
    public static StackArray mayorStack(StackArray h1,StackArray h2,StackArray h3) {
        int s1 = h1.summationStack();
        int s2 = h2.summationStack();
        int s3 = h3.summationStack();
        if(s1>s2){
            if(s1>s3){
                return h1;
            }else{
                return h3;
            }
        }else if(s2>s3){
            return h2;
        }else{
            return h3;
        }
    }
    public static void pushElements(StackArray h,int t){
        Scanner sc = new Scanner(System.in);
        int n;
        for(int i=0;i<t;i++){
            System.out.println("Ingrese valor: ");
            n=sc.nextInt();
            h.push(n);
        }
         
     }
 
}
