public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // clone other's attributes
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        System.out.println("Person 1: " + person1.name + ", Age: " + person1.age);
        
        // using copy constructor
        Person person2 = new Person(person1);
        System.out.println("Person 2 (copy): " + person2.name + ", Age: " + person2.age);
    }
}
