class CalculatorExample {
    int num = 5;

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class StackHeap {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;

        CalculatorExample calc = new CalculatorExample();
        CalculatorExample newCalc = new CalculatorExample();

        int result = calc.add(num1, num2);

        System.out.println(result);

    }
}
