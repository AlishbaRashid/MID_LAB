package TO_DO_APPLICATION;
public class TODOAPP {
    private ReminderListener listener;
    private int seconds;

    public void setReminder(int seconds) {
        this.seconds = seconds;
        System.out.println("Reminder set for " + seconds + " seconds.");
        waitAndNotify();
}
      // Register observer
    public void setListener(ReminderListener listener) {
        this.listener = listener;
    }

    // Wait and notify observer
    private void waitAndNotify() {
        long start = System.currentTimeMillis();
        long end = start + seconds * 1000;
        while (System.currentTimeMillis() < end) {
            // busy wait
        }
        if (listener != null) {
            listener.onReminder();
        }
    }
}