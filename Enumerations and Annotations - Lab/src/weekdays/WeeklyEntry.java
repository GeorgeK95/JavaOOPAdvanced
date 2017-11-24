package weekdays;

import java.util.Comparator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class WeeklyEntry {
    static final Comparator<WeeklyEntry> COMPARED_BY_WEEKDAY = Comparator.comparing(e -> e.weekday);

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String day, String notes) {
        this.weekday = Weekday.valueOf(day.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday, this.notes);
    }
}
