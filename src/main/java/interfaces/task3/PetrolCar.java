package interfaces.task3;

public class PetrolCar implements Vehicle, Fuel{
    @Override
    public void refuel() {
        System.out.println("PetrolCar refuel");
    }

    @Override
    public void start() {
        System.out.println("PetrolCar start");
    }

    @Override
    public void stop() {
        System.out.println("PetrolCar stop");
    }
}
