package lesson2;

import java.util.Random;
import java.util.Scanner;

/*
Відомі дані про кількість опадів, які випали за кожний день
лютого.
Вияснити чи вірне твердження, що по парних числах випало більше опадів ніж по непарних.
*/

public class lesson2_1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Random random = new Random();
        double[] opady = new double[4];
       int counterp=0, countern=0;


        for (int i =0; i < opady.length ;i++)
            opady [i] = random.nextInt(20) +random.nextDouble();
        for (int i = 0; i < opady.length; i++){
            System.out.println(opady[i]);
           if ((i+1) % 2 != 0)
                countern++;
            else counterp++;
        }
        if(counterp > countern)
            System.out.println("umova vykon");
        else System.out.println("nevykon");



    }
}
