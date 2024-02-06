import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Necklace {

    List<Gem> gems;

    // конструктор, геттеры и сеттеры
    public Necklace(){
        gems = new ArrayList<>();
    }
    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Gem gem : gems) {
            totalWeight += gem.getWeight();
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Gem gem : gems) {
            totalPrice += gem.getPrice();
        }
        return totalPrice;
    }

    public void sortGemsByPrice() {
        Collections.sort(gems, Comparator.comparingDouble(Gem::getPrice));
    }
    // методы для добавления и удаления камней из ожерелья
}
