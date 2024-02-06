import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Создание пула потоков с фиксированным количеством (3) потоков
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Массив с именами файлов
        String[] fileNames = {"D:\\Учеба\\5 семестр\\Современные платформы программирования\\spplab1ses\\src\\AI1.txt","D:\\Учеба\\5 семестр\\Современные платформы программирования\\spplab1ses\\src\\AI2.txt","D:\\Учеба\\5 семестр\\Современные платформы программирования\\spplab1ses\\src\\AI3.txt"};

        // Цикл для каждого файла
        for (int i = 0; i < fileNames.length; i++) {
            final int index = i;

            // Выполнение каждого задания в отдельном потоке
            executor.execute(() -> {
                try (FileReader fr = new FileReader(fileNames[index]);
                     BufferedReader br = new BufferedReader(fr)) {
                    // Чтение первой строки из файла
                    String line = br.readLine();

                    // Преобразование строки в массив целых чисел
                    int[] array = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

                    // Обработка массива в зависимости от индекса
                    if(index == 0){
                        // Вычисление среднего значения массива
                        double average = Arrays.stream(array).average().orElse(0);
                        System.out.println("Среднее значение из AI1.txt: " + average);
                    }
                    else if(index == 1){
                        // Нахождение максимального элемента в массиве
                        int max = Arrays.stream(array).max().orElse(0);
                        System.out.println("Максимальный элемент из AI2.txt: " + max);
                    }
                    else if(index == 2){
                        // Нахождение минимального элемента в массиве
                        int min = Arrays.stream(array).min().orElse(0);
                        System.out.println("Минимальный элемент из AI3.txt: " + min);
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            });
        }

        // Завершение работы пула потоков после выполнения всех задач
        executor.shutdown();
    }
}
