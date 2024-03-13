import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sum of odd elements in an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int oddSum = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddSum += num;
            }
        }
        System.out.println("Sum of odd elements: " + oddSum);

        // Minimum even element in an array
        int minEven = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num % 2 == 0 && num < minEven) {
                minEven = num;
            }
        }
        System.out.println("Minimum even element: " + minEven);

        // Print name 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Your Name");
        }

        // Print user's name specified number of times
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter how many times to print your name: ");
        int repeat = scanner.nextInt();
        for (int i = 0; i < repeat; i++) {
            System.out.println(userName);
        }

        // Countdown from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Display numbers from -10 to 0 using for loop
        for (int i = -10; i <= 0; i++) {
            System.out.println(i);
        }

        // Subtract first value from the second until reaching zero
        System.out.print("Enter first value: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter second value: ");
        int value2 = scanner.nextInt();
        for (int i = value2; i > 0; i -= value1) {
            System.out.println(i);
        }

        // Countdown from 60 to 0
        for (int i = 60; i >= 0; i--) {
            System.out.println(i);
            if (i == 0) {
                System.out.println("Your time is up");
            }
        }

        // Sum of numbers from 1 to n using while loop
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sumTotal = 0;
        while (n > 0) {
            sumTotal += n;
            n--;
        }
        System.out.println("Sum of numbers: " + sumTotal);

        // Display numbers from 10 to 1 using for loop
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Find middle between 100 and 200 using while loop
        int start = 100, end = 200;
        int middle;
        while (start <= end) {
            middle = (start + end) / 2;
            start++;
        }
        System.out.println("Middle between 100 and 200: " + start);
    }
}
