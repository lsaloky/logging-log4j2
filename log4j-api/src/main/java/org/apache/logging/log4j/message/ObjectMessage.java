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
 * Handles messages that contain an Object.
 */
public class ObjectMessage implements Message, StringBuilderFormattable {

    private static final long serialVersionUID = -5903272448334166185L;

    /**
     * Creates the ObjectMessage.
     *
     * @param obj The Object to format.
     */
    public ObjectMessage(final Object obj) { }

    /**
     * Returns the formatted object message.
     *
     * @return the formatted object message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    @Override
    public void formatTo(final StringBuilder buffer) {
    }

    /**
     * Returns the object formatted using its toString method.
     *
     * @return the String representation of the object.
     */
    @Override
    public String getFormat() {
        return "";
    }

    /**
     * Returns the object parameter.
     *
     * @return The object.
     * @since 2.7
     */
    public Object getParameter() {
        return null;
    }

    /**
     * Returns the object as if it were a parameter.
     *
     * @return The object.
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

    private boolean equalObjectsOrStrings(final Object left, final Object right) {
        return true;
    }

    @Override
    public int hashCode() { return 0; }

    @Override
    public String toString() {
        return "";
    }

    private void writeObject(final ObjectOutputStream out) throws IOException {
    }

    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
    }

    /**
     * Gets the message if it is a throwable.
     *
     * @return the message if it is a throwable.
     */
    @Override
    public Throwable getThrowable() {
        return null;
    }
}
