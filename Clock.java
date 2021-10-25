import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Clock {
  public static void main(String[] args) {
    LocalTime time = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    System.out.printf("The current time is %s \n", time.format(formatter));
  }
}
