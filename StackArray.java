public class StackArray<E>{
    private int tope;
    private E[ ] array;

    public StackArray(int n){
        this.array = (E[ ]) new Object[n];
        this.tope = -1;
    }
    public void push(E x){
        if(this.tope < this.array.length-1){
            this.array[++this.tope] = x;
        }else{
            System.out.println("Stack esta lleno");
        }
    }
    public boolean isEmpty (){
        return this.tope == -1;
        
    }
    public E top() throws ExceptionIsEmpty{
        if(isEmpty()){
           throw new ExceptionIsEmpty("Stack esta vacio..."); 
        }
        E item = this.array[this.tope];
        return item;
    }



}
