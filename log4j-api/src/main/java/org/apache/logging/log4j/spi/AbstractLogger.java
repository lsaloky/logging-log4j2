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
package org.apache.logging.log4j.spi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.LoggingException;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.internal.DefaultLogBuilder;
import org.apache.logging.log4j.message.DefaultFlowMessageFactory;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.FlowMessageFactory;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.MessageFactory2;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.message.ReusableMessageFactory;
import org.apache.logging.log4j.message.SimpleMessage;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.LambdaUtil;
import org.apache.logging.log4j.util.LoaderUtil;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.apache.logging.log4j.util.StackLocatorUtil;
import org.apache.logging.log4j.util.Strings;
import org.apache.logging.log4j.util.Supplier;

/**
 * Base implementation of a Logger. It is highly recommended that any Logger implementation extend this class.
 */
public abstract class AbstractLogger implements ExtendedLogger, LocationAwareLogger, Serializable {

    private static final long serialVersionUID = 2L;

    public AbstractLogger() { }

    public AbstractLogger(final String name) { }

    public AbstractLogger(final String name, final MessageFactory messageFactory) { }

    public static void checkMessageFactory(final ExtendedLogger logger, final MessageFactory messageFactory) { }

    @Override
    public void catching(final Level level, final Throwable throwable) { }

    protected void catching(final String fqcn, final Level level, final Throwable throwable) { }

    @Override
    public void catching(final Throwable throwable) { }

    protected Message catchingMsg(final Throwable throwable) {
        return new SimpleMessage(); 
    }

    private static Class<? extends MessageFactory> createClassForProperty(final String property,
            final Class<ReusableMessageFactory> reusableParameterizedMessageFactoryClass,
            final Class<ParameterizedMessageFactory> parameterizedMessageFactoryClass) {
        return null;
    }

    private static Class<? extends FlowMessageFactory> createFlowClassForProperty(final String property,
            final Class<DefaultFlowMessageFactory> defaultFlowMessageFactoryClass) {
        return null;
    }

    private static MessageFactory2 createDefaultMessageFactory() { return null; }

    private static MessageFactory2 narrow(final MessageFactory result) { return null; }

    private static FlowMessageFactory createDefaultFlowMessageFactory() { return null; }

    @Override
    public void debug(final Marker marker, final CharSequence message) { }

