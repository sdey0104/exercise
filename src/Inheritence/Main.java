package Inheritence;

public class Main {

    public static void main(String arg[]) {
        Animal animal = new Animal("Animal", 1, 1, 4, 6 );
        Dog dog = new Dog("Dodo", 7, 7, 2, 4, 1, 23, "fur");
        Dog anotherAnimal = dog;
        dog.eat();
        dog.walk(6);
        Fish fish = new Fish("fish",1,1,1,1,1);
        fish.move(3);
        anotherAnimal.walk(3);

    }    //reference -- >object -->  instance class
}
