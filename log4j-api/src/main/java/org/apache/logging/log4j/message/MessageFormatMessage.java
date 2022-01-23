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
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;

/**
 * Handles messages that consist of a format string conforming to java.text.MessageFormat.
 *
 * @serial In version 2.1, due to a bug in the serialization format, the serialization format was changed along with
 * its {@code serialVersionUID} value.
 */
public class MessageFormatMessage implements Message {

    /**
     * Constructs a message.
     * 
     * @param locale the locale for this message format
     * @param messagePattern the pattern for this message format
     * @param parameters The objects to format
     * @since 2.6
     */
    public MessageFormatMessage(final Locale locale, final String messagePattern, final Object... parameters) {
    }

    /**
     * Constructs a message.
     * 
     * @param messagePattern the pattern for this message format
     * @param parameters The objects to format
     */
    public MessageFormatMessage(final String messagePattern, final Object... parameters) {
    }

    /**
     * Returns the formatted message.
     * @return the formatted message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    /**
     * Returns the message pattern.
     * @return the message pattern.
     */
    @Override
    public String getFormat() { return ""; }

    /**
     * Returns the message parameters.
     * @return the message parameters.
     */
    @Override
    public Object[] getParameters() {
        return null;
    }

    protected String formatMessage(final String msgPattern, final Object... args) {
        return "";
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

    @Override
    public int hashCode() {
        return 0;
    }


    @Override
    public String toString() {
        return "";
    }

    private void writeObject(final ObjectOutputStream out) throws IOException {
    }

    private void readObject(final ObjectInputStream in) throws IOException {
    }

    /**
     * Return the throwable passed to the Message.
     *
     * @return the Throwable.
     */
    @Override
    public Throwable getThrowable() {
        return null;
    }
}
