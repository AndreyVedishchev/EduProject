package clone.task2;

public class Starter {
    public static void main(String[] args) {
        User u1 = new User("user1", 22);
        User u2 = new User(u1);

        u2.setName("user2");
        u2.setAge(33);

        System.out.println(u1); //при изменении первого, второй не меняется.
        System.out.println(u2);
    }
}
