package HomeWork7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int n) {
        if ((food - n) >= 0) {
            food -= n;
            System.out.println("Котик наелся");
        } else {
            System.out.println("В тарелке недостаточно корма");
        }
    }

    public void plusFood(int i) {
        food += i;
        System.out.println("В тарелку добавали  " + i + " гр. корма");
    }

    public void info() {
        System.out.println("В тарелке " + food + " гр. корма");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
