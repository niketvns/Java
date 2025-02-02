public class conditional {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;

        // Task1: Print the largest number in 2
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        // Task2: Print largest in 3
        int val1 = 4;
        int val2 = 6;
        int val3 = 45;

        if (val1 > val2 && val1 > val3) {
            System.out.println(val1);
        } else if (val2 > val3) {
            System.out.println(val2);
        } else {
            System.out.println(val3);
        }

        // Task3: set value of result for even-odd
        int x = 4;
        int result = 0;

        // ? Solve with if-else
        if (x % 2 == 0) {
            result = 20;
        } else {
            result = 21;
        }

        // ? Solve with ternary
        result = x % 2 == 0 ? 20 : 21;

        System.out.println(result);

        System.out.println("Thank You!");
    }
}
