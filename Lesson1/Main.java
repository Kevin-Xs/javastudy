package Lesson1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.setAge(31);
        System.out.println("Updated Age: " + person.getAge());
        person.setName("Bob");
    }
}
