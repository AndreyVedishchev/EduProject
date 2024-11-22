package inheritance.task3;

public class Cat extends Animal {
    @Override
    void voice() {
        System.out.println("Cat voice");
    }

    void eating() {
        System.out.println("cat is eating");
    }
}
