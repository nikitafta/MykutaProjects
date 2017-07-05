package lesson1;

        import java.util.Random;

/*
Відомий ріст 30 студентів ВНЗ.
Скільки із них має ріст більше 170см?
Чи можна сформувати баскетбольну команду (в команді
повинно бути не менше п’яти чоловік ростом більше 170см.)
 */
public class lesson1_1_2{
    public static void main(String[] args) {
        int[] students = new int[30];
        Random random = new Random();
        int count = 0;

        for(int i = 0; i < students.length;i++){
            students[i] = random.nextInt(50)+160;
            System.out.println("student ["+i+"]="+students[i]);
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i]>170)
                count++;
        }
        if (count >= 5)
            System.out.println("можна");
        else System.out.println("не можна");
    }
}