public class loop {
    public static void main(String[] args) {

        int i = 1;

        // While loop
        while (i <= 4) {
            System.out.println(i);
            i++;
        }

        // Do while
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 4);

        System.out.println("For loop: ");
        // For loop
        for (int x = 1; x <= 4; x++) {
            System.out.println(x);
        }

        System.out.println("Bye " + i);
    }
}
