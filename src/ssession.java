public class ssession {
    private int startTime;
    private int endTime;
    private String location;

    public ssession(int startTime, int endTime, String location) {
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

    public static void main(String[] args) {
     
        ssession session1 = new ssession(900, 1100, "Conference Room A");
        System.out.println("Session 1:");
        System.out.println("  Start Time: " + session1.getStartTime());
        System.out.println("  End Time: " + session1.getEndTime());
        System.out.println("  Location: " + session1.getLocation());
        System.out.println();

        ssession session2 = new ssession(1300, 1500, "Auditorium");
        System.out.println("Session 2:");
        System.out.println("  Start Time: " + session2.getStartTime());
        System.out.println("  End Time: " + session2.getEndTime());
        System.out.println("  Location: " + session2.getLocation());
        System.out.println();

        session1.setDuration(900, 1200);
        System.out.println("Session 1 Updated:");
        System.out.println("  Start Time: " + session1.getStartTime());
        System.out.println("  End Time: " + session1.getEndTime());
        System.out.println();

        try {
            ssession invalidSession = new ssession(1500, 1500, "Room B");
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating invalid session: " + e.getMessage());
        }
    }
}
