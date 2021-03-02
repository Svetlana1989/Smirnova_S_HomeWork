package HomeWork6;

import java.util.Scanner;

public abstract class Animal {

    public static int cnt = 0;
    public final int id;
    private String name;
    private int age;
    private static int limitSmim;
    private static int limitRun;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
        cnt++;
        id = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getLimitSmim(int i) {
        return limitSmim;
    }

    public static void setLimitSmim(int limitSmim) {
        Animal.limitSmim = limitSmim;
    }

    public static int getLimitRun(int i) {
        return limitRun;
    }

    public static void setLimitRun(int limitRun) {
        Animal.limitRun = limitRun;
    }


    public void go (){
        System.out.println("Введите длину препятствия для животного: " + getName());
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        if (limitRun >= l) {
            System.out.println(getName() + " пробежал(а)" + " " + l + "м");
        } else {
            System.out.println("Cлишком длинная дистанция");
            go();
        }
    }

    public void swim (){
        System.out.println("Введите длину препятствия для животного: " + getName());
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        if (limitSmim >= l) {
            System.out.println(getName()+ " проплыл(а)" + " " + l + "м");
        } else {
            System.out.println("Cлишком длинная дистанция");
            swim();
        }
    }

    public void say (){};
}


