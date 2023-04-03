package pl.zajavka.myCase1;

public class Kot extends Zwierzak {

    // do komitu 1

    // feat-3

    private String milk;

    public Kot(String milk) {
        this.milk = milk;
    }

    @Override
    protected String whatIsYourName() {
        return "My name is Cat";
    }
}
