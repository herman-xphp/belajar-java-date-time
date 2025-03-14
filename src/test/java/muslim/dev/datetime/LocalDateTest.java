package muslim.dev.datetime;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class LocalDateTest {

  @Test
  void create() {
    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2001, 03, 26);
    LocalDate localDate3 = LocalDate.parse("2001-03-26");

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  @Test
  void with() {
    LocalDate localDate = LocalDate.now();
    LocalDate withYear = localDate.withYear(2001);
    LocalDate withMonthYear = localDate.withMonth(3).withYear(2001);

    System.out.println(localDate);
    System.out.println(withYear);
    System.out.println(withMonthYear);
  }

  @Test
  void modify() {
    LocalDate localDate = LocalDate.now();
    LocalDate plusYears = localDate.plusYears(10);
    LocalDate minusMonths = localDate.minusMonths(1);

    System.out.println(localDate);
    System.out.println(plusYears);
    System.out.println(minusMonths);
  }

  @Test
  void get() {
    LocalDate localDate = LocalDate.now();

    System.out.println(localDate.getYear());
    System.out.println(localDate.getMonth());
    System.out.println(localDate.getMonthValue());
    System.out.println(localDate.getDayOfMonth());
    System.out.println(localDate.getDayOfWeek());
    System.out.println(localDate.getDayOfYear());
  }

}
