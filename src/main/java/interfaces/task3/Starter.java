package interfaces.task3;

public class Starter {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new ElectricCar();
        vehicles[1] = new PetrolCar();
        vehicles[2] = new HybridCar();

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();

            if (vehicle instanceof ElectricCar) {
                ((ElectricCar) vehicle).charge();
            }
            if (vehicle instanceof PetrolCar) {
                ((PetrolCar) vehicle).refuel();
            }
            if (vehicle instanceof HybridCar) {
                ((HybridCar) vehicle).refuel();
                ((HybridCar) vehicle).charge();
            }
            System.out.println("-----------------");
        }
    }
}
