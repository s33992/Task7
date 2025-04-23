public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void start(){
        System.out.println("Pojazd mający " + getNumberOfSeats() + " miejsc ruszył");
    }

    public void stop(){
        System.out.println("Pojazd mający " + getNumberOfSeats() + " miejsc zatrzymał się");
    }
}
