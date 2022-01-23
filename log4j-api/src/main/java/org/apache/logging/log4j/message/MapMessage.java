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

import org.apache.logging.log4j.util.BiConsumer;
import org.apache.logging.log4j.util.Constants;
import org.apache.logging.log4j.util.IndexedReadOnlyStringMap;
import org.apache.logging.log4j.util.MultiFormatStringBuilderFormattable;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.Map;

/**
 * Represents a Message that consists of a Map.
 * <p>
 * Thread-safety note: the contents of this message can be modified after construction.
 * When using asynchronous loggers and appenders it is not recommended to modify this message after the message is
 * logged, because it is undefined whether the logged message string will contain the old values or the modified
 * values.
 * </p>
 * <p>
 * This class was pulled up from {@link StringMapMessage} to allow for Objects as values.
 * </p>
 * @param <M> Allow subclasses to use fluent APIs and override methods that return instances of subclasses.
 * @param <V> The value type
 */
public class MapMessage<M extends MapMessage<M, V>, V> implements MultiFormatStringBuilderFormattable {

    private static final long serialVersionUID = -5031471831131487120L;

    public enum MapFormat {

        XML,
        JSON,
        JAVA,
        JAVA_UNQUOTED;

        public static MapFormat lookupIgnoreCase(final String format) { return null; }

        public static String[] names() {
            return new String[] {XML.name(), JSON.name(), JAVA.name(), JAVA_UNQUOTED.name()};
        }
    }

    public MapMessage() { }

    public MapMessage(final int initialCapacity) {
    }

    public MapMessage(final Map<String, V> map) {
    }

    @Override
    public String[] getFormats() {
        return null;
    }

    @Override
    public Object[] getParameters() {
        return Constants.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public String getFormat() {
        return "";
    }

    @SuppressWarnings("unchecked")
    public Map<String, V> getData() {
        return null;
    }

    public IndexedReadOnlyStringMap getIndexedReadOnlyStringMap() {
        return null;
    }

    public void clear() {
    }

    public boolean containsKey(final String key) {
        return false;
    }

    public void put(final String candidateKey, final String value) {
    }

    public void putAll(final Map<String, String> map) {
    }

    public String get(final String key) {
        return "";
    }

    public String remove(final String key) {
        return "";
    }

    public String asString() { return ""; }

    public String asString(final String format) { return ""; }

    public <CV> void forEach(final BiConsumer<String, ? super CV> action) {
    }

    public <CV, S> void forEach(final TriConsumer<String, ? super CV, S> action, final S state) {
    }

    private StringBuilder format(final MapFormat format, final StringBuilder sb) {
        return null;
    }

    public void asXml(final StringBuilder sb) {
    }

    @Override
    public String getFormattedMessage() {
        return null;
    }

    @Override
    public String getFormattedMessage(final String[] formats) {
        return null;
    }

    private MapFormat getFormat(final String[] formats) {
        return null;
    }

    protected void appendMap(final StringBuilder sb) {
    }

    protected void asJson(final StringBuilder sb) {
    }

    protected void asJavaUnquoted(final StringBuilder sb) {
    }

    protected void asJava(final StringBuilder sb) {
    }

    private void asJava(final StringBuilder sb, boolean quoted) {
    }

    @SuppressWarnings("unchecked")
    public M newInstance(final Map<String, V> map) {
        return (M) this;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void formatTo(final StringBuilder buffer) {
    }

    @Override
    public void formatTo(final String[] formats, final StringBuilder buffer) {
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }

    protected void validate(final String key, final boolean value) {
    }

    protected void validate(final String key, final byte value) {
    }

    protected void validate(final String key, final char value) {
    }

    protected void validate(final String key, final double value) {
    }

    protected void validate(final String key, final float value) {
    }

    protected void validate(final String key, final int value) {
    }

    protected void validate(final String key, final long value) {
    }

    protected void validate(final String key, final Object value) {
    }

    protected void validate(final String key, final short value) {
    }

    protected void validate(final String key, final String value) {
    }

    protected String toKey(final String candidateKey) {
    	return "";
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final boolean value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final byte value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final char value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final double value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final float value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final int value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final long value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final Object value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final short value) {
        return (M) this;
    }

    @SuppressWarnings("unchecked")
    public M with(final String candidateKey, final String value) {
        return (M) this;
    }

}
