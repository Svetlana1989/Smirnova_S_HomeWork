package HomeWork6;

public class Cat extends Animal {

    public static int cnt = 0;

    public Cat (String name, int age) {
        super(name, age);
        cnt++;
    }

    @Override
    public void say() {
        System.out.println("May");
    }

    @Override
    public void go() {
        setLimitRun(200);
        super.go();
    }

    @Override
    public void swim() {
        System.out.println(getName() + " не умеет плавать");
    }
}
