package enum_.task4;

public class Task {
    private TaskPriority priority;
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "time=" + priority.getTimeHour() + "h" +
                ", description='" + description + '\'' +
                '}';
    }
}
