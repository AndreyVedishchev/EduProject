package enum_.task4;

public enum TaskPriority {
    HIGH(1),
    MEDIUM(2),
    LOW(3);

    private final int timeHour;

    TaskPriority(int timeHour) {
        this.timeHour = timeHour;
    }

    public int getTimeHour() {
        return timeHour;
    }
}
