package weekdays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String day, String notes) {
        this.entries.add(new WeeklyEntry(day, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        (this.entries).sort(WeeklyEntry.COMPARED_BY_WEEKDAY);
        return this.entries;
    }
}
