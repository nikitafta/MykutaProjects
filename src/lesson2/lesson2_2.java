package lesson2;

public class lesson2_2 {
    public static void main(String[] args) {
        int[] someNumbers = {14,6,9};
        int[] otherArray;

        if(args[0].equals("-h")){
            System.out.println("Nazar");
        }else if (args[0].equals("-p")){
            System.out.println("Mukuta");
        }

        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);

        }
    }
}
