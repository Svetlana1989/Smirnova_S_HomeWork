package HomeWork7;

public class Test {


    public static void main(String[] args) {

        Cat cat[] = new Cat[3];
        cat[0] = new Cat("Барсик", 20);
        cat[1] = new Cat("Ксюша", 20);
        cat[2] = new Cat("Зяма", 20);
        Plate plate1 = new Plate(30);
        plate1.info();
        System.out.println();

        for (Cat a : cat) {
            System.out.println("Котик " + a.getName() + ":");

            if (a.getSatiety() == false) {
                while (plate1.getFood() < a.getAppetite()) {
                    plate1.plusFood(10);
                }


                if (plate1.getFood() >= a.getAppetite()) {
                    a.eat(plate1);
                    a.setSatiety(true);
                }
            }


            a.infoCat();
            System.out.println();
        }

        plate1.plusFood(100);
        plate1.info();


    }


}
