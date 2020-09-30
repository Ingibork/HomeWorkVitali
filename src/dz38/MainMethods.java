package dz38;

import java.util.List;
import java.util.Random;

public class MainMethod {
    public static List<Person> personSort (List<Person> listPerson) {
        Random rndMain = new Random();
        RandomString strRandom = new RandomString();

        for (int i = 0; i < 10_000; i++) {
            listPerson.add(new Person(strRandom.random(5 + rndMain.nextInt(15)),
                    strRandom.random(4 + rndMain.nextInt(9))));
        }


        return listPerson;
    }

    public static List<Animal> animalSort (List<Animal> listAnimal) {
        Random rndMain = new Random();
        RandomString strRandom = new RandomString();
        for (int i = 0; i < 10_000; i++) {
            listAnimal.add(new Animal(rndMain.nextInt(16), strRandom.random
                    (2 + rndMain.nextInt(15))));
        }
        return listAnimal;
    }
}
