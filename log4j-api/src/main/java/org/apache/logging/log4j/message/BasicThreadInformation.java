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

/**
 * Generates information about the current Thread. Used internally by ThreadDumpMessage.
 */
class BasicThreadInformation implements ThreadInformation {

    /**
     * The Constructor.
     * @param thread The Thread to capture.
     */
    BasicThreadInformation(final Thread thread) {
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final BasicThreadInformation that = (BasicThreadInformation) o;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * Print the thread information.
     * @param sb The StringBuilder.
     */
    @Override
    public void printThreadInfo(final StringBuilder sb) {
    }

    /**
     * Format the StackTraceElements.
     * @param sb The StringBuilder.
     * @param trace The stack trace element array to format.
     */
    @Override
    public void printStack(final StringBuilder sb, final StackTraceElement[] trace) {
    }
}
