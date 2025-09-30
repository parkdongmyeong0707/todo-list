package csc207.todo_list;

import java.time.LocalTime;
import java.util.Timer;
// This class record a task with its scheduled time. use get timer method to set an alarm in panel

public class ScheduleTask extends Task {
    public final LocalTime startTime;

    public ScheduleTask(String name, String description, LocalTime time) {
        super(name, description);
        this.startTime = time;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public Timer getTimer() {
        return null;
    }

}
