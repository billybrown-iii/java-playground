import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        // System.out.println("Which index should we access? ");
        // int index = Integer.valueOf(reader.nextLine());

        // System.out.println(numbers[index]);

        int[] moreNumbers = new int[] {1, 2, 3};

        for (int num: moreNumbers) System.out.println(num);

    }
}
