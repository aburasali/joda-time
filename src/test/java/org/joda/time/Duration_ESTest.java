/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 02:10:05 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.RoundingMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInterval;
import org.joda.time.Seconds;
import org.joda.time.UTCDateTimeZone;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

public class Duration_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = new Duration((-870L));
      Duration duration1 = duration0.withMillis(86400000L);
      assertEquals(1L, duration1.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(10800000L);
      Duration duration1 = duration0.ZERO.withDurationAdded((ReadableDuration) duration0, 1);
      assertEquals(180000L, duration1.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2547L));
      Duration duration1 = duration0.withDurationAdded(4208L, 1);
      assertEquals((-9169195792L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.days(850);
      Duration duration0 = days0.toStandardDuration();
      Seconds seconds0 = duration0.toStandardSeconds();
      assertEquals(73440000, seconds0.getSeconds());
      assertEquals(73440000L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-650L));
      Seconds seconds0 = duration0.toStandardSeconds();
      assertEquals((-650), seconds0.getSeconds());
      assertEquals((-650000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.standardDays(1L);
      Minutes minutes0 = duration0.toStandardMinutes();
      assertEquals(86400000L, duration0.getMillis());
      assertEquals(1440, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-1258L));
      Minutes minutes0 = duration0.toStandardMinutes();
      assertEquals((-20), minutes0.getMinutes());
      assertEquals((-20L), duration0.getStandardMinutes());
      assertEquals((-1258000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.millis(86400000L);
      Hours hours0 = duration0.toStandardHours();
      assertEquals(24, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = new Duration(86400000L, 0L);
      Hours hours0 = duration0.toStandardHours();
      assertEquals((-24), hours0.getHours());
      assertEquals((-24L), duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.millis(86400000L);
      Days days0 = duration0.toStandardDays();
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(0L);
      LocalDate localDate0 = monthDay0.toLocalDate((-261));
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)DateTimeZone.UTC;
      Interval interval0 = localDate0.toInterval((DateTimeZone) uTCDateTimeZone0);
      Duration duration0 = interval0.toDuration();
      Duration duration1 = duration0.multipliedBy((-1059L));
      Days days0 = duration1.toStandardDays();
      assertEquals((-1059L), duration1.getStandardDays());
      assertEquals((-1059), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.standardDays(247L);
      Duration duration1 = duration0.toDuration();
      assertEquals(21340800000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.plus(1836L);
      Duration duration2 = duration1.toDuration();
      assertEquals(1836L, duration2.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2077L));
      Duration duration1 = duration0.toDuration();
      assertEquals((-7477200L), duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.millis(86400000L);
      Duration duration1 = duration0.plus((ReadableDuration) duration0);
      assertEquals(2L, duration1.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(604800000L);
      Duration duration1 = duration0.multipliedBy((-1124L));
      Duration duration2 = duration1.plus((-1124L));
      assertEquals((-679795200001124L), duration2.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Duration duration1 = duration0.plus(0L);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.parse("PT4.839S");
      assertEquals(4839L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-870L));
      Duration duration1 = duration0.negated();
      assertEquals(3132000000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = new Duration((-870L));
      Duration duration1 = duration0.negated();
      assertEquals(0L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.standardDays(1L);
      Duration duration1 = duration0.negated();
      assertEquals((-86400000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-706L));
      Duration duration1 = duration0.multipliedBy((-706L));
      assertEquals(8307L, duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-604800000L));
      Duration duration1 = duration0.multipliedBy(1);
      assertSame(duration1, duration0);
      assertEquals((-168000L), duration1.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = Duration.millis((-1125L));
      Duration duration1 = Duration.standardDays((-1191L));
      Duration duration2 = duration0.minus((ReadableDuration) duration1);
      assertEquals(102902398875L, duration2.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2077L));
      Duration duration1 = duration0.plus((ReadableDuration) duration0);
      Duration duration2 = duration1.minus((ReadableDuration) duration0);
      assertEquals((-7477200000L), duration2.getMillis());
      assertEquals((-14954400L), duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.minus(31536000000L);
      assertEquals((-31536000000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = Duration.millis(86400000L);
      Duration duration1 = duration0.ZERO.negated();
      Duration duration2 = duration1.minus(0L);
      assertEquals(86400L, duration0.getStandardSeconds());
      assertSame(duration2, duration1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = Duration.standardDays(1L);
      Duration duration1 = duration0.minus((-60L));
      assertEquals(86400060L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = Duration.millis(1818L);
      long long0 = duration0.getStandardSeconds();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Duration duration0 = Duration.standardDays(1L);
      long long0 = duration0.getStandardMinutes();
      assertEquals(1440L, long0);
      assertEquals(86400000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-604800000L));
      long long0 = duration0.getStandardMinutes();
      assertEquals((-10080000L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1L);
      long long0 = duration0.getStandardHours();
      assertEquals(0L, long0);
      assertEquals(60000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = new Duration((-604800000L));
      long long0 = duration0.getStandardHours();
      assertEquals((-168L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(10800000L);
      Duration duration1 = duration0.withMillis(10800000L);
      long long0 = duration1.getStandardDays();
      assertEquals(3L, duration1.getStandardHours());
      assertEquals(180000L, duration0.getStandardHours());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-2077L));
      long long0 = duration0.getStandardDays();
      assertEquals((-86L), long0);
      assertEquals((-7477200L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Duration duration0 = hours0.toStandardDuration();
      RoundingMode roundingMode0 = RoundingMode.UP;
      Duration duration1 = duration0.dividedBy((-909L), roundingMode0);
      assertEquals(2362468L, duration1.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = Duration.millis(86400000L);
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      Duration duration1 = duration0.dividedBy(2583L, roundingMode0);
      assertEquals(33L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-604800000L));
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      Duration duration1 = duration0.dividedBy(1846L, roundingMode0);
      assertEquals((-327627302L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = Duration.standardDays(168L);
      Duration duration1 = duration0.dividedBy(168L);
      assertEquals(86400000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-1102));
      Duration duration1 = duration0.dividedBy((-1393L));
      assertEquals((-3967200000L), duration0.getMillis());
      assertEquals(2847954L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-604799991L));
      Duration duration1 = duration0.dividedBy((long) 1);
      assertSame(duration1, duration0);
      assertEquals((-604799991L), duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      Duration duration1 = duration0.abs();
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = Duration.millis(1765L);
      Duration duration1 = Duration.standardMinutes((-52200000L));
      Duration duration2 = duration0.withDurationAdded((ReadableDuration) duration1, 2392);
      // Undeclared exception!
      try { 
        duration0.withDurationAdded((ReadableDuration) duration2, 2392);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -7491743999998235 * 2392
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Weeks weeks0 = hours0.toStandardWeeks();
      Duration duration0 = weeks0.toStandardDuration();
      // Undeclared exception!
      try { 
        duration0.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -7730940672000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Duration duration0 = Duration.standardHours(31556952000L);
      // Undeclared exception!
      try { 
        duration0.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 1893417120000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Duration duration0 = Duration.standardDays(31622400000L);
      // Undeclared exception!
      try { 
        duration0.toStandardHours();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 758937600000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Duration duration0 = weeks0.toStandardDuration();
      // Undeclared exception!
      try { 
        duration0.toStandardDays();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -15032385536
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardSeconds((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 1000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardMinutes((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 60000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardHours((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 3600000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.standardDays((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * 86400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-1258L));
      Duration duration1 = duration0.withMillis((-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration0.plus((ReadableDuration) duration1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -1258000 + -9223372036854775808
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Duration duration0 = Duration.millis((-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration0.plus((-1235L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775808 + -1235
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.parse("H");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"H\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Duration duration0 = Duration.standardDays(86400000L);
      // Undeclared exception!
      try { 
        duration0.multipliedBy((-2878L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 7464960000000000 * -2878
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Duration duration0 = Duration.millis((-1902L));
      // Undeclared exception!
      try { 
        duration0.minus((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Duration duration0 = new Duration((-9223372036854775808L), (-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration0.dividedBy((-9223372036854775808L), (RoundingMode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Duration duration0 = Duration.standardDays(247L);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      // Undeclared exception!
      try { 
        duration0.dividedBy(0L, roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Duration duration0 = Duration.millis((-9223372036854775808L));
      RoundingMode roundingMode0 = RoundingMode.HALF_EVEN;
      // Undeclared exception!
      try { 
        duration0.dividedBy((-1L), roundingMode0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 / -1
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      // Undeclared exception!
      try { 
        duration0.dividedBy(0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      Duration duration0 = null;
      try {
        duration0 = new Duration(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No duration converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Duration duration0 = null;
      try {
        duration0 = new Duration(4184L, (-9223372036854775805L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -9223372036854775805 - 4184
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Duration duration0 = Duration.millis((-9223372036854775808L));
      // Undeclared exception!
      try { 
        duration0.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Negation of this duration would overflow
         //
         verifyException("org.joda.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Duration duration0 = Duration.millis((-3702L));
      Duration duration1 = duration0.ZERO.withDurationAdded((-3702L), (-510));
      assertEquals(1888L, duration1.getStandardSeconds());
      assertEquals((-3L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(10800000L);
      Duration duration1 = duration0.withDurationAdded(0L, (-2260));
      assertSame(duration1, duration0);
      assertEquals(648000000L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Duration duration0 = Duration.millis(86400000L);
      Duration duration1 = new Duration(duration0);
      assertEquals(86400000L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Duration duration0 = Duration.standardDays(247L);
      long long0 = duration0.getStandardDays();
      assertEquals(247L, long0);
      assertEquals(21340800000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      long long0 = duration0.getStandardMinutes();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Duration duration0 = Duration.standardDays(1L);
      long long0 = duration0.getStandardHours();
      assertEquals(86400000L, duration0.getMillis());
      assertEquals(24L, long0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-737L));
      long long0 = duration0.getStandardSeconds();
      assertEquals((-737L), long0);
      assertEquals((-737000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1846L);
      Duration duration1 = duration0.abs();
      assertSame(duration1, duration0);
      assertEquals(110760000L, duration1.getMillis());
  }



  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Duration duration0 = new Duration(4L, 4L);
      RoundingMode roundingMode0 = RoundingMode.FLOOR;
      Duration duration1 = duration0.dividedBy(1L, roundingMode0);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Duration duration1 = duration0.dividedBy((long) 1);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Duration duration0 = Duration.millis(4839L);
      Duration duration1 = duration0.multipliedBy(1L);
      assertSame(duration1, duration0);
      assertEquals(4839L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Duration duration0 = Duration.millis(3965L);
      duration0.ZERO.multipliedBy(3965L);
      assertEquals(3965L, duration0.getMillis());
      assertEquals(3L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Duration duration0 = hours0.toStandardDuration();
      Duration duration1 = duration0.minus((ReadableDuration) null);
      assertSame(duration0, duration1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Duration duration0 = hours0.toStandardDuration();
      Duration duration1 = duration0.plus((ReadableDuration) null);
      assertEquals(0L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) duration0, (-1036));
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Duration duration0 = hours0.toStandardDuration();
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) null, 34);
      assertEquals(0L, duration1.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Duration duration0 = hours0.toStandardDuration();
      Duration duration1 = duration0.withMillis(0L);
      assertSame(duration1, duration0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Duration duration0 = Duration.millis(0L);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Duration duration0 = Duration.millis(3965L);
      Duration duration1 = duration0.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(3L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(0L);
      long long0 = duration0.getStandardSeconds();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Duration duration0 = Duration.standardHours(60000L);
      Duration duration1 = duration0.plus(60000L);
      assertEquals(216000060L, duration1.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Duration duration0 = new Duration(186L);
      duration0.ZERO.toStandardMinutes();
      assertEquals(0L, duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L);
      Duration duration0 = new Duration(mutableDateTime0, mutableDateTime0);
      // Undeclared exception!
      try { 
        duration0.withDurationAdded((-9223372036854775808L), (-1767));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -9223372036854775808 * -1767
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      Duration duration0 = hours0.toStandardDuration();
      Duration duration1 = duration0.toDuration();
      assertEquals(0L, duration1.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Duration duration0 = Duration.parse((String) null);
      Duration duration1 = duration0.ZERO.withDurationAdded((-28L), 0);
      assertEquals(0L, duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Hours hours0 = duration0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }
}
