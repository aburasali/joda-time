/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 03:16:27 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseLocal_ESTest extends BaseLocal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Hours hours0 = Hours.SEVEN;
      LocalTime localTime1 = localTime0.withPeriodAdded(hours0, (-1));
      assertFalse(localTime1.equals((Object)localTime0));
  }
}
