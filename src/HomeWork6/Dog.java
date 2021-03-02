package HomeWork6;

public class Dog extends Animal {

    public static int cnt = 0;

    public Dog(String name, int age) {
        super(name, age);
        cnt++;
    }

    @Override
    public void say() {
        System.out.println("Wow");
    }

    @Override
    public void go() {
        setLimitRun(500);
        super.go();
    }

    @Override
    public void swim() {
        setLimitSmim(10);
        super.swim();
    }
}
