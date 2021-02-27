package HomeWork5_2;


public class Person {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Person (String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        if (age>=18){
            this.age = age;
        } else {
            System.out.println("Сотрудник младше 18 лет");
        }
    }

    public int getAge (){
        return age;
    }

    public void info (){
        System.out.println(name + " " + position + " " + email + " " + telephone + " " + salary + " " + age);
    }
}


