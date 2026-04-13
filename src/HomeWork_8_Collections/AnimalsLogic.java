package HomeWork_8_Collections;

import java.util.LinkedList;

public class AnimalsLogic {
    LinkedList<String> animals = new LinkedList<>();
    public void addAnimal(String name) {
        animals.addFirst(name);
    }
    public void removeAnimal() {
            animals.removeLast();
    }
    @Override
    public String toString() {
        return "Животинки нашего загона: " + animals;
    }
}
