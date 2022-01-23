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

import java.util.Iterator;
import java.util.List;

/**
 * A collection of StructuredDataMessages.
 */
public class StructuredDataCollectionMessage implements StringBuilderFormattable,
        MessageCollectionMessage<StructuredDataMessage> {
    private static final long serialVersionUID = 5725337076388822924L;

    public StructuredDataCollectionMessage(final List<StructuredDataMessage> messages) {
    }

    @Override
    public Iterator<StructuredDataMessage> iterator() {
        return null;
    }

    @Override
    public String getFormattedMessage() {
        return "";
    }

    @Override
    public String getFormat() {
        return "";
    }

    @Override
    public void formatTo(final StringBuilder buffer) {
    }

    @Override
    public Object[] getParameters() {
        return Constants.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }
}
