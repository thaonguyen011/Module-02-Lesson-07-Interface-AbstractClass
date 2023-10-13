package Animal_Interfere_Edible.Fruit;
import Animal_Interfere_Edible.Interface.Edible;

public class Apple extends Fruit implements Edible{
    @Override
    public String howtoEat() {
        return "Apple could be sliced";
    }
}
