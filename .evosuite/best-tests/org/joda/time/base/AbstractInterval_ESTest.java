/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 01:48:10 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractInterval_ESTest extends AbstractInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval((-991L), (-991L), dateTimeZone0);
      interval0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      MutableInterval mutableInterval0 = new MutableInterval();
      Duration duration0 = new Duration(mutableInterval0);
      Interval interval0 = new Interval(dateTime0, duration0);
      boolean boolean0 = mutableInterval0.equals(interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      mutableInterval0.setInterval(0L, 24L);
      boolean boolean0 = interval0.isAfter((ReadableInterval) mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MutableInterval mutableInterval0 = new MutableInterval((-1L), (-1L), ethiopicChronology0);
      DateTime dateTime0 = mutableInterval0.getStart();
      MutableInterval mutableInterval1 = new MutableInterval(dateTime0, dateTime0);
      mutableInterval1.setDurationAfterStart(100000L);
      boolean boolean0 = mutableInterval0.isEqual(mutableInterval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MutableInterval mutableInterval0 = new MutableInterval((-1L), (-1L), ethiopicChronology0);
      DateTime dateTime0 = mutableInterval0.getStart();
      MutableInterval mutableInterval1 = new MutableInterval(dateTime0, dateTime0);
      mutableInterval0.setDurationBeforeEnd((long) 1);
      boolean boolean0 = mutableInterval0.isEqual(mutableInterval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      Interval interval0 = new Interval((-991L), (-991L), dateTimeZone0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Chronology) copticChronology0);
      mutableInterval0.setEnd(dateTime0);
      boolean boolean0 = interval0.overlaps(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MutableInterval mutableInterval0 = new MutableInterval((-12L), (-12L), ethiopicChronology0);
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      MutableInterval mutableInterval1 = new MutableInterval(dateTime0, dateTime0);
      boolean boolean0 = mutableInterval0.overlaps(mutableInterval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setEnd((ReadableInstant) null);
      boolean boolean0 = mutableInterval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval((-991L), (-991L), dateTimeZone0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime((Chronology) copticChronology0);
      mutableInterval0.setEnd(dateTime0);
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(31).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      YearMonth yearMonth0 = YearMonth.parse("", dateTimeFormatter0);
      YearMonth yearMonth1 = yearMonth0.plusMonths(8);
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      Interval interval0 = yearMonth1.toInterval(dateTimeZone0);
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-134113030718680L), 10000L);
      Period period0 = mutableInterval0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      assertEquals(0L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      Interval interval1 = interval0.toInterval();
      assertSame(interval1, interval0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime((-839L), (Chronology) buddhistChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, (ReadableInstant) null);
      PeriodType periodType0 = PeriodType.days();
      Period period0 = new Period((Object) null, periodType0, buddhistChronology0);
      mutableInterval0.setPeriodAfterStart(period0);
      Interval interval0 = mutableInterval0.toInterval();
      assertEquals((-839L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      long long0 = mutableInterval0.toDurationMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-4243L), (-1L));
      long long0 = mutableInterval0.toDurationMillis();
      assertEquals(4242L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Duration duration0 = mutableInterval0.toDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(31).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      YearMonth yearMonth0 = YearMonth.parse("", dateTimeFormatter0);
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      Interval interval0 = yearMonth0.toInterval(dateTimeZone0);
      Duration duration0 = interval0.toDuration();
      assertEquals(2678400L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableDuration) null);
      boolean boolean0 = interval0.isBeforeNow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      mutableInterval0.setInterval(0L, 24L);
      boolean boolean0 = interval0.isBefore((ReadableInterval) mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) iSOChronology0);
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(dateTime0, dateTime0, periodType0);
      Minutes minutes0 = Minutes.standardMinutesIn(period0);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, minutes0);
      boolean boolean0 = mutableInterval0.isBefore((ReadableInstant) dateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTime dateTime0 = mutableDateTime0.toDateTime();
      Days days0 = Days.FOUR;
      Duration duration0 = days0.toStandardDuration();
      Interval interval0 = new Interval(dateTime0, duration0);
      boolean boolean0 = interval0.isBefore((ReadableInstant) dateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(407);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      LocalDate localDate1 = localDate0.plusWeeks(1);
      Interval interval0 = localDate1.toInterval();
      boolean boolean0 = interval0.isAfterNow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      Hours hours0 = Hours.SIX;
      mutableInterval0.setPeriodAfterStart(hours0);
      boolean boolean0 = mutableInterval0.isAfter((ReadableInterval) mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Interval interval0 = new Interval(2147483647L, 2147483647L);
      Instant instant0 = Instant.ofEpochSecond((byte)92);
      boolean boolean0 = interval0.isAfter((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Interval interval0 = new Interval((-1L), (-1L), (DateTimeZone) null);
      boolean boolean0 = interval0.isAfter((ReadableInstant) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getStart();
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MutableInterval mutableInterval0 = new MutableInterval((-1L), (-1L), ethiopicChronology0);
      DateTime dateTime0 = mutableInterval0.getStart();
      MutableInterval mutableInterval1 = new MutableInterval(dateTime0, dateTime0);
      mutableInterval0.setDurationBeforeEnd((long) 1);
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) mutableInterval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getEnd();
      assertEquals(0L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-1L));
      Minutes minutes0 = Minutes.minutesBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Interval interval0 = new Interval(minutes0, dateTime0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      DateTime dateTime1 = mutableInterval0.getEnd();
      assertTrue(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      Interval interval0 = yearMonth0.toInterval();
      boolean boolean0 = interval0.containsNow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1088L);
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, duration0);
      Interval interval0 = mutableInterval0.toInterval();
      boolean boolean0 = interval0.contains((ReadableInterval) mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Interval interval0 = new Interval((-2848L), (-2848L));
      DateTime dateTime0 = new DateTime((-2848L));
      boolean boolean0 = interval0.contains((ReadableInstant) dateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, dateTime0);
      // Undeclared exception!
      try { 
        mutableInterval0.isEqual((ReadableInterval) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      mutableInterval0.setInterval(0L, 24L);
      boolean boolean0 = mutableInterval0.isAfter(7L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      boolean boolean0 = mutableInterval0.isBefore(21859200000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      Interval interval0 = yearMonth0.toInterval();
      MutableInterval mutableInterval0 = new MutableInterval(interval0, (Chronology) null);
      boolean boolean0 = interval0.overlaps(mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      boolean boolean0 = mutableInterval0.contains(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime((-839L), (Chronology) buddhistChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, (ReadableInstant) null);
      boolean boolean0 = mutableInterval0.isAfterNow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) ethiopicChronology0);
      Interval interval0 = yearMonth0.toInterval();
      boolean boolean0 = interval0.isBeforeNow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = Instant.ofEpochSecond(0L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L, gJChronology0);
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      boolean boolean0 = mutableInterval0.equals(interval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = Instant.ofEpochSecond(0L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L, gJChronology0);
      Interval interval0 = mutableInterval0.toInterval();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(168L, periodType0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(89).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = dateTimeFormatter0.parseMutableDateTime("org/joda/time/tz/data");
      Duration duration0 = mutablePeriod0.toDurationTo(mutableDateTime0);
      Interval interval1 = interval0.withDurationAfterStart(duration0);
      boolean boolean0 = mutableInterval0.equals(interval1);
      assertFalse(boolean0);
      assertFalse(interval1.equals((Object)interval0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      Object object0 = new Object();
      boolean boolean0 = interval0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      Interval interval0 = new Interval(324L, 324L, dateTimeZone0);
      boolean boolean0 = interval0.equals(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      mutableInterval0.setInterval(0L, 24L);
      MutableInterval mutableInterval1 = interval0.toMutableInterval();
      boolean boolean0 = mutableInterval1.equals(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      boolean boolean0 = interval0.isAfter((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      boolean boolean0 = mutableInterval0.isAfter((ReadableInterval) mutableInterval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      boolean boolean0 = mutableInterval0.isAfter(0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1, 1);
      boolean boolean0 = mutableInterval0.isBefore((ReadableInterval) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Interval interval0 = new Interval(2147483647L, 2147483647L);
      DateTime dateTime0 = interval0.getEnd();
      Instant instant0 = dateTime0.toInstant();
      boolean boolean0 = interval0.isBefore((ReadableInstant) instant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      boolean boolean0 = interval0.isBefore(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      MutableInterval mutableInterval1 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      Hours hours0 = Hours.SIX;
      mutableInterval1.setPeriodAfterStart(hours0);
      boolean boolean0 = mutableInterval1.isEqual(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      boolean boolean0 = interval0.isEqual(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      MutableInterval mutableInterval1 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      mutableInterval0.setStartMillis((-3696L));
      boolean boolean0 = mutableInterval1.isEqual(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      mutableInterval0.setInterval(0L, 24L);
      MutableInterval mutableInterval1 = interval0.toMutableInterval();
      boolean boolean0 = mutableInterval0.overlaps(mutableInterval1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      boolean boolean0 = mutableInterval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      boolean boolean0 = mutableInterval0.overlaps((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Interval interval0 = yearMonth0.toInterval();
      boolean boolean0 = interval0.overlaps((ReadableInterval) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1, 1);
      boolean boolean0 = mutableInterval0.overlaps(mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      MutableInterval mutableInterval1 = new MutableInterval((-1804L), (-1804L), (Chronology) null);
      mutableInterval0.setStartMillis((-3696L));
      boolean boolean0 = mutableInterval1.contains((ReadableInterval) mutableInterval0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1, 1);
      boolean boolean0 = mutableInterval0.contains((ReadableInterval) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      boolean boolean0 = mutableInterval0.contains((ReadableInstant) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      mutableInterval0.setInterval(0L, 24L);
      boolean boolean0 = mutableInterval0.contains(0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      boolean boolean0 = interval0.contains(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval((-991L), (-991L), dateTimeZone0);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      // Undeclared exception!
      try { 
        mutableInterval0.setDurationAfterStart((-5542L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater than the start instant
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      boolean boolean0 = interval0.isBefore((ReadableInstant) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Instant instant0 = Instant.ofEpochSecond(0L);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L, gJChronology0);
      Interval interval0 = mutableInterval0.toInterval();
      boolean boolean0 = mutableInterval0.equals(interval0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = interval0.toMutableInterval();
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = mutableInterval0.toPeriod(periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1, 1);
      DateTime dateTime0 = mutableInterval0.getStart();
      assertEquals(1L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Interval interval0 = new Interval((ReadableDuration) null, (ReadableInstant) null);
      boolean boolean0 = interval0.isAfter((ReadableInstant) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      boolean boolean0 = interval0.containsNow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval(0L, 0L, dateTimeZone0);
      String string0 = interval0.toString();
      assertEquals("1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.000Z", string0);
  }
}
