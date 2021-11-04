import java.util.Scanner;

public class CycleWithExceptions {
    //in this task i'm direct cycle "for" in the right direction
    public static void main(String[] args) {
        System.out.print("Input same number: ");
        int number = new Scanner(System.in).nextInt();
        int summaOfNumber = 0;
        if (number < 0) {
            for (int i = 0; i >= number; i--) {
                summaOfNumber = summaOfNumber + i;
            }

        }
        else {
            for (int i = 0; i <= number; i++) {
                summaOfNumber = summaOfNumber + i;
            }
        }
        System.out.printf("Summa of numbers = %d", summaOfNumber);
    }
}
