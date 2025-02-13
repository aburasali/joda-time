/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 03:07:23 GMT 2019
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.convert.ReadableIntervalConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadableIntervalConverter_ESTest extends ReadableIntervalConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      MutablePeriod mutablePeriod0 = new MutablePeriod((-906), 1, 1, 1);
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritablePeriod) mutablePeriod0, (Object) "org.joda.time.chrono.ISOChronology", (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritableInterval) null, (Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      MutablePeriod mutablePeriod0 = new MutablePeriod((-906), (-906), 85, 85);
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritableInterval) null, (Object) mutablePeriod0, (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.joda.time.MutablePeriod cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-919), (-919), (-919), (-919));
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritablePeriod) mutablePeriod0, (Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      boolean boolean0 = readableIntervalConverter0.isReadableInterval((Object) null, (Chronology) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      Class<?> class0 = readableIntervalConverter0.getSupportedType();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }
}
