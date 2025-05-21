package TO_DO_APPLICATION;

public class Demo {
    public static void main(String[] args) {
       
        TODOAPP app = new TODOAPP();
        Reminder R = new Reminder();

        app.setListener(R);  // Register observer
        app.setReminder(10);  // Set reminder for 5 seconds
    }
    }
    

