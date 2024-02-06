//Камни. Определить иерархию драгоценных и полудрагоценных камней. Отобрать
//камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость. Провести сортировку
//камней ожерелья на основе ценности. Найти камни в ожерелье, соответствующие
//заданному диапазону параметров прозрачности.

public class Main {
    public static void main(String[] args) {
        // создание камней
        Gem gem1 = new PreciousGem("Diamond", 2.5, 5000.0, 0.9, "Princess Cut");
        Gem gem2 = new SemiPreciousGem("Amethyst", 1.0, 200.0, 0.8, "Oval Cut");
        Gem gem3 = new PreciousGem("Emerald", 3.0, 7000.0, 0.7, "Pear Cut");

        // создание ожерелья
        Necklace necklace = new Necklace();
        necklace.gems.add(gem1);
        necklace.gems.add(gem2);
        necklace.gems.add(gem3);

        // вывод информации об ожерелье
        System.out.println("Total weight: " + necklace.getTotalWeight() + " carats");
        System.out.println("Total price: $" + necklace.getTotalPrice());

        // сортировка камней по ценности
        necklace.sortGemsByPrice();

        // вывод отсортированных камней
        for (Gem gem : necklace.gems) {
            System.out.println(gem.getName() + " - $" + gem.getPrice());
        }

        }
    }
