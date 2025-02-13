class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Inheriting Properties of Calc
class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Calc c1 = new Calc();
        int r1 = c1.add(4, 7);
        int r2 = c1.sub(14, 6);

        AdvCalc c2 = new AdvCalc();
        int ar1 = c2.add(4, 7);
        int ar2 = c2.sub(14, 6);
        int ar3 = c2.mul(14, 6);
        int ar4 = c2.div(14, 6);

        System.out
                .println("Normal Calculator Result:\n" + "Add: " + r1 + ", Sub: " + r2
                        + "\nAdvance Calculator Results:\n" + "Add: " + ar1 + ", Sub: "
                        + ar2 + ", Mul: " + ar3 + ", Div: " + ar4);
    }
}
