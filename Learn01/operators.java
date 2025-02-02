public class operators {
    public static void main(String[] args) {

        // 1. Arithmatic Operation
        int num1 = 7;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;

        // Subtraction
        int minus = num1 - num2;

        // Multiplication
        int mul = num1 * num2;

        // Division: We are getting only quotient
        int division = num1 / num2;

        // Modulo Division: We will get remainder
        int md = num1 % num2;

        // assignment operator shorthand
        // num1 = num1 + 6;
        num1 += 6;
        // num1 = num1 - 6;
        num1 -= 5;
        // num1 = num1 * 6;
        num1 *= 3;
        // num1 = num1 / 6;
        num1 /= 2;
        // num1 = num1 % 6;
        num1 %= 5;

        // Increment Operator
        // num1 = num1 + 1;
        // Post-Increment
        num1++;
        // Pre-Increment
        ++num1;

        // Decrement Operator
        // num1 = num1 - 1;
        // Post-Decrement
        num1--;
        // Pre-Decrement
        --num1;

        // 2. Relational Operation
        // <, >, ==, !=, <=, >=

        int val1 = 5;
        int val2 = 6;

        boolean result = val1 < val2;
        result = val1 > val2;
        result = val1 == val2;
        result = val1 <= val2;
        result = val1 >= val2;
        result = val1 != val2;

        // 3. Logical Operators
        // &&, ||, !

        int a3 = 4;
        int a4 = 7;
        int a5 = 9;
        int a6 = 2;

        result = a3 < a4 && a5 < a6; // False
        result = a3 < a4 || a5 < a6; // true
        result = a3 < a4 || a5 < a6 || a3 > 1; // true

        System.out.println(!result); // false
    }
}
