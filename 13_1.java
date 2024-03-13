public class Main {
    // Task 51
    public static void sumOfTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    // Task 52
    public static void productOfTwoNumbers(int a, int b) {
        System.out.println(a * b);
    }

    // Task 53
    public static void minutesToSeconds(int minutes) {
        System.out.println(minutes * 60);
    }

    // Task 54
    public static void hoursToSeconds(int hours) {
        System.out.println(hours * 3600);
    }

    // Task 55
    public static void checkEquality(int x, int y) {
        if (x == y) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    // Task 56
    public static void perimeterOfRectangle(int length, int width) {
        System.out.println((length + width) * 2);
    }

    // Task 57
    public static void areaOfRectangle(int length, int width) {
        System.out.println(length * width);
    }

    // Task 58
    public static void remainderOfTwoNumbers(int a, int b) {
        System.out.println(a % b);
    }

    // Task 59
    public static void ageInDays(int years) {
        System.out.println(years * 365);
    }

    // Task 60
    public static void checkDivisibility(int a, int b) {
        if (a % b == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }
    }

    // Task 61
    public static void areaOfTriangle(int height, int base) {
        System.out.println((height * base) / 2);
    }

    public static void main(String[] args) {
        // Test Cases
        sumOfTwoNumbers(5, 6);
        productOfTwoNumbers(5, 6);
        minutesToSeconds(1);
        hoursToSeconds(1);
        checkEquality(4, 5);
        perimeterOfRectangle(4, 5);
        areaOfRectangle(4, 5);
        remainderOfTwoNumbers(5, 5);
        ageInDays(1);
        checkDivisibility(35, 7);
        areaOfTriangle(4, 5);
    }
}
