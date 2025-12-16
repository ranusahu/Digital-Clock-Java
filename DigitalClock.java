import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + time.format(formatter));

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted");
                break;
            }
        }
    }
}
