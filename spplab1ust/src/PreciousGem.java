public class PreciousGem extends Gem {
    private String cut; // огранка


    public PreciousGem(String name, double weight, double price, double clarity, String cut){
        super(name, weight, price, clarity);
        this.cut = cut;
    }
    // конструктор, геттеры и сеттеры
}
