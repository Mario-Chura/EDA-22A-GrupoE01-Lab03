public class StackArray<E>{
    private int tope;
    private E[ ] array;

    public StackArray(int n){
        this.array = (E[ ]) new Object[n];
        this.tope = -1;
    }
}
