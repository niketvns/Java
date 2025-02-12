class Human {
    private int age;
    private String name;

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

        System.out.println("Hello " + h1.getName() + " Your age is: " + h1.getAge());
    }
}