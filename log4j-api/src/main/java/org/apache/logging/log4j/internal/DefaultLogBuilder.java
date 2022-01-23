/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.internal;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.util.Supplier;


/**
 * Collects data for a log event and then logs it. This class should be considered private.
 */
public class DefaultLogBuilder implements LogBuilder {



    public DefaultLogBuilder(Logger logger, Level level) {
    }

    public DefaultLogBuilder(Logger logger) {
    }

    /**
     * This method should be considered internal. It is used to reset the LogBuilder for a new log message.
     * @param level The logging level for this event.
     * @return This LogBuilder instance.
     */
    public LogBuilder reset(Level level) {
        return this;
    }

    @Override
    public LogBuilder withMarker(Marker marker) {
        return this;
    }

    @Override
    public LogBuilder withThrowable(Throwable throwable) {
        return this;
    }

    @Override
    public LogBuilder withLocation() {
        return this;
    }

    @Override
    public LogBuilder withLocation(StackTraceElement location) {
        return this;
    }
    
    public boolean isInUse() {
        return false;
    }

    @Override
    public void log(Message message) {
    }

    @Override
    public void log(CharSequence message) {
    }

    @Override
    public void log(String message) {
    }

    @Override
    public void log(String message, Object... params) {
    }

    @Override
    public void log(String message, Supplier<?>... params) {
    }

    @Override
    public void log(Supplier<Message> messageSupplier) {
    }

    @Override
    public void log(Object message) {
    }

    @Override
    public void log(String message, Object p0) {
    }

    @Override
    public void log(String message, Object p0, Object p1) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
            Object p7) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
            Object p7, Object p8) {
    }

    @Override
    public void log(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
            Object p7, Object p8, Object p9) {
    }

    @Override
    public void log() {
    }

    private void logMessage(Message message) {
    }

    private boolean isValid() {
        return true;
    }
}
