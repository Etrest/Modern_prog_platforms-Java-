import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        java.time.LocalDate date = java.time.LocalDate.now();
        java.time.LocalTime time = java.time.LocalTime.now();

        System.out.println("Silence is golden");

        String name = "Egor";

        System.out.println(date);
        System.out.println(time);
        System.out.println(name);
        System.out.println("wednesday");
        System.out.println("January");


        double x = 3.6;
        double result = Math.pow(Math.E, (x - 2)) + Math.abs(Math.sin(x)) - (Math.pow(x, 4) * Math.cos(1 / x));
        System.out.println(result);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        int a = in.nextInt();
        System.out.print("Input a number B: ");
        int b = in.nextInt();

        if(a>b)
        {
            System.out.print("Yes");
        }else{
            int c = a;
            a = b;
            b = c;
            System.out.println("A = " + a);
            System.out.println("B = " + b);
        }

    }
}
