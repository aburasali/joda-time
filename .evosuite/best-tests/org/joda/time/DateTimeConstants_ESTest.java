/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 03:22:23 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeConstants;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeConstants_ESTest extends DateTimeConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeConstants dateTimeConstants0 = new DateTimeConstants();
      assertEquals(24, DateTimeConstants.HOURS_PER_DAY);
  }
}
