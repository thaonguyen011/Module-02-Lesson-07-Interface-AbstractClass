package Animal_Interfere_Edible;

import Animal_Interfere_Edible.Animal.Animal;
import Animal_Interfere_Edible.Animal.Chicken;
import Animal_Interfere_Edible.Animal.Tiger;
import Animal_Interfere_Edible.Interface.Edible;
import Animal_Interfere_Edible.Fruit.Apple;
import Animal_Interfere_Edible.Fruit.Fruit;
import Animal_Interfere_Edible.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for(Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                var edible = (Chicken) animal;

                System.out.println(edible.howtoEat());
            }
        }
//        Apple apple1 = new Apple();
//        var apple2 = new Apple();

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
