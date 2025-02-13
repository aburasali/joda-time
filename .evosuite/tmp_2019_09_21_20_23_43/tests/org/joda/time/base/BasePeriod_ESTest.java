/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 01:46:31 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.FOUR;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks((-719));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Duration duration0 = hours0.toStandardDuration();
      Period period0 = new Period(duration0, (ReadableInstant) null);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = null;
      try {
        period0 = new Period(0, 0, 0, (-916), 0, (-1808), (-444), 0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-2833L));
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Instant instant0 = Instant.ofEpochSecond(0);
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      mutablePeriod0.mergePeriod(days0);
      Duration duration0 = mutablePeriod0.toDurationTo(instant0);
      assertEquals((-185542587187200L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Duration duration0 = period0.toDurationTo(dateTime0);
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1L), dateTimeZone0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 4, 4, 1, 4, 4, 1, 4);
      Duration duration0 = mutablePeriod0.toDurationTo(mutableDateTime0);
      assertEquals(13061041004L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      LocalDate localDate0 = new LocalDate();
      LocalDateTime localDateTime0 = new LocalDateTime(555L);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(localDateTime0, dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTime(localTime0, dateTimeZone0);
      Duration duration0 = mutablePeriod0.toDurationFrom(dateTime0);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.millis(0);
      // Undeclared exception!
      try { 
        period0.getValue((-1096));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1096
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 496, periodType0);
      int int0 = mutablePeriod0.getValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) gregorianChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-22));
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime(dateTimeZone0);
      Period period0 = new Period(dateTime0, dateTime0);
      PeriodType periodType0 = period0.getPeriodType();
      assertEquals(8, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1047L), periodType0, (Chronology) null);
      Period period0 = new Period(0, 0, (-2953), 0, 0, 0, 0, 0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2054, 2054, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-325L));
      Years years0 = Years.yearsBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      PeriodType periodType0 = years0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2456L, 2456L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addWeeks(1670);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-325L));
      Years years0 = Years.yearsBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      PeriodType periodType0 = years0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2456L, 2456L, periodType0);
      mutablePeriod0.addMillis(0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setDays(1691);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.days((-2679));
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.setMillis(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = null;
      try {
        period0 = new Period(5, (-2591), 5, 5, 3276, (-4290), (-2591), 3276, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period((Object) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(1, 1);
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = null;
      try {
        period0 = new Period(yearMonth0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      Period period0 = new Period(localDateTime0, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      LocalTime localTime0 = LocalTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(instant0, buddhistChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localTime0, localDateTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      Years years0 = Years.ONE;
      PeriodType periodType0 = years0.getPeriodType();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Instant instant0 = Instant.ofEpochMilli(17887500);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, instant0, periodType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      Duration duration0 = Duration.standardMinutes((-2800L));
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(duration0, instant0, periodType0);
      Period period1 = period0.withDays(811);
      Duration duration1 = period1.toDurationFrom(instant0);
      assertEquals(1166480L, duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2606), (-778), 1, 1, 0, 1, (-778), 0, (PeriodType) null);
      mutablePeriod0.add(46, (-740), (-1333), (-778), 106, (-1333), (-8), 46);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, instant0);
      mutablePeriod0.addHours((-1889));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1L));
      Period period0 = Period.hours(0);
      Duration duration0 = period0.toStandardDuration();
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, periodType0);
      mutablePeriod0.setHours(0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      Duration duration0 = Duration.standardMinutes((-2800L));
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(duration0, instant0, periodType0);
      Duration duration1 = period0.toDurationFrom(instant0);
      assertEquals((-1L), duration1.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1L), dateTimeZone0);
      Duration duration0 = new Duration(1000000L, 0L);
      MutablePeriod mutablePeriod0 = new MutablePeriod(mutableDateTime0, duration0);
      Duration duration1 = mutablePeriod0.toDurationTo(mutableDateTime0);
      assertEquals((-1000000L), duration1.getMillis());
  }
}
