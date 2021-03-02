package HomeWork6;

public class TeatAnimal {
    public static void main(String[] args) {

        Animal cat1 = new Cat("Murka", 5);
        Animal dog1 = new Dog("Bobik", 4);

        System.out.println("Животные говорят:");
        cat1.say();
        dog1.say();
        System.out.println();

        System.out.println("Животные бегают:");
        cat1.go();
        dog1.go();
        System.out.println();

        System.out.println("Животные плавают:");
        cat1.swim();
        dog1.swim();
        System.out.println();

        System.out.println("Количество животных:");
        System.out.println(Cat.cnt);
        System.out.println(Dog.cnt);
        System.out.println(Animal.cnt);
        System.out.println();

        System.out.println("ID:");
        System.out.println(cat1.id);
        System.out.println(dog1.id);
        System.out.println();
    }

}
