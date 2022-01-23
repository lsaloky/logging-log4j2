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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Provides some level of compatibility with Log4j 1.x and convenience but is not the recommended way to Localize
 * messages.
 * <p>
 * The recommended way to localize messages is to log a message id. Log events should then be recorded without
 * formatting into a data store. The application that is used to read the events and display them to the user can then
 * localize and format the messages for the end user.
 * </p>
 */
public class LocalizedMessage implements Message, LoggerNameAwareMessage {
    private static final long serialVersionUID = 3893703791567290742L;

    public LocalizedMessage(final String messagePattern, final Object[] arguments) {
    }

    public LocalizedMessage(final String baseName, final String key, final Object[] arguments) {
    }

    public LocalizedMessage(final ResourceBundle bundle, final String key, final Object[] arguments) {
    }

    public LocalizedMessage(final String baseName, final Locale locale, final String key, final Object[] arguments) {
    }

    public LocalizedMessage(final ResourceBundle bundle, final Locale locale, final String key,
            final Object[] arguments) {
    }

    public LocalizedMessage(final Locale locale, final String key, final Object[] arguments) {
    }

    public LocalizedMessage(final String messagePattern, final Object arg) {
    }

    public LocalizedMessage(final String baseName, final String key, final Object arg) {
    }

    /**
     * @since 2.8
     */
    public LocalizedMessage(final ResourceBundle bundle, final String key) {
    }

    public LocalizedMessage(final ResourceBundle bundle, final String key, final Object arg) {
    }

    public LocalizedMessage(final String baseName, final Locale locale, final String key, final Object arg) {
    }

    public LocalizedMessage(final ResourceBundle bundle, final Locale locale, final String key, final Object arg) {
    }

    public LocalizedMessage(final Locale locale, final String key, final Object arg) {
    }

    public LocalizedMessage(final String messagePattern, final Object arg1, final Object arg2) {
    }

    public LocalizedMessage(final String baseName, final String key, final Object arg1, final Object arg2) {
    }

    public LocalizedMessage(final ResourceBundle bundle, final String key, final Object arg1, final Object arg2) {
    }

    public LocalizedMessage(final String baseName, final Locale locale, final String key, final Object arg1,
            final Object arg2) {
    }

    public LocalizedMessage(final ResourceBundle bundle, final Locale locale, final String key, final Object arg1,
            final Object arg2) {
    }

    public LocalizedMessage(final Locale locale, final String key, final Object arg1, final Object arg2) {
    }

    /**
     * Set the name of the Logger.
     * 
     * @param name The name of the Logger.
     */
    @Override
    public void setLoggerName(final String name) { }

    /**
     * Returns the name of the Logger.
     * 
     * @return the name of the Logger.
     */
    @Override
    public String getLoggerName() { return ""; }

    /**
     * Returns the formatted message after looking up the format in the resource bundle.
     * 
     * @return The formatted message String.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    @Override
    public String getFormat() {
        return "";
    }

    @Override
    public Object[] getParameters() {
        return null;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }

    /**
     * Override this to use a ResourceBundle.Control in Java 6
     * 
     * @param rbBaseName The base name of the resource bundle, a fully qualified class name.
     * @param resourceBundleLocale The locale to use when formatting the message.
     * @param loop If true the key will be treated as a package or class name and a resource bundle will be located
     *            based on all or part of the package name. If false the key is expected to be the exact bundle id.
     * @return The ResourceBundle.
     */
    protected ResourceBundle getResourceBundle(final String rbBaseName, final Locale resourceBundleLocale,
            final boolean loop) {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }

    private void writeObject(final ObjectOutputStream out) throws IOException {
    }

    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
    }
}
