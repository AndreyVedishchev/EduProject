package interfaces.task3;

public class ElectricCar implements Vehicle, Electric{
    @Override
    public void charge() {
        System.out.println("ElectricCar charge");
    }

    @Override
    public void start() {
        System.out.println("ElectricCar start");
    }

    @Override
    public void stop() {
        System.out.println("ElectricCar stop");
    }
}
