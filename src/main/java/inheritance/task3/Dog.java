package inheritance.task3;

public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Dog voice");
    }

    void eating() {
        System.out.println("Dog is eating");
    }
}
