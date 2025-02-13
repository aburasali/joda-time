/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 02:39:48 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicFixedMonthChronology_ESTest extends BasicFixedMonthChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInMonthMax(933);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      int int0 = copticChronology0.getDaysInYearMonth(0, 60);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.getYearDifference(31557600000L, 11308377600000L);
      assertEquals((-358L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.setYear(712L, 2615625);
      assertEquals(82489641408000712L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      boolean boolean0 = ethiopicChronology0.isLeapYear(1815);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0, 6);
      boolean boolean0 = ethiopicChronology0.isLeapYear(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.getYearDifference(31557600000L, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getTotalMillisByYearMonth(1988, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getTotalMillisByYearMonth(1989, 1989);
      assertEquals(5152896000000L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      long long0 = copticChronology0.getTotalMillisByYearMonth(0, 0);
      assertEquals((-2592000000L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMonthOfYear(0L, 30);
      assertEquals(20166, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getMonthOfYear(31557600000L, 2968);
      assertEquals((-12231), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMonthOfYear(0L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getMaxMonth();
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInYearMonth(0, 0);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDayOfMonth(0L);
      assertEquals(23, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15778800000L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInMonthMax(0);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInMonthMax(13);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        copticChronology0.getDateMidnightMillis(839, 13, 839);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 839 for dayOfMonth must be in the range [1,6]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getYearDifference((-176L), 1);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getYearDifference(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.setYear(6, 13);
      assertEquals((-52795843199994L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      CopticChronology copticChronology0 = new CopticChronology(julianChronology0, (Object) null, 1);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getAverageMillisPerYear();
      assertEquals(31557600000L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getAverageMillisPerMonth();
      assertEquals(2592000000L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInMonthMax();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.getDateMidnightMillis(1, 13, 1);
      assertEquals((-53153107200000L), long0);
  }
}
