/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 01:49:43 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Minutes;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.Days;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;
public class Hours_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.dividedBy((-2019));
      boolean boolean0 = hours0.isLessThan(hours1);
      assertEquals(0, hours1.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Seconds seconds0 = Seconds.MAX_VALUE;
      Hours hours1 = seconds0.toStandardHours();
      boolean boolean0 = hours0.isGreaterThan(hours1);
      assertEquals(596523, hours1.getHours());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Weeks weeks0 = hours0.toStandardWeeks();
      assertEquals((-12782640), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.negated();
      Hours hours2 = hours1.plus(hours0);
      Seconds seconds0 = hours2.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Seconds seconds0 = hours0.ONE.toStandardSeconds();
      assertEquals(3600, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = hours0.minus(25);
      Seconds seconds0 = hours1.toStandardSeconds();
      assertEquals((-79200), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.hours((-1237));
      Minutes minutes0 = hours0.toStandardMinutes();
      assertEquals((-74220), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      Duration duration0 = hours0.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Duration duration0 = hours0.MIN_VALUE.toStandardDuration();
      assertEquals((-7730941132800L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = hours0.plus(469);
      Days days0 = hours1.toStandardDays();
      assertEquals(19, days0.getDays());
      assertEquals(477, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Days days0 = hours0.MIN_VALUE.toStandardDays();
      assertEquals((-89478485), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.EIGHT;
      Hours hours2 = hours0.plus(hours1);
      assertEquals((-2147483640), hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = hours0.plus(0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = hours0.TWO.plus((-1478));
      assertEquals((-1476), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      hours0.negated();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.hours((-2114));
      hours0.negated();
      assertEquals((-2114), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.negated();
      Hours hours2 = hours1.plus(hours0);
      Hours hours3 = hours2.multipliedBy(3374);
      assertEquals(0, hours3.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.multipliedBy((-2023));
      assertEquals((-2023), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = hours0.minus((Hours) null);
      assertSame(hours0, hours1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      Hours hours1 = hours0.minus(0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      int int0 = hours0.getHours();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.negated();
      int int0 = hours1.getHours();
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.dividedBy((-2019));
      Minutes minutes0 = hours1.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      // Undeclared exception!
      try { 
        hours0.MAX_VALUE.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 60
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Foo foo0 = Foo.THREE;
      // Undeclared exception!
      try { 
        Hours.standardHoursIn(foo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.hours((-1552));
      // Undeclared exception!
      try { 
        hours0.MAX_VALUE.plus(352831696);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 352831696
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      // Undeclared exception!
      try { 
        hours0.negated();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      // Undeclared exception!
      try { 
        hours0.multipliedBy(Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 6 * -2147483648
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hours hours0 = Hours.hours((-1400));
      Hours hours1 = Hours.MIN_VALUE;
      // Undeclared exception!
      try { 
        hours0.minus(hours1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Integer.MIN_VALUE cannot be negated
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      // Undeclared exception!
      try { 
        hours0.minus(1054);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: -2147483648 + -1054
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Instant instant0 = Instant.now();
      Hours hours0 = Hours.hoursBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = new Duration((-177L), 0L);
      Hours hours0 = duration0.toStandardHours();
      // Undeclared exception!
      try { 
        hours0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Hours", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Duration duration0 = new Duration((-177L), 0L);
      Hours hours0 = duration0.toStandardHours();
      Hours hours1 = hours0.plus(3);
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hours hours0 = Hours.hours(5);
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hours hours0 = Hours.hours(8);
      assertEquals(8, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hours hours0 = Hours.hours(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        hours0.plus(hours0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hours hours0 = Hours.hours(2);
      Duration duration0 = hours0.MAX_VALUE.toStandardDuration();
      assertEquals(2, hours0.getHours());
      assertEquals(7730941129200L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hours hours0 = Hours.hours(6);
      assertEquals(6, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      hours0.getFieldType();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Days days0 = Days.THREE;
      Hours hours1 = days0.toStandardHours();
      boolean boolean0 = hours0.isLessThan(hours1);
      assertTrue(boolean0);
      assertEquals(72, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.minus(13);
      boolean boolean0 = hours1.isLessThan((Hours) null);
      assertEquals((-6), hours1.getHours());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.isLessThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.negated();
      boolean boolean0 = hours0.isGreaterThan(hours1);
      assertEquals((-1), hours1.getHours());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.isGreaterThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = hours0.dividedBy(1);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.dividedBy(4);
      assertEquals(1, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.minus((Hours) null);
      assertEquals(7, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.TWO.plus((Hours) null);
      assertFalse(hours1.equals((Object)hours0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Hours hours0 = Hours.parseHours("PT1H");
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.EIGHT;
      Hours hours2 = hours0.minus(hours1);
      Hours hours3 = hours0.minus(hours2);
      assertEquals((-7), hours2.getHours());
      assertNotSame(hours3, hours0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Hours hours0 = Hours.hours(7);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Hours hours0 = Hours.hours(4);
      assertEquals(4, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Hours hours0 = Hours.hours(3);
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Hours hours0 = Hours.hours(1);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Hours hours0 = Hours.hours(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Minutes minutes0 = hours0.FIVE.toStandardMinutes();
      assertEquals(300, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Hours hours0 = Hours.hours(1484);
      int int0 = hours0.getHours();
      assertEquals(1484, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Weeks weeks0 = hours0.FIVE.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      PeriodType periodType0 = hours0.getPeriodType();
      assertEquals("Hours", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Days days0 = hours0.SIX.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Hours hours0 = weeks0.toStandardHours();
      Hours hours1 = hours0.THREE.multipliedBy(5);
      assertEquals(15, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Hours hours0 = Hours.standardHoursIn((ReadablePeriod) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      String string0 = hours0.TWO.toString();
      assertEquals("PT2H", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = hours0.minus(0);
      assertEquals(4, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      // Undeclared exception!
      try { 
        hours0.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 3600
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
