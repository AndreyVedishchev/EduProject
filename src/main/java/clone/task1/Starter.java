package clone.task1;

public class Starter {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("name1", 22);
            Person p2 = p1.clone();

            System.out.println(p2.getName());
            p2.setName("name2");

            System.out.println(p1.getName()); //p1 не зависит от p2
            System.out.println(p2.getName());

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