    @Override
    public void debug(final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void debug(final Marker marker, final Message message) {
    }

    @Override
    public void debug(final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void debug(final Marker marker, final Object message) {
    }

    @Override
    public void debug(final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void debug(final Marker marker, final String message) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void debug(final Message message) {
    }

    @Override
    public void debug(final Message message, final Throwable throwable) {
    }

    @Override
    public void debug(final CharSequence message) {
    }

    @Override
    public void debug(final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void debug(final Object message) {
    }

    @Override
    public void debug(final Object message, final Throwable throwable) {
    }

    @Override
    public void debug(final String message) {
    }

    @Override
    public void debug(final String message, final Object... params) {
    }

    @Override
    public void debug(final String message, final Throwable throwable) {
    }

    @Override
    public void debug(final Supplier<?> messageSupplier) {
    }

    @Override
    public void debug(final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void debug(final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void debug(final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void debug(final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void debug(final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void debug(final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void debug(final MessageSupplier messageSupplier) {
    }

    @Override
    public void debug(final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void debug(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void debug(final String message, final Object p0) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8) {
    }

    @Override
    public void debug(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8, final Object p9) {
    }

    protected EntryMessage enter(final String fqcn, final String format, final Supplier<?>... paramSuppliers) {
        return null;
    }

    protected EntryMessage enter(final String fqcn, final String format, final MessageSupplier... paramSuppliers) {
        return null;
    }

    protected EntryMessage enter(final String fqcn, final String format, final Object... params) {
        return null;
    }

    protected EntryMessage enter(final String fqcn, final MessageSupplier messageSupplier) {
        return null;
    }

    protected EntryMessage enter(final String fqcn, final Message message) {
        return null;
    }

    @Override
    public void entry() { }

    @Override
    public void entry(final Object... params) { }

    protected void entry(final String fqcn, final Object... params) {
    }

    protected EntryMessage entryMsg(final String format, final Object... params) {
        return null;
    }

    protected EntryMessage entryMsg(final String format, final MessageSupplier... paramSuppliers) {
        return null;
    }

    protected EntryMessage entryMsg(final String format, final Supplier<?>... paramSuppliers) {
        return null;
    }

    @Override
    public void error(final Marker marker, final Message message) {
    }

    @Override
    public void error(final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void error(final Marker marker, final CharSequence message) {
    }

    @Override
    public void error(final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void error(final Marker marker, final Object message) {
    }

    @Override
    public void error(final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void error(final Marker marker, final String message) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void error(final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void error(final Message message) {
    }

    @Override
    public void error(final Message message, final Throwable throwable) {
    }

    @Override
    public void error(final CharSequence message) {
    }

    @Override
    public void error(final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void error(final Object message) {
    }

    @Override
    public void error(final Object message, final Throwable throwable) {
    }

    @Override
    public void error(final String message) {
    }

    @Override
    public void error(final String message, final Object... params) {
    }

    @Override
    public void error(final String message, final Throwable throwable) {
    }

    @Override
    public void error(final Supplier<?> messageSupplier) {
    }

    @Override
    public void error(final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void error(final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void error(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void error(final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void error(final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void error(final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void error(final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void error(final MessageSupplier messageSupplier) {
    }

    @Override
    public void error(final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void error(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void error(final String message, final Object p0) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void error(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void exit() {
    }

    @Override
    public <R> R exit(final R result) { return result; }

    protected <R> R exit(final String fqcn, final R result) {
        return result;
    }

    protected <R> R exit(final String fqcn, final String format, final R result) {
        return result;
    }

    protected Message exitMsg(final String format, final Object result) {
        return null;

    }

    @Override
    public void fatal(final Marker marker, final Message message) {
    }

    @Override
    public void fatal(final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void fatal(final Marker marker, final CharSequence message) {
    }

    @Override
    public void fatal(final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void fatal(final Marker marker, final Object message) {
    }

    @Override
    public void fatal(final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void fatal(final Marker marker, final String message) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void fatal(final Message message) {
    }

    @Override
    public void fatal(final Message message, final Throwable throwable) {
    }

    @Override
    public void fatal(final CharSequence message) {
    }

    @Override
    public void fatal(final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void fatal(final Object message) {
    }

    @Override
    public void fatal(final Object message, final Throwable throwable) {
    }

    @Override
    public void fatal(final String message) {
    }

    @Override
    public void fatal(final String message, final Object... params) {
    }

    @Override
    public void fatal(final String message, final Throwable throwable) {
    }

    @Override
    public void fatal(final Supplier<?> messageSupplier) {
    }

    @Override
    public void fatal(final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void fatal(final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void fatal(final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void fatal(final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void fatal(final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void fatal(final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void fatal(final MessageSupplier messageSupplier) {
    }

    @Override
    public void fatal(final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void fatal(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void fatal(final String message, final Object p0) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void fatal(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8, final Object p9) {
    }

    @SuppressWarnings("unchecked")
    @Override
    public <MF extends MessageFactory> MF getMessageFactory() { return null; }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void info(final Marker marker, final Message message) {
    }

    @Override
    public void info(final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void info(final Marker marker, final CharSequence message) {
    }

    @Override
    public void info(final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void info(final Marker marker, final Object message) {
    }

    @Override
    public void info(final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void info(final Marker marker, final String message) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void info(final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void info(final Message message) {
    }

    @Override
    public void info(final Message message, final Throwable throwable) {
    }

    @Override
    public void info(final CharSequence message) {
    }

    @Override
    public void info(final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void info(final Object message) {
    }

    @Override
    public void info(final Object message, final Throwable throwable) {
    }

    @Override
    public void info(final String message) {
    }

    @Override
    public void info(final String message, final Object... params) {
    }

    @Override
    public void info(final String message, final Throwable throwable) {
    }

    @Override
    public void info(final Supplier<?> messageSupplier) {
    }

    @Override
    public void info(final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void info(final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void info(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void info(final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void info(final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void info(final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void info(final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void info(final MessageSupplier messageSupplier) {
    }

    @Override
    public void info(final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void info(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void info(final String message, final Object p0) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8) {
    }

    @Override
    public void info(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public boolean isDebugEnabled() { return false; }

    @Override
    public boolean isDebugEnabled(final Marker marker) {
        return false;
    }

    @Override
    public boolean isEnabled(final Level level) {
        return false;
    }

    @Override
    public boolean isEnabled(final Level level, final Marker marker) { return false; }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled(final Marker marker) {
        return false;
    }

    @Override
    public boolean isFatalEnabled() {
        return false;
    }

    @Override
    public boolean isFatalEnabled(final Marker marker) {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled(final Marker marker) {
        return false;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isTraceEnabled(final Marker marker) {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled(final Marker marker) {
        return false;
    }

    @Override
    public void log(final Level level, final Marker marker, final Message message) {
    }

    @Override
    public void log(final Level level, final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Marker marker, final CharSequence message) {
    }

    @Override
    public void log(final Level level, final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Marker marker, final Object message) {
    }

    @Override
    public void log(final Level level, final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Message message) {
    }

    @Override
    public void log(final Level level, final Message message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final CharSequence message) {
    }

    @Override
    public void log(final Level level, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Object message) {
    }

    @Override
    public void log(final Level level, final Object message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final String message) {
    }

    @Override
    public void log(final Level level, final String message, final Object... params) {
    }

    @Override
    public void log(final Level level, final String message, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Supplier<?> messageSupplier) {
    }

    @Override
    public void log(final Level level, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void log(final Level level, final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void log(final Level level, final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void log(final Level level, final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final MessageSupplier messageSupplier) {
    }

    @Override
    public void log(final Level level, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3, final Object p4) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3, final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void log(final Level level, final Marker marker, final String message, final Object p0, final Object p1,
            final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void log(final Level level, final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final Message message,
            final Throwable throwable) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker,
            final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final Object message,
            final Throwable throwable) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final CharSequence message,
            final Throwable throwable) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final Supplier<?> messageSupplier,
            final Throwable throwable) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object... params) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void logIfEnabled(final String fqcn, final Level level, final Marker marker, final String message,
            final Throwable throwable) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final CharSequence message,
            final Throwable throwable) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final Object message,
            final Throwable throwable) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker,
            final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final Supplier<?> messageSupplier,
            final Throwable throwable) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Throwable throwable) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object... params) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    protected void logMessage(final String fqcn, final Level level, final Marker marker, final String message,
            final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void logMessage(final Level level, final Marker marker, final String fqcn, final StackTraceElement location,
        final Message message, final Throwable throwable) {
    }

    protected void log(final Level level, final Marker marker, final String fqcn, final StackTraceElement location,
        final Message message, final Throwable throwable) {
    }

    @Override
    public void printf(final Level level, final Marker marker, final String format, final Object... params) {
    }

    @Override
    public void printf(final Level level, final String format, final Object... params) {
    }

    private void logMessageSafely(final String fqcn, final Level level, final Marker marker, final Message message,
            final Throwable throwable) {
    }

    private void logMessageTrackRecursion(final String fqcn,
                                          final Level level,
                                          final Marker marker,
                                          final Message message,
                                          final Throwable throwable) {
    }

    private static int[] getRecursionDepthHolder() { return new int[1]; }

    private static void incrementRecursionDepth() {
        getRecursionDepthHolder()[0]++;
    }

    private static void decrementRecursionDepth() { getRecursionDepthHolder()[0]--; }

    public static int getRecursionDepth() {
        return getRecursionDepthHolder()[0];
    }

    private void tryLogMessage(final String fqcn,
                               final StackTraceElement location,
                               final Level level,
                               final Marker marker,
                               final Message message,
                               final Throwable throwable) {
    }

    private StackTraceElement getLocation(String fqcn) {
        return null;
    }

    private void handleLogMessageException(final Throwable throwable, final String fqcn, final Message message) {
    }

    @Override
    public <T extends Throwable> T throwing(final T throwable) {
        return throwable;
    }

    @Override
    public <T extends Throwable> T throwing(final Level level, final T throwable) {
        return throwable;
    }

    protected <T extends Throwable> T throwing(final String fqcn, final Level level, final T throwable) {
        return throwable;
    }

    protected Message throwingMsg(final Throwable throwable) {
        return new SimpleMessage();
    }

    @Override
    public void trace(final Marker marker, final Message message) {
    }

    @Override
    public void trace(final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void trace(final Marker marker, final CharSequence message) {
    }

    @Override
    public void trace(final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void trace(final Marker marker, final Object message) {
    }

    @Override
    public void trace(final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void trace(final Marker marker, final String message) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void trace(final Message message) {
    }

    @Override
    public void trace(final Message message, final Throwable throwable) {
    }

    @Override
    public void trace(final CharSequence message) {
    }

    @Override
    public void trace(final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void trace(final Object message) {
    }

    @Override
    public void trace(final Object message, final Throwable throwable) {
    }

    @Override
    public void trace(final String message) {
    }

    @Override
    public void trace(final String message, final Object... params) {
    }

    @Override
    public void trace(final String message, final Throwable throwable) {
    }

    @Override
    public void trace(final Supplier<?> messageSupplier) {
    }

    @Override
    public void trace(final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void trace(final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void trace(final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void trace(final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void trace(final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void trace(final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void trace(final MessageSupplier messageSupplier) {
    }

    @Override
    public void trace(final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void trace(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void trace(final String message, final Object p0) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void trace(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public EntryMessage traceEntry() {
        return null;
    }

    @Override
    public EntryMessage traceEntry(final String format, final Object... params) {
        return null;
    }

    @Override
    public EntryMessage traceEntry(final Supplier<?>... paramSuppliers) { return null; }

    @Override
    public EntryMessage traceEntry(final String format, final Supplier<?>... paramSuppliers) { return null; }

    @Override
    public EntryMessage traceEntry(final Message message) {
        return null;
    }

    @Override
    public void traceExit() { }

    @Override
    public <R> R traceExit(final R result) { return result; }

    @Override
    public <R> R traceExit(final String format, final R result) { return result; }

    @Override
    public void traceExit(final EntryMessage message) { }

    @Override
    public <R> R traceExit(final EntryMessage message, final R result) { return result; }

    @Override
    public <R> R traceExit(final Message message, final R result) { return result; }

    @Override
    public void warn(final Marker marker, final Message message) {
    }

    @Override
    public void warn(final Marker marker, final Message message, final Throwable throwable) {
    }

    @Override
    public void warn(final Marker marker, final CharSequence message) {
    }

    @Override
    public void warn(final Marker marker, final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void warn(final Marker marker, final Object message) {
    }

    @Override
    public void warn(final Marker marker, final Object message, final Throwable throwable) {
    }

    @Override
    public void warn(final Marker marker, final String message) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object... params) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Throwable throwable) {
    }

    @Override
    public void warn(final Message message) {
    }

    @Override
    public void warn(final Message message, final Throwable throwable) {
    }

    @Override
    public void warn(final CharSequence message) {
    }

    @Override
    public void warn(final CharSequence message, final Throwable throwable) {
    }

    @Override
    public void warn(final Object message) {
    }

    @Override
    public void warn(final Object message, final Throwable throwable) {
    }

    @Override
    public void warn(final String message) {
    }

    @Override
    public void warn(final String message, final Object... params) {
    }

    @Override
    public void warn(final String message, final Throwable throwable) {
    }

    @Override
    public void warn(final Supplier<?> messageSupplier) {
    }

    @Override
    public void warn(final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void warn(final Marker marker, final Supplier<?> messageSupplier) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void warn(final Marker marker, final Supplier<?> messageSupplier, final Throwable throwable) {
    }

    @Override
    public void warn(final String message, final Supplier<?>... paramSuppliers) {
    }

    @Override
    public void warn(final Marker marker, final MessageSupplier messageSupplier) {
    }

    @Override
    public void warn(final Marker marker, final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void warn(final MessageSupplier messageSupplier) {
    }

    @Override
    public void warn(final MessageSupplier messageSupplier, final Throwable throwable) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void warn(final Marker marker, final String message, final Object p0, final Object p1, final Object p2,
            final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
    }

    @Override
    public void warn(final String message, final Object p0) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
    }

    @Override
    public void warn(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6,
            final Object p7, final Object p8, final Object p9) {
    }

    protected boolean requiresLocation() {
        return false;
    }

    @Override
    public LogBuilder atTrace() {
        return atLevel(Level.TRACE);
    }

    @Override
    public LogBuilder atDebug() {
        return atLevel(Level.DEBUG);
    }
    
    @Override
    public LogBuilder atInfo() {
        return atLevel(Level.INFO);
    }
    
    @Override
    public LogBuilder atWarn() {
        return atLevel(Level.WARN);
    }
    
    @Override
    public LogBuilder atError() {
        return atLevel(Level.ERROR);
    }
    
    @Override
    public LogBuilder atFatal() {
        return atLevel(Level.FATAL);
    }
    
    @Override
    public LogBuilder always() { return new DefaultLogBuilder(this); }
    
    @Override
    public LogBuilder atLevel(Level level) { return LogBuilder.NOOP; }

    private DefaultLogBuilder getLogBuilder(Level level) {
        return new DefaultLogBuilder(this, level);
    }

    private void readObject (final ObjectInputStream s) throws ClassNotFoundException, IOException {
    }
}
