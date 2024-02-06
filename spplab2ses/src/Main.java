//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.locks.ReentrantLock;
// Импортируем класс java.util.concurrent.locks.ReentrantLock для использования объекта Mutex

public class Main {
    private static int counter = 0;
    // Создаем статическую переменную counter для хранения значения счетчика
    private static final ReentrantLock lock = new ReentrantLock();
    // Создаем экземпляр ReentrantLock, который будет использоваться в качестве Mutex

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                incrementCounterWithoutLock();
            }
        });
        // Создаем первый поток и задаем его логику выполнения - вызов функции incrementCounterWithoutLock()

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                incrementCounterWithoutLock2();
            }
        });
        // Создаем второй поток и задаем его логику выполнения - вызов функции incrementCounterWithoutLock()

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                incrementCounterWithLock3();
            }
        });
        // Создаем третий поток и задаем его логику выполнения - вызов функции incrementCounterWithLock()

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                incrementCounterWithLock4();
            }
        });
        // Создаем четвертый поток и задаем его логику выполнения - вызов функции incrementCounterWithLock()






        // Запускаем все потоки на выполнение

        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            thread3.start();
            thread4.start();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Ожидаем завершения работы всех потоков

        System.out.println("Counter without lock: " + counter);
        System.out.println("Counter without lock: " + counter);
        // Выводим значение счетчика без использования Mutex

        System.out.println("Counter with lock : " + counter);
        System.out.println("Counter with lock : " + counter);
        // Выводим значение счетчика с использованием Mutex
    }

    private static void incrementCounterWithoutLock() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Counter without lock 1: " + counter);
            lock.lock();
            try {
                counter++;
            } finally {
                lock.unlock();
            }
        }
    }

    private static void incrementCounterWithoutLock2() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Counter without lock 2: " + counter);
            counter++;
            }
    }

    private static void incrementCounterWithLock3() {

        lock.lock();
        try {

            for (int i = 0; i < 100000; i++) {
                System.out.println("Counter with lock 3: " + counter);
                counter++;

            }
        } finally {
            lock.unlock();
        }
    }

    private static void incrementCounterWithLock4() {

        lock.lock();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("Counter with lock 4: " + counter);
                counter++;
            }
        } finally {
            lock.unlock();
        }
    }
}