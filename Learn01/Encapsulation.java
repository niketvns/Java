class Human {
    private int age;
    private String name;

    // Constructors

    // Default Constructor
    public Human() {
        age = 12;
        name = "John";
    }

    // Parameterized Constructor
    public Human(int age) {
        this.age = age;
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(24);
        h1.setName("Niket Mishra");

        Human h2 = new Human(19);
        Human h3 = new Human(23, "Niket");

        System.out.println("Hello " + h1.getName() + " Your age is: " + h1.getAge());
        System.out.println("Hello " + h2.getName() + " Your age is: " + h2.getAge());
        System.out.println("Hello " + h3.getName() + " Your age is: " + h3.getAge());
    }
}