public class Ejercicio1{
    public static void main(String[] args){
        StackArray<Integer> pila1 = new StackArray<Integer>(6);
        StackArray<Integer> pila2 = new StackArray<Integer>(6);
        StackArray<Integer> pila3 = new StackArray<Integer>(6);
        try{
            pila1.push(1);
            pila1.push(1);
            pila1.push(1);
            pila1.push(2);
            pila1.push(3);
            System.out.println(pila1);
            //
            pila2.push(2);
            pila2.push(3);
            pila2.push(4);
            System.out.println(pila2);
            //
            pila3.push(1);
            pila3.push(4);
            pila3.push(1);
            pila3.push(1);
            System.out.println(pila3);

            System.out.println("Sumas Iniciales");
            System.out.println("suma pila 1: "+pila1.summationStack());
            System.out.println("suma pila 2: "+pila2.summationStack());
            System.out.println("suma pila 3: "+pila3.summationStack());
            System.out.println("------------------");
            int valor = equalStack(pila1, pila2, pila3);
            pila1.top();
            System.out.println("valor:"+valor);

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




}
