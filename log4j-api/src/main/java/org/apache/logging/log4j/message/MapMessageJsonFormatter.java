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

import org.apache.logging.log4j.util.IndexedStringMap;
import org.apache.logging.log4j.util.StringBuilderFormattable;

import java.util.Collection;
import java.util.List;
import java.util.Map;

enum MapMessageJsonFormatter {;

    private static int readMaxDepth() {
        return 0;
    }

    static void format(final StringBuilder sb, final Object object) {
        format(sb, object, 0);
    }

    private static void format(
            final StringBuilder sb,
            final Object object,
            final int depth) {
    }

    private static void formatIndexedStringMap(
            final StringBuilder sb,
            final IndexedStringMap map,
            final int depth) {
    }

    private static void formatMap(
            final StringBuilder sb,
            final Map<Object, Object> map,
            final int depth) {
    }

    private static void formatList(
            final StringBuilder sb,
            final List<Object> items,
            final int depth) {
    }

    private static void formatCollection(
            final StringBuilder sb,
            final Collection<Object> items,
            final int depth) {
    }

    private static void formatNumber(final StringBuilder sb, final Number number) {
    }

    private static void formatBoolean(final StringBuilder sb, final boolean booleanValue) {
    }

    private static void formatFormattable(
            final StringBuilder sb,
            final StringBuilderFormattable formattable) {
    }

    private static void formatCharArray(final StringBuilder sb, final char[] items) {
    }

    private static void formatBooleanArray(final StringBuilder sb, final boolean[] items) {
    }

    private static void formatByteArray(final StringBuilder sb, final byte[] items) {
    }

    private static void formatShortArray(final StringBuilder sb, final short[] items) {
    }

    private static void formatIntArray(final StringBuilder sb, final int[] items) {
    }

    private static void formatLongArray(final StringBuilder sb, final long[] items) {
    }

    private static void formatFloatArray(final StringBuilder sb, final float[] items) {
    }

    private static void formatDoubleArray(
            final StringBuilder sb,
            final double[] items) {
    }

    private static void formatObjectArray(
            final StringBuilder sb,
            final Object[] items,
            final int depth) {
    }

    private static void formatString(final StringBuilder sb, final Object value) {
    }

}
