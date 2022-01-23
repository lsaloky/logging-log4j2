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

/**
 * Handles messages that contain an Object[].
 * <p>
 * Created for use with the CSV layout. For example:
 * </p>
 * <p>
 * {@code logger.debug(new ObjectArrayMessage(1, 2, "Bob"));}
 * </p>
 * 
 * @since 2.4
 */
public final class ObjectArrayMessage implements Message {

    private static final long serialVersionUID = -5903272448334166185L;

    /**
     * Creates the ObjectMessage.
     * 
     * @param obj
     *            The Object to format.
     */
    public ObjectArrayMessage(final Object... obj) { }

    private boolean equalObjectsOrStrings(final Object[] left, final Object[] right) {
        return true;
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
     * Returns the object formatted using its toString method.
     * 
     * @return the String representation of the object.
     */
    @Override
    public String getFormat() { return ""; }

    /**
     * Returns the formatted object message.
     * 
     * @return the formatted object message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    /**
     * Returns the object as if it were a parameter.
     * 
     * @return The object.
     */
    @Override
    public Object[] getParameters() {
        return null;
    }

    /**
     * Returns null.
     *
     * @return null.
     */
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
