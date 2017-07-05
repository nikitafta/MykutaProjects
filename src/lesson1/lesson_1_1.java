package lesson1;

    import java.util.Scanner;

/**
 * Created by Никита on 03.07.2017.
 */
public class lesson_1_1 {
    public static void main(String[] args) {
        Scanner  input  = new Scanner(System.in);
        System.out.println("\n\n\n\n");
        System.out.println("Start program");

        System.out.print("\n\tEnter y = ");
        double y = input.nextInt();

        y = Math.pow(y,3);
        System.out.println("\ty = "+y);
        System.out.println("\n\n\n\n");
    }
}
