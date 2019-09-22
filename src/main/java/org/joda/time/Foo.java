/*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.joda.time.base.BasePartial;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Foo extends BaseSingleFieldPeriod{
	   public static final Foo ZERO = new Foo(0);
	    /** Constant representing one day. */
	    public static final Foo ONE = new Foo(1);
	    /** Constant representing two days. */
	    public static final Foo TWO = new Foo(2);
	    /** Constant representing three days. */
	    public static final Foo THREE = new Foo(3);
	    /** Constant representing four days. */
	    public static final Foo FOUR = new Foo(4);
	    /** Constant representing five days. */
	    public static final Foo FIVE = new Foo(5);
	    /** Constant representing six days. */
	    public static final Foo SIX = new Foo(6);
	    /** Constant representing seven days. */
	    public static final Foo SEVEN = new Foo(7);
	    /** Constant representing the maximum number of days that can be stored in this object. */
	    public static final Foo MAX_VALUE = new Foo(Integer.MAX_VALUE);
	    /** Constant representing the minimum number of days that can be stored in this object. */
	    public static final Foo MIN_VALUE = new Foo(Integer.MIN_VALUE);

	    /** The paser to use for this class. */
	    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.days());
	    /** Serialization version. */
	    private static final long serialVersionUID = 87525275727380865L;

	    public Foo(int i) {
	        super(i);
		// TODO Auto-generated constructor stub
		}

		//-----------------------------------------------------------------------
	    /**
	     * Obtains an instance of <code>Foo</code> that may be cached.
	     * <code>Foo</code> is immutable, so instances can be cached and shared.
	     * This factory method provides access to shared instances.
	     *
	     * @param days  the number of days to obtain an instance for
	     * @return the instance of Foo
	     */
	    public static Foo days(int days) {
	        switch (days) {
	            case 0:
	                return ZERO;
	            case 1:
	                return ONE;
	            case 2:
	                return TWO;
	            case 3:
	                return THREE;
	            case 4:
	                return FOUR;
	            case 5:
	                return FIVE;
	            case 6:
	                return SIX;
	            case 7:
	                return SEVEN;
	            case Integer.MAX_VALUE:
	                return MAX_VALUE;
	            case Integer.MIN_VALUE:
	                return MIN_VALUE;
	            default:
	                return new Foo(days);
	        }
	    }

		@Override
		public DurationFieldType getFieldType() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public PeriodType getPeriodType() {
			// TODO Auto-generated method stub
			return null;
		}

}
