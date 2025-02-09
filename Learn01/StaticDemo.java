
class StaticMobile {
    // Instance Variable
    String brand;
    int price;

    // Static Variable
    static String type;

    // Static block loads only once when class loads into memory
    static {
        type = "Smart Phone";
    }

    // Instance Method
    public void show() {
        System.out.println(brand + " : $" + price + " : " + type);
    }

    // Static Method
    // inside static method we can only access static variables
    public static void show1() {
        System.out.println("Calling Show 1" + type);
    }

    // Static Method with object parameter
    public static void showInfo(StaticMobile obj) {
        System.out.println(obj.brand + " : $" + obj.price + " : " + type);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        StaticMobile mob1 = new StaticMobile();
        mob1.brand = "Realme";
        mob1.price = 8000;

        StaticMobile mob2 = new StaticMobile();
        mob2.brand = "Apple";
        mob2.price = 50000;

        StaticMobile mob3 = new StaticMobile();
        mob3.brand = "Samsung";
        mob3.price = 30000;

        mob1.show();
        // It will affect all the objects
        mob3.type = "Keypad";
        // Static keywords can be accessed directly by class name
        StaticMobile.type = "Smart Phone";
        mob1.show();

        // Calling static method
        mob1.show1();
        StaticMobile.show1();

        // Calling static method with object arg
        StaticMobile.showInfo(mob3);

        System.out.println("Hello Static!");
    }

}
