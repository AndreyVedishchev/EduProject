package static_;

public class ObjectCounter {

    private static int cnt = 0;

    ObjectCounter() {
        cnt++;
    }

    static void print() {
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();

        ObjectCounter.print();
    }
}
