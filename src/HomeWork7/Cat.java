package HomeWork7;

public class Cat {

    private String name;
    private int appetite;
    private Boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }


    public void infoCat() {
        System.out.println("Степень сытости котика: " + satiety);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }
}
