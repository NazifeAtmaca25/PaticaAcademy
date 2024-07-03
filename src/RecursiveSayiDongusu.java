import java.util.Scanner;

public class RecursiveSayiDongusu {

    public static void recursivePattern(int original, int current, boolean isIncreasing) {
        System.out.print(current + " ");

        if (current <= 0 && !isIncreasing) {
            isIncreasing = true;
        }

        if (isIncreasing && current == original) {
            return;
        }

        if (!isIncreasing) {
            recursivePattern(original, current - 5, isIncreasing);
        } else {
            recursivePattern(original, current + 5, isIncreasing);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        recursivePattern(number, number, false);
    }
}
