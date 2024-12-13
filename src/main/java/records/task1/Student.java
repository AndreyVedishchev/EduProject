package records.task1;

public record Student(String name, int age, double avgScore) {
    public Student {
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException("Некорректный возраст.");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Некорректное имя.");
        }
    }
}

class Starter {
    public static void main(String[] args) {
        Student st = new Student("Student1", 22, 4.5);
        System.out.println(st);
    }
}
