/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 01:26:14 GMT 2019
 */

package org.joda.time.convert;

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
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.convert.StringConverter;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringConverter_ESTest extends StringConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis("Priod oes not support field '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Priod oes not support field '\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis("q8DKj2b,|=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"q8DKj2b,|=\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis(" pF=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \" pF=\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      long long0 = stringConverter0.getInstantMillis("0", iSOChronology0);
      assertEquals((-62167219200000L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritablePeriod) null, (Object) null, (Chronology) julianChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(762L, 0L);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritablePeriod) mutablePeriod0, (Object) mutablePeriod0, (Chronology) copticChronology0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.joda.time.MutablePeriod cannot be cast to java.lang.String
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritableInterval) null, (Object) null, (Chronology) islamicChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      DateTime dateTime0 = new DateTime(3000L, dateTimeZone0);
      Duration duration0 = Duration.standardHours(918L);
      MutableInterval mutableInterval0 = new MutableInterval(dateTime0, duration0);
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritableInterval) mutableInterval0, (Object) mutableInterval0, (Chronology) islamicChronology0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.joda.time.MutableInterval cannot be cast to java.lang.String
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1000);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, (DateTimeParser) null);
      // Undeclared exception!
      try { 
        stringConverter0.getPartialValues((ReadablePartial) null, (Object) null, (Chronology) iSOChronology0, dateTimeFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Parsing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      YearMonth yearMonth0 = YearMonth.now();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      // Undeclared exception!
      try { 
        stringConverter0.getPartialValues((ReadablePartial) yearMonth0, (Object) yearMonth0, (Chronology) null, dateTimeFormatter1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) ethiopicChronology0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        stringConverter0.getPartialValues((ReadablePartial) localDateTime0, (Object) ethiopicChronology0.EE, (Chronology) ethiopicChronology0, dateTimeFormatter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      // Undeclared exception!
      try { 
        stringConverter0.getInstantMillis((Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        stringConverter0.getInstantMillis("", julianChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.standard();
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis(periodFormatter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.joda.time.format.PeriodFormatter cannot be cast to java.lang.String
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      MutableInterval mutableInterval0 = new MutableInterval((Object) null, (Chronology) null);
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritableInterval) mutableInterval0, (Object) "1/w#XI+PqF", (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"w#XI+PqF\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      MutableInterval mutableInterval0 = new MutableInterval(0L, 989L);
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritableInterval) mutableInterval0, (Object) "", (Chronology) iSOChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: 
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("1/XI+PqF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"XI+PqF\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("PR!d#o:U[Wxfs/9y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"PR!d#o:U[Wxfs\" is malformed at \"R!d#o:U[Wxfs\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritableInterval) mutableInterval0, (Object) "/WC+tq:", (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format invalid: /WC+tq:
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritablePeriod) mutablePeriod0, (Object) "P/`Q|I", (Chronology) copticChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"P/`Q|I\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (PeriodType) null);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        stringConverter0.setInto((ReadWritablePeriod) mutablePeriod0, (Object) "x,fAI%q*ouZM", (Chronology) gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"x,fAI%q*ouZM\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis("PSriod[dos not sCppor jield '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"PSriod[dos not sCppor jield '\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      // Undeclared exception!
      try { 
        stringConverter0.getDurationMillis("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(60000).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1));
      DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZone(dateTimeZone0);
      int[] intArray0 = stringConverter0.getPartialValues((ReadablePartial) localDate0, (Object) "", (Chronology) gJChronology0, dateTimeFormatter1);
      assertArrayEquals(new int[] {1970, 1, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringConverter stringConverter0 = new StringConverter();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) islamicChronology0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      try { 
        stringConverter0.getPartialValues((ReadablePartial) localDateTime0, (Object) "dayOfYear", (Chronology) islamicChronology0, dateTimeFormatter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"dayOfYear\"
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      Class<?> class0 = stringConverter0.getSupportedType();
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      StringConverter stringConverter0 = StringConverter.INSTANCE;
      // Undeclared exception!
      try { 
        stringConverter0.getInstantMillis(1, buddhistChronology0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }
}
