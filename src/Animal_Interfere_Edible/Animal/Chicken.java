package Animal_Interfere_Edible.Animal;

import Animal_Interfere_Edible.Interface.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cluck-cluck";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }

}
