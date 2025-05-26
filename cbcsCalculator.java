import java.util.*;

public class cbcsCalculator {
    public float calculateMarks() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int[] arr = new int[5];

        System.out.println("Enter marks for 5 subjects out of 100:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        float percentage = (total / 500.0f) * 100;
        System.out.println("Total percentage of given marks is: " + percentage + "%");

        return percentage;
    }

    public static void main(String[] args) {
        cbcsCalculator calculator = new cbcsCalculator();
        calculator.calculateMarks();
    }
}
