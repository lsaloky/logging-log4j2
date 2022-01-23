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

import java.io.ObjectInputStream;

import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.StringBuilderFormattable;

/**
 * Captures information about all running Threads.
 */
@AsynchronouslyFormattable
public class ThreadDumpMessage implements Message, StringBuilderFormattable {
    private static final long serialVersionUID = -1103400781608841088L;

    public ThreadDumpMessage(final String title) { }

    private ThreadDumpMessage(final String formattedMsg, final String title) {  }

    @Override
    public String toString() {
        return getFormattedMessage();
    }

    @Override
    public String getFormattedMessage() { return ""; }

    @Override
    public void formatTo(final StringBuilder sb) { }

    @Override
    public String getFormat() { return ""; }

    @Override
    public Object[] getParameters() {
        return Constants.EMPTY_OBJECT_ARRAY;
    }

    protected Object writeReplace() {
        return null;
    }

    private void readObject(final ObjectInputStream stream) { }

    @Override
    public Throwable getThrowable() {
        return null;
    }
}
