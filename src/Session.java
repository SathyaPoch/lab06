public class Session {
    private int startTime;
    private int endTime;
    private String location;

    public Session(int startTime, int endTime, String location) {
        setDuration(startTime, endTime);
        this.location = location;
    }
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException(
                "Start time must be less than end time."
            );
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }
}