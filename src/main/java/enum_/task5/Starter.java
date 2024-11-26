package enum_.task5;

public class Starter {
    public static void main(String[] args) {

        Grade a = Grade.A;
        Grade c = Grade.C;
        Grade f = Grade.F;

        System.out.println("is valid score a: " + a.isValidScore());
        System.out.println("is valid score c: " + c.isValidScore());
        System.out.println("is valid score f: " + f.isValidScore());

        Grade[] arr = new Grade[] {a, c, f};

        System.out.println("avg value: " + Grade.avgValue(arr));

    }
}
