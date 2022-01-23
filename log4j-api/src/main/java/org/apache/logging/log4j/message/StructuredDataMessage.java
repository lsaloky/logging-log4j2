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

import java.util.Map;

import org.apache.logging.log4j.util.EnglishEnums;
import org.apache.logging.log4j.util.StringBuilders;

/**
 * Represents a Message that conforms to an RFC 5424 StructuredData element along with the syslog message.
 * <p>
 * Thread-safety note: the contents of this message can be modified after construction.
 * When using asynchronous loggers and appenders it is not recommended to modify this message after the message is
 * logged, because it is undefined whether the logged message string will contain the old values or the modified
 * values.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc5424">RFC 5424</a>
 */
@AsynchronouslyFormattable
public class StructuredDataMessage extends MapMessage<StructuredDataMessage, String> {

    private static final long serialVersionUID = 1703221292892071920L;

    public enum Format { XML, FULL }

    public StructuredDataMessage(final String id, final String msg, final String type) { }

    public StructuredDataMessage(final String id, final String msg, final String type, final int maxLength) { }
    
    public StructuredDataMessage(final String id, final String msg, final String type,
                                 final Map<String, String> data) { }

    public StructuredDataMessage(final String id, final String msg, final String type,
                                 final Map<String, String> data, final int maxLength) { }

    public StructuredDataMessage(final StructuredDataId id, final String msg, final String type) { }
    
    public StructuredDataMessage(final StructuredDataId id, final String msg, final String type, final int maxLength) { }

    public StructuredDataMessage(final StructuredDataId id, final String msg, final String type,
                                 final Map<String, String> data) { }

    public StructuredDataMessage(final StructuredDataId id, final String msg, final String type,
                                 final Map<String, String> data, final int maxLength) {
    }


    private StructuredDataMessage(final StructuredDataMessage msg, final Map<String, String> map) { }

    protected StructuredDataMessage() { }

    @Override
    public String[] getFormats() {
        return null;
    }

    /**
     * Returns this message id.
     * @return the StructuredDataId.
     */
    public StructuredDataId getId() {
        return null;
    }

    /**
     * Sets the id from a String. This ID can be at most 32 characters long.
     * @param id The String id.
     */
    protected void setId(final String id) { }

    /**
     * Sets the id.
     * @param id The StructuredDataId.
     */
    protected void setId(final StructuredDataId id) { }

    /**
     * Returns this message type.
     * @return the type.
     */
    public String getType() {
        return "";
    }

    protected void setType(final String type) {
    }

    @Override
    public void formatTo(final StringBuilder buffer) { }

    @Override
    public void formatTo(final String[] formats, final StringBuilder buffer) {
    }

    /**
     * Returns the message.
     * @return the message.
     */
    @Override
    public String getFormat() {
        return "";
    }

    protected void setMessageFormat(final String msg)  { }
    /**
     * Formats the structured data as described in RFC 5424.
     *
     * @return The formatted String.
     */
    @Override
    public String asString() {
        return "";
    }

    /**
     * Formats the structured data as described in RFC 5424.
     *
     * @param format The format identifier. Ignored in this implementation.
     * @return The formatted String.
     */

    @Override
    public String asString(final String format) {
        return "";
    }

    /**
     * Formats the structured data as described in RFC 5424.
     *
     * @param format           "full" will include the type and message. null will return only the STRUCTURED-DATA as
     *                         described in RFC 5424
     * @param structuredDataId The SD-ID as described in RFC 5424. If null the value in the StructuredData
     *                         will be used.
     * @return The formatted String.
     */
    public final String asString(final Format format, final StructuredDataId structuredDataId) {
        return "";
    }

    /**
     * Formats the structured data as described in RFC 5424.
     *
     * @param format           "full" will include the type and message. null will return only the STRUCTURED-DATA as
     *                         described in RFC 5424
     * @param structuredDataId The SD-ID as described in RFC 5424. If null the value in the StructuredData
     *                         will be used.
     * @param sb The StringBuilder to append the formatted message to.
     */
    public final void asString(final Format format, final StructuredDataId structuredDataId, final StringBuilder sb) {
    }

    private void asXml(final StructuredDataId structuredDataId, final StringBuilder sb) {
    }

    /**
     * Formats the message and return it.
     * @return the formatted message.
     */
    @Override
    public String getFormattedMessage() {
        return "";
    }

    /**
     * Formats the message according to the specified format.
     * @param formats An array of Strings that provide extra information about how to format the message.
     * StructuredDataMessage accepts only a format of "FULL" which will cause the event type to be
     * prepended and the event message to be appended. Specifying any other value will cause only the
     * StructuredData to be included. The default is "FULL".
     *
     * @return the formatted message.
     */
    @Override
    public String getFormattedMessage(final String[] formats) {
        return "";
    }

    private Format getFormat(final String[] formats) {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }


    @Override
    public StructuredDataMessage newInstance(final Map<String, String> map) {
        return new StructuredDataMessage(this, null);
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
    protected void validate(final String key, final boolean value) {  }

    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final byte value) { }

    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final char value) {  }
    
    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final double value) {  }
    
    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final float value) {  }

    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final int value) { }

    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final long value) { }

    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final Object value) {  }

    /**
     * @since 2.9
     */
    @Override
    protected void validate(final String key, final short value) {  }

    @Override
    protected void validate(final String key, final String value) {  }

    protected void validateKey(final String key) { }

}
