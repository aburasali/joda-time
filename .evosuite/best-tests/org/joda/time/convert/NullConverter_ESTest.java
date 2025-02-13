/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 03:20:19 GMT 2019
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.convert.NullConverter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NullConverter_ESTest extends NullConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullConverter nullConverter0 = NullConverter.INSTANCE;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        nullConverter0.setInto((ReadWritablePeriod) null, (Object) null, (Chronology) ethiopicChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.NullConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      Locale locale0 = Locale.ITALY;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        nullConverter0.setInto((ReadWritableInterval) null, (Object) locale0, (Chronology) buddhistChronology0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.NullConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("", periodFormatter0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      nullConverter0.setInto((ReadWritablePeriod) mutablePeriod0, (Object) "", (Chronology) buddhistChronology0);
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NullConverter nullConverter0 = new NullConverter();
      Class<?> class0 = nullConverter0.getSupportedType();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NullConverter nullConverter0 = NullConverter.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableInterval mutableInterval0 = new MutableInterval();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      nullConverter0.setInto((ReadWritableInterval) mutableInterval0, (Object) mutableDateTime0, (Chronology) ethiopicChronology0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NullConverter nullConverter0 = NullConverter.INSTANCE;
      MutableInterval mutableInterval0 = new MutableInterval();
      long long0 = nullConverter0.getDurationMillis(mutableInterval0);
      assertEquals(0L, long0);
  }
}
