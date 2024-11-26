package enum_.task5;

public enum Grade {
    A(1), B(2), C(3), D(4), F(5);

    private final int intValue;

    Grade(int intValue) {
        this.intValue = intValue;
    }

    /**
     * проверка проходной оценки
     */
    public boolean isValidScore() {
        return intValue >= 3;
    }

    /**
     * средний балл
     */
    public static double avgValue(Grade[] arr) {
        int cnt = 0;
        for (Grade grade : arr) {
            cnt += grade.intValue;
        }
        return (double) cnt / arr.length;
    }
}
