package exceptions.task1;

public class SafeCalculator {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return 0;  // Безопасное значение по умолчанию
        }
    }

    public static void main(String[] args) {
        // Тестовые сценарии
        System.out.println(divide(10, 2));   // Корректное деление
        System.out.println(divide(10, 0));   // Деление на ноль
        System.out.println(divide(Integer.MAX_VALUE, 1));  // Переполнение
    }
}
