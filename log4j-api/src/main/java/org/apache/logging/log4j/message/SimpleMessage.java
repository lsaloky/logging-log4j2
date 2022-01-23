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

import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.StringBuilderFormattable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The simplest possible implementation of Message. It just returns the String given as the constructor argument.
 */
public class SimpleMessage implements Message, StringBuilderFormattable, CharSequence {
    private static final long serialVersionUID = -8398002534962715992L;


    /**
     * Basic constructor.
     */
    public SimpleMessage() {
        this(null);
    }

    /**
     * Constructor that includes the message.
     * @param message The String message.
     */
    public SimpleMessage(final String message) {
    }

    /**
     * Constructor that includes the message.
     * @param charSequence The CharSequence message.
     */
    public SimpleMessage(final CharSequence charSequence) {
    }

    /**
     * Returns the message.
     * @return the message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    @Override
    public void formatTo(final StringBuilder buffer) { }

    /**
     * Returns the message.
     * @return the message.
     */
    @Override
    public String getFormat() {
        return "";
    }

    /**
     * Returns null since there are no parameters.
     * @return null.
     */
    @Override
    public Object[] getParameters() {
        return Constants.EMPTY_OBJECT_ARRAY;
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

    /**
     * Always returns null.
     *
     * @return null
     */
    @Override
    public Throwable getThrowable() {
        return null;
    }


    // CharSequence impl

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(final int index) {
        return ' ';
    }

    @Override
    public CharSequence subSequence(final int start, final int end) {
        return null;
    }


    private void writeObject(final ObjectOutputStream out) throws IOException {
    }

    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
    }
}
