package enum_.task3;

public enum Color {

    RED (new int[] {255, 0, 0}, "red"),
    GREEN(new int[] {0, 255, 0}, "green"),
    BLUE(new int[] {0, 0, 255}, "blue");

    private final int[] params;
    private final String name;

    Color(int[] params, String name) {
        this.params = params;
        this.name = name;
    }

    /**
     * смешивает коды двух цветов
     */
    static int[] mixColor(Color c1, Color c2) {
        int[] res = new int[c1.params.length];
        for (int i = 0; i < c1.params.length; i++) {
            res[i] = Math.min((c1.params[i] + c2.params[i]), 255);
        }
        return res;
    }

    /**
     * если в коде есть компонент синего, т.е. последее число в массиве 255, то будет считаться холодным
     */
    static boolean isCold(int[] colorCode) {
        return colorCode[2] == 255;
    }
}
