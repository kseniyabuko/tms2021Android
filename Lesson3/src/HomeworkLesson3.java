import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson3 {

    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Method should perform some operation with int "number" based on some conditions:
     * - if number is positive - increase it by 1
     * - if number is negative - decrease it by 2
     * - if number is equal to zero - replace it with 10
     * return number value after operation
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number = number - 2;
        } else {
            number = 10;
        }
        return number;
    }


    /**
     * Method should print different strings in console based on some conditions:
     * - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     * - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     * - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (((double) number % 3 == 0) && ((double) number % 5 == 0)) {
            System.out.println("foobar");
        } else if ((double) number % 3 == 0) {
            System.out.println("foo");
        } else if ((double) number % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println("N/A");
        }
    }


    /**
     * Steps to implement:
     * - Read two ints from console
     * - Create a two-dimensional int array (use ints that you read from console height and width)
     * - Fill array with random values (under 100)
     * - Print in console matrix with given size, but:
     * - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     * - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     * - Print "*" otherwise
     * <p>
     * Example:
     * - Values from console -  2 and 3
     * - Array will look like this (values be different because it's a random)
     * 6 11 123
     * 1 14 21
     * - For this values output in console should be:
     * <p>
     * + * *
     * * - +
     * <p>
     * Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
     */
    public static void printMatrix() {
        System.out.println("Please enter 2 integers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int y = 0; y < b; y++) {
                array[i][y] = random.nextInt(100);
                if (array[i][y] % 3 == 0) {
                    System.out.print("+");
                } else if (array[i][y] % 7 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {
    }
}

