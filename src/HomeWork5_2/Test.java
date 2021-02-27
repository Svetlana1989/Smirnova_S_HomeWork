package HomeWork5_2;

public class Test {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanovich", "Engineer", "ivan@yandex.ru", "89162222222", 50000, 19);
        persArray[1] = new Person("Smirnov Ivan Nikolaevich", "Engineer", "888@yandex.ru", "89165552222", 30000, 41);
        persArray[2] = new Person("Tumkina Daria Vasilevna", "Accountant", "44@yandex.ru", "89162333222", 40000, 54);
        persArray[3] = new Person("Bubnov Alexey Sergeevich", "Engineer", "76@yandex.ru", "89160002222", 80000, 60);
        persArray[4] = new Person("Orlova Tatiana Vladimirovna", "Accountant", "7654@yandex.ru", "89161112222", 90000, 18);

        System.out.println("Сотрудники старше 40 лет:");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }
    }
}
