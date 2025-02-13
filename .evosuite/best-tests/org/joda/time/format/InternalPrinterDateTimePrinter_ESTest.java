/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 02:49:36 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.Writer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.InternalPrinter;
import org.joda.time.format.InternalPrinterDateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InternalPrinterDateTimePrinter_ESTest extends InternalPrinterDateTimePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org/joda/time/tz/data");
      dateTimePrinter0.printTo((Writer) mockPrintWriter0, (ReadablePartial) null, locale0);
      assertEquals("zh_TW", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Locale locale0 = Locale.ROOT;
      Integer integer0 = new Integer(774);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-17L), gJChronology0, locale0, integer0, 774);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(0);
      dateTimePrinter0.printTo((Writer) charArrayWriter0, 2629746000L, (Chronology) gJChronology0, 5, dateTimeZone0, locale0);
      assertEquals("29", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-2299), (-292275054));
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_Fraction0);
      assertEquals((-292275054), dateTimePrinter0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_StringLiteral0);
      int int0 = dateTimePrinter0.estimatePrintedLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.ROOT;
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      LocalDate localDate0 = new LocalDate((long) 774);
      // Undeclared exception!
      try { 
        dateTimePrinter0.printTo((StringBuffer) null, (ReadablePartial) localDate0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_StringLiteral0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        dateTimePrinter0.printTo((StringBuffer) null, (-1275L), (Chronology) gregorianChronology0, 1, dateTimeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "org/joda/time/tz/data");
      LocalDateTime localDateTime0 = new LocalDateTime((-1344L), dateTimeZone0);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        internalPrinterDateTimePrinter0.printTo((Appendable) charBuffer0, (ReadablePartial) localDateTime0, locale0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDate localDate0 = LocalDate.now();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      Locale locale0 = Locale.ITALY;
      internalPrinterDateTimePrinter0.printTo((Appendable) charBuffer0, (long) 1, (Chronology) copticChronology0, 1, dateTimeZone0, locale0);
      // Undeclared exception!
      try { 
        internalPrinterDateTimePrinter0.printTo((Appendable) charBuffer0, (ReadablePartial) localDate0, locale0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        internalPrinterDateTimePrinter0.printTo((Appendable) null, (ReadablePartial) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.ITALY;
      PipedWriter pipedWriter0 = new PipedWriter();
      LocalTime localTime0 = LocalTime.now();
      try { 
        internalPrinterDateTimePrinter0.printTo((Appendable) pipedWriter0, (ReadablePartial) localTime0, locale0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LocalDate localDate0 = LocalDate.now();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      internalPrinterDateTimePrinter0.printTo((Appendable) charBuffer0, (ReadablePartial) localDate0, (Locale) null);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        internalPrinterDateTimePrinter0.printTo((Appendable) charBuffer0, (long) 1, (Chronology) copticChronology0, 1, dateTimeZone0, locale0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.ITALY;
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        internalPrinterDateTimePrinter0.printTo((Appendable) pipedWriter0, (long) 1, (Chronology) copticChronology0, 0, dateTimeZone0, locale0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      LocalDate localDate0 = LocalDate.now();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        dateTimePrinter0.printTo((Writer) null, (ReadablePartial) localDate0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        dateTimePrinter0.printTo((Writer) null, (long) 0, (Chronology) copticChronology0, 1, dateTimeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral((String) null);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      try { 
        dateTimePrinter0.estimatePrintedLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter1 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      boolean boolean0 = internalPrinterDateTimePrinter0.equals(internalPrinterDateTimePrinter1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      boolean boolean0 = internalPrinterDateTimePrinter0.equals(internalPrinterDateTimePrinter0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      boolean boolean0 = internalPrinterDateTimePrinter0.equals(dateTimeFormatterBuilder_TextField0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of((InternalPrinter) null);
      assertNull(dateTimePrinter0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter1 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(internalPrinterDateTimePrinter0);
      assertEquals(20, internalPrinterDateTimePrinter1.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      StringBuffer stringBuffer0 = new StringBuffer();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(792);
      dateTimePrinter0.printTo(stringBuffer0, (-94L), (Chronology) gJChronology0, 792, dateTimeZone0, locale0);
      assertEquals(2, stringBuffer0.length());
      assertEquals("59", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      StringBuffer stringBuffer0 = new StringBuffer();
      dateTimePrinter0.printTo(stringBuffer0, (ReadablePartial) null, locale0);
      assertEquals("zh", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      LocalDate localDate0 = LocalDate.now();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.ITALY;
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        dateTimePrinter0.printTo((Writer) pipedWriter0, (ReadablePartial) localDate0, locale0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      Locale locale0 = Locale.ITALY;
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        dateTimePrinter0.printTo((Writer) pipedWriter0, 0L, (Chronology) copticChronology0, (-599), dateTimeZone0, locale0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TextField0);
      int int0 = dateTimePrinter0.estimatePrintedLength();
      assertEquals(6, int0);
  }
}
