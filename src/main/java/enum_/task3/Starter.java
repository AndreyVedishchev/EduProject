package enum_.task3;

public class Starter {

    public static void main(String[] args) {
        Color red = Color.RED;
        Color green = Color.GREEN;
        Color blue = Color.BLUE;

        int[] rg = Color.mixColor(red, green);
        int[] gb = Color.mixColor(green, blue);
        int[] rb = Color.mixColor(red, blue);

        System.out.println("rg is cold: " + Color.isCold(rg));
        System.out.println("gb is cold: " + Color.isCold(gb));
        System.out.println("rb is cold: " + Color.isCold(rb));
    }
}
