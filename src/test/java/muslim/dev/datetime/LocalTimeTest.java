package muslim.dev.datetime;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalTimeTest {

  @Test
  void create() {
    LocalTime now = LocalTime.now();
    LocalTime of = LocalTime.of(9, 9, 9);
    LocalTime parse = LocalTime.parse("09:09");

    System.out.println(now);
    System.out.println(of);
    System.out.println(parse);
  }

  @Test
  void change() {
    LocalTime localTime = LocalTime.now();
    LocalTime withHour = localTime.withHour(10);
    LocalTime withHourMinuteAndSecond = localTime.withHour(10).withMinute(10).withSecond(10);

    System.out.println(localTime);
    System.out.println(withHour);
    System.out.println(withHourMinuteAndSecond);
  }

  @Test
  void modify() {
    LocalTime localTime = LocalTime.now();
    LocalTime plusHours = localTime.plusHours(10);
    LocalTime plusMinutes = localTime.plusMinutes(10);
    LocalTime plusSeconds = localTime.plusSeconds(25);

    System.out.println(localTime);
    System.out.println(plusHours);
    System.out.println(plusMinutes);
    System.out.println(plusSeconds);
  }

  @Test
  void get() {
    LocalTime localTime = LocalTime.now();

    System.out.println(localTime.getHour());
    System.out.println(localTime.getMinute());
    System.out.println(localTime.getSecond());
    System.out.println(localTime.getNano());
  }
}
