public class Birthday {
    private TimeProvider timeProvider;

    public Birthday() {
        this.timeProvider = new TimeProvider();
    }

    public Birthday(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public boolean isBirthday() {
        return timeProvider.getNow().getMonthValue() == 4 && timeProvider.getNow().getDayOfMonth() == 9;
    }
}
