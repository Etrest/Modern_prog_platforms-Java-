public class SemiPreciousGem extends Gem {
    private String cut; // огранка

    public SemiPreciousGem(String name, double weight, double price, double clarity, String cut) {
        super(name, weight, price, clarity);
        this.cut = cut;
    }

    // конструктор, геттеры и сеттеры
}
