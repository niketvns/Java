public class typeconversion {
    public static void main(String[] args) {
        // Type Conversion

        int a = 120; // size -> 4 byte
        // byte b = a; // cannot convert into byte (1 byte)

        // type casting
        byte b = (byte) a;

        short sh = 140;
        // Automatically convert type because int is bigger than short and byte
        int sum = a + sh + b;

        char ch = 'N';
        // Java will not work because char cannot conver into boolean
        // boolean isBool = (boolean) ch;

        // If we will conver float into int, we will loose decimal points
        float f = 4.6f;
        int i = (int) f;

        // int -> byte, it will store result of num % range(256)
        int num = 256;
        byte b1 = (byte) num;

        // type promotion
        byte a1 = 20;
        byte a2 = 20;
        int result = a1 * a2;

        System.out.println(result);

    }
}
