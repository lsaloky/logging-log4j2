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

import java.io.Serializable;

/**
 * Default factory for flow messages.
 *
 * @since 2.6
 */
public class DefaultFlowMessageFactory implements FlowMessageFactory, Serializable {

    private static final long serialVersionUID = 8578655591131397576L;


    public DefaultFlowMessageFactory() {
        this("","");
    }

    public DefaultFlowMessageFactory(final String entryText, final String exitText) {
    }

    /**
     * Gets the entry text.
     * @return the entry text.
     */
    public String getEntryText() {
        return "";
    }

    /**
     * Gets the exit text.
     * @return the exit text.
     */
    public String getExitText() {
        return "";
    }

    /*
     * (non-Javadoc)
     *
     * @see org.apache.logging.log4j.message.MessageFactory#newEntryMessage(org.apache.logging.log4j.message.Message)
     */
    @Override
    public EntryMessage newEntryMessage(final Message message) {
        return null;
    }

    private Message makeImmutable(final Message message) {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.apache.logging.log4j.message.FlowMessageFactory#newExitMessage(org.apache.logging.log4j.message.EntryMessage)
     */
    @Override
    public ExitMessage newExitMessage(final EntryMessage message) {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.apache.logging.log4j.message.FlowMessageFactory#newExitMessage(java.lang.Object, org.apache.logging.log4j.message.EntryMessage)
     */
    @Override
    public ExitMessage newExitMessage(final Object result, final EntryMessage message) {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.apache.logging.log4j.message.FlowMessageFactory#newExitMessage(java.lang.Object, org.apache.logging.log4j.message.Message)
     */
    @Override
    public ExitMessage newExitMessage(final Object result, final Message message) {
        return null;
    }
}
