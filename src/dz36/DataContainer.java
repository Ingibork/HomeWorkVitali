package dz36;

public class DataContainer<T> {
    private T[] data;

    public void add(T item){
        this.data[0] = item;
    }
}
