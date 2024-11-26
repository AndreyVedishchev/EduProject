package enum_.task4;

public class Starter {
    public static void main(String[] args) {

        Task task1 = new Task(TaskPriority.HIGH, "Задача с высоким приоритетом.");
        Task task2 = new Task(TaskPriority.MEDIUM, "Задача со средним приоритетом.");
        Task task3 = new Task(TaskPriority.LOW, "Задача с низким приоритетом.");

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

    }
}
