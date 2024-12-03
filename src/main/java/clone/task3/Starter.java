package clone.task3;

public class Starter {
    public static void main(String[] args) {
        try {
            Address a1 = new Address("str1", 55);
            Address a2 = a1.clone();
        } catch (CloneNotSupportedException e) {
            //ошибка, т.к. класс Address не имплементирует интерфейс Cloneable.
            System.out.println("ошибка клонирования: " + e.getMessage());
        }
    }
}
