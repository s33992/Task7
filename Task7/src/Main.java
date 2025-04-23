//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car Samochod1 = new Car(5);
        Samochod1.start();
        Samochod1.stop();


        Lion lew = new Lion();
        Cat kot = new Cat();
        Wolf wilk = new Wolf();
        Dog pies = new Dog();

        lew.makeNoise();
        lew.roam();
        kot.makeNoise();
        kot.roam();
        wilk.makeNoise();
        wilk.roam();
        pies.makeNoise();
        pies.roam();

    }
}
