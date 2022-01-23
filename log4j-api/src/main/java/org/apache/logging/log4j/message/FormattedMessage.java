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

/**
 * Handles messages that contain a format String. Dynamically determines if the format conforms to
 * MessageFormat or String.format and if not then uses ParameterizedMessage to format.
 */
public class FormattedMessage implements Message {

    private static final long serialVersionUID = -665975803997290697L;
    
    /**
     * Constructs with a locale, a pattern and a single parameter.
     * @param locale The locale
     * @param messagePattern The message pattern.
     * @param arg The parameter.
     * @since 2.6
     */
    public FormattedMessage(final Locale locale, final String messagePattern, final Object arg) {
    }

    /**
     * Constructs with a locale, a pattern and two parameters.
     * @param locale The locale
     * @param messagePattern The message pattern.
     * @param arg1 The first parameter.
     * @param arg2 The second parameter.
     * @since 2.6
     */
    public FormattedMessage(final Locale locale, final String messagePattern, final Object arg1, final Object arg2) {
    }

    /**
     * Constructs with a locale, a pattern and a parameter array.
     * @param locale The locale
     * @param messagePattern The message pattern.
     * @param arguments The parameter.
     * @since 2.6
     */
    public FormattedMessage(final Locale locale, final String messagePattern, final Object... arguments) {
    }

    /**
     * Constructs with a locale, a pattern, a parameter array, and a throwable.
     * @param locale The Locale
     * @param messagePattern The message pattern.
     * @param arguments The parameter.
     * @param throwable The throwable
     * @since 2.6
     */
    public FormattedMessage(final Locale locale, final String messagePattern, final Object[] arguments, final Throwable throwable) {
    }

    /**
     * Constructs with a pattern and a single parameter.
     * @param messagePattern The message pattern.
     * @param arg The parameter.
     */
    public FormattedMessage(final String messagePattern, final Object arg) {
    }

    /**
     * Constructs with a pattern and two parameters.
     * @param messagePattern The message pattern.
     * @param arg1 The first parameter.
     * @param arg2 The second parameter.
     */
    public FormattedMessage(final String messagePattern, final Object arg1, final Object arg2) {
    }

    /**
     * Constructs with a pattern and a parameter array.
     * @param messagePattern The message pattern.
     * @param arguments The parameter.
     */
    public FormattedMessage(final String messagePattern, final Object... arguments) {
    }

    /**
     * Constructs with a pattern, a parameter array, and a throwable.
     * @param messagePattern The message pattern.
     * @param arguments The parameter.
     * @param throwable The throwable
     */
    public FormattedMessage(final String messagePattern, final Object[] arguments, final Throwable throwable) {
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return true;
    }

    /**
     * Gets the message pattern.
     * @return the message pattern.
     */
    @Override
    public String getFormat() {
        return "";
    }

    /**
     * Gets the formatted message.
     * @return the formatted message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    protected Message getMessage(final String msgPattern, final Object[] args, final Throwable aThrowable) {
        return null;
    }

    /**
     * Gets the message parameters.
     * @return the message parameters.
     */
    @Override
    public Object[] getParameters() {
        return null;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }


    @Override
    public int hashCode() {
        return 0;
    }

    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
    }

    @Override
    public String toString() {
        return "";
    }

    private void writeObject(final ObjectOutputStream out) throws IOException {
    }
}
