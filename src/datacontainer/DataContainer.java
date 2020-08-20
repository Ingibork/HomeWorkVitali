package datacontainer;

import java.util.Arrays;
import java.util.Comparator;


public class DataContainer<T> {
    private T[] array;
    private int count = 0;

    public DataContainer(T[] initArr) {
        array = initArr;
    }

    //"набивка" массива
    public int add(T item) {
        count++;
        if (count > array.length) {
            System.out.println("Произошло увеличение массива на одну ячейку");
            array = Arrays.copyOf(array, array.length + 1);
            int index = array.length - 1;
            array[index] = item;
            return index;
        }

        int index = count - 1;
        array[index] = item;
        return index;
    }

    //получение элемента исходя из индекса массива
    public T getIndex(int index) {
        return array[index];
    }

    //получение поля array (массива)
    public T[] getItems() {
        return array;
    }

    //удаление ячейки массива по индексу
    public boolean deleteByIndex(int index) {
        if (index <= array.length - 1) {
            array[index] = null;
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
            return true;
        }
        return false;
    }

    //удаление ячейки массива исходя из введенного элемента
    boolean deleteByItem(T item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                array[i] = null;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array = Arrays.copyOf(array, array.length - 1);
                return true;
            }
        }
        return false;
    }

    //сортировка
    public static <T> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {
        Arrays.sort(dataContainer.getItems(), comparator);
    }

}
