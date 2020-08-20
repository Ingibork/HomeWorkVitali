package datacontainer;
import java.util.Comparator;
import java.util.Arrays;

public class MainData {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[3]);
        System.out.println(dataContainer.add(14));
        System.out.println(dataContainer.add(26));
        System.out.println(dataContainer.add(57));
        System.out.println(dataContainer.add(4));
        System.out.println(dataContainer.add(5));
        System.out.println(dataContainer.add(8));

        System.out.println("Под индексом 3: " + dataContainer.getIndex(3));

        for (Integer s : dataContainer.getItems()) {
            System.out.print("|" + s);
        }

        System.out.println();

        System.out.println(dataContainer.deleteByIndex(2));

        for (Integer s : dataContainer.getItems()) {
            System.out.print("|" + s);
        }

        System.out.println();

        System.out.println(dataContainer.deleteByItem(26));
        System.out.println(dataContainer.deleteByItem(577));

        for (Integer s : dataContainer.getItems()) {
            System.out.print("|" + s);
        }

        DataContainer.sort(dataContainer, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        //0
        //1
        //2
        //Произошло увеличение массива на одну ячейку
        //3
        //Произошло увеличение массива на одну ячейку
        //4
        //Произошло увеличение массива на одну ячейку
        //5
        //Под 3 индексом: 4
        //|14|26|57|4|5|8
        //true  System.out.println(dataContainer.deleteByIndex(2));
        //|14|26|4|5|8
        //true  System.out.println(dataContainer.deleteByItem(26));
        //false System.out.println(dataContainer.deleteByItem(577));
        //|14|4|5|8
    }

}


