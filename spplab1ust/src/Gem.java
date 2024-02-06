public class Gem {
    String name;
    private double weight;
    private double price;
    private double clarity; // прозрачность

    public Gem(String name, double weight, double price, double clarity) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.clarity = clarity;

    }

    public double getWeight(){
        return  weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }



    // конструктор, геттеры и сеттеры
}

