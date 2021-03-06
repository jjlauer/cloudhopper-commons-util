/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.cloudhopper.commons.util.time;

import org.joda.time.DateTime;

/**
 *
 * 
 * @author joelauer
 */
public class DateTimeMonth extends DateTimePeriod {

    protected DateTimeMonth(DateTime start, DateTime end) {
        super(start, end, DateTimeDuration.MONTH, "yyyy-MM", "MMMM yyyy", "yyyy-MM", "MM");
    }

    @Override
    public DateTimePeriod getNext() {
        DateTime next = getStart().plusMonths(1);
        return DateTimePeriod.createMonth(next);
    }

    @Override
    public DateTimePeriod getPrevious() {
        DateTime previous = getStart().minusMonths(1);
        return DateTimePeriod.createMonth(previous);
    }

    @Override
    public DateTimeDuration getDefaultSubDuration() {
        return DateTimeDuration.DAY;
    }
    
}
