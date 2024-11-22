package inheritance.task3;

public class TypeCastingTask {
    public static void main(String[] args) {

        int cntCat = 0, cntDog = 0;

        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Dog();

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                cntCat++;
            }
            if (animal instanceof Dog) {
                cntDog++;
            }
        }

        System.out.println("cntCat: " + cntCat + "; cntDog: " + cntDog);
    }
}
