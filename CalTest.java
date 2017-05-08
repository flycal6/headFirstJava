import java.util.Calendar;

public class CalTest {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.set(2004,0,7,15,40);
        System.out.println("Time is: " + c.getTime());

        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
        c.setTimeInMillis(day1);
        System.out.println("New hour: " + c.get(Calendar.HOUR_OF_DAY));

        c.add(Calendar.DATE, 35);
        System.out.println("Add 35 days: " + c.getTime());

        c.roll(Calendar.DATE, 35);
        System.out.println("Rolled date ahead 35 days (keeps same month): " + c.getTime());

        c.set(Calendar.DATE, 1);
        System.out.println("Set date to 1: " + c.getTime());
    }
}
