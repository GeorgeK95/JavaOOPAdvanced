package weekdays;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Friday", "sleep");
        wc.addEntry("Monday", "sport");
        Iterable<WeeklyEntry> weeklySchedule = wc.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry : weeklySchedule) {
            System.out.println(weeklyEntry);
        }
    }
}
