public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal = new Animal("Raccoon", 5);
        animal.makeSound();

        Dog dog = new Dog("Pup", 4);
        dog.makeSound();

        Cat cat = new Cat("Kitty", 10);
        cat.makeSound();

        Bird bird = new Bird("Parrot", 5);
        bird.makeSound();
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Hello!");
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}