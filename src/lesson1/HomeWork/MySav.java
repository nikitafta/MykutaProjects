package lesson1.HomeWork;

import java.util.Random;

public class MySav {
    public static void main(String[] args) {
        int[] chisla = new int[10];
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < chisla.length; i++) {
            chisla[i] = random.nextInt(10);
            System.out.println("student [" + i + "]=" + chisla[i]);
        }
        for (int i = 0; i < chisla.length; i++) {
            if (i % 2 != 0)
                System.out.println("chisla [" + i + "]=" + chisla[i]);
                count++;
        }
    }
}

