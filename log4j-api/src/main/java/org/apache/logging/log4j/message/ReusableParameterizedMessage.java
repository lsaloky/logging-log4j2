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
package org.apache.logging.log4j.message;

import java.util.Arrays;

import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.apache.logging.log4j.util.StringBuilders;

/**
 * Reusable parameterized message. This message is mutable and is not safe to be accessed or modified by multiple
 * threads concurrently.
 *
 * @see ParameterizedMessage
 * @since 2.6
 */
@PerformanceSensitive("allocation")
public class ReusableParameterizedMessage implements ReusableMessage, ParameterVisitable, Clearable {

    private static final long serialVersionUID = 7800075879295123856L;

    transient boolean reserved = false; // LOG4J2-1583 prevent scrambled logs with nested logging calls

    /**
     * Creates a reusable message.
     */
    public ReusableParameterizedMessage() {
    }

    private Object[] getTrimmedParams() {
        return null;
    }

    private Object[] getParams() {
        return null;
    }

    // see interface javadoc
    @Override
    public Object[] swapParameters(final Object[] emptyReplacement) {
        return emptyReplacement;
    }

    // see interface javadoc
    @Override
    public short getParameterCount() {
        return (short) 0;
    }

    @Override
    public <S> void forEachParameter(final ParameterConsumer<S> action, final S state) {
    }

    @Override
    public Message memento() {
        return null;
    }

    private void init(final String messagePattern, final int argCount, final Object[] paramArray) {
    }

    private static int count(final String messagePattern, final int[] indices) {
        return 0;
    }

    private void initThrowable(final Object[] params, final int argCount, final int usedParams) {
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object... arguments) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
        return this;
    }

    ReusableParameterizedMessage set(final String messagePattern, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
        return this;
    }

    /**
     * Returns the message pattern.
     * @return the message pattern.
     */
    @Override
    public String getFormat() {
        return "";
    }

    /**
     * Returns the message parameters.
     * @return the message parameters.
     */
    @Override
    public Object[] getParameters() {
        return null;
    }

    /**
     * Returns the Throwable that was given as the last argument, if any.
     * It will not survive serialization. The Throwable exists as part of the message
     * primarily so that it can be extracted from the end of the list of parameters
     * and then be added to the LogEvent. As such, the Throwable in the event should
     * not be used once the LogEvent has been constructed.
     *
     * @return the Throwable, if any.
     */
    @Override
    public Throwable getThrowable() {
        return null;
    }

    /**
     * Returns the formatted message.
     * @return the formatted message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    private StringBuilder getBuffer() {
        return new StringBuilder();
    }

    @Override
    public void formatTo(final StringBuilder builder) {
    }

    /**
     * Sets the reserved flag to true and returns this object.
     * @return this object
     * @since 2.7
     */
    ReusableParameterizedMessage reserve() {
        return this;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void clear() { // LOG4J2-1583
    }
}
