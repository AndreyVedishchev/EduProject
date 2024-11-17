package interfaces.task3;

public class HybridCar implements Vehicle, Electric, Fuel{
    @Override
    public void charge() {
        System.out.println("HybridCar charge");
    }

    @Override
    public void refuel() {
        System.out.println("HybridCar refuel");
    }

    @Override
    public void start() {
        System.out.println("HybridCar start");
    }

    @Override
    public void stop() {
        System.out.println("HybridCar stop");
    }
}
