/*
 * This file was automatically generated by EvoSuite
 * Sun Sep 22 03:15:37 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.JodaTimePermission;
import org.junit.runner.RunWith;

public class JodaTimePermission_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JodaTimePermission jodaTimePermission0 = null;
      try {
        jodaTimePermission0 = new JodaTimePermission((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
         verifyException("java.security.BasicPermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JodaTimePermission jodaTimePermission0 = null;
      try {
        jodaTimePermission0 = new JodaTimePermission("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // name can't be empty
         //
         verifyException("java.security.BasicPermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JodaTimePermission jodaTimePermission0 = new JodaTimePermission("$/;%{[EFh-P]sGY");
      assertEquals("(\"org.joda.time.JodaTimePermission\" \"$/;%{[EFh-P]sGY\")", jodaTimePermission0.toString());
  }
}
