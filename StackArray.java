public class StackArray <E> implements Stack<E>{
    private int tope;
    private E[ ] array;

    public StackArray(int n){
        this.array = (E[]) new Object[n];
        this.tope = -1;
        private int sumOut=0;
    }
    public void push(E x){
        if(this.tope < this.array.length - 1){
            this.array[++this.tope] = x;
        }else{
            System.out.println("Stack esta lleno");
        }
    }
    public boolean isEmpty (){
        return this.tope == -1;
        
    }
    public E pop() throws ExceptionIsEmpty{
        if(isEmpty()){
            throw new ExceptionIsEmpty("Stack esta vacio...");
        }
        E out = this.array[this.tope];
        this.tope--;
        return out;
    }
    public E top() throws ExceptionIsEmpty{
        if(isEmpty()){
           throw new ExceptionIsEmpty("Stack esta vacio..."); 
        }
        E item = this.array[this.tope];
        return item;
    }
    public String toString(){
        String str="";
        for(int i=0;i<=this.tope;i++){
            str += this.array[i]+", ";
        }
        return str;
    }
    public int summationStack(){
        int suma =0;
        for(int i=0;i<this.tope;i++){
            suma+=(Integer)this.array[i];
        }
        return suma;
    }
}
