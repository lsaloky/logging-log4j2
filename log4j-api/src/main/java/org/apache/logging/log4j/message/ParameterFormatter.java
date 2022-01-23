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

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Supports parameter formatting as used in ParameterizedMessage and ReusableParameterizedMessage.
 */
final class ParameterFormatter {
    /**
     * Prefix for recursion.
     */
    static final String RECURSION_PREFIX = "[...";
    /**
     * Suffix for recursion.
     */
    static final String RECURSION_SUFFIX = "...]";

    /**
     * Prefix for errors.
     */
    static final String ERROR_PREFIX = "[!!!";
    /**
     * Separator for errors.
     */
    static final String ERROR_SEPARATOR = "=>";
    /**
     * Separator for error messages.
     */
    static final String ERROR_MSG_SEPARATOR = ":";
    /**
     * Suffix for errors.
     */
    static final String ERROR_SUFFIX = "!!!]";

    private static final char DELIM_START = '{';
    private static final char DELIM_STOP = '}';
    private static final char ESCAPE_CHAR = '\\';

    private static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_REF =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));

    private ParameterFormatter() {
    }

    /**
     * Counts the number of unescaped placeholders in the given messagePattern.
     *
     * @param messagePattern the message pattern to be analyzed.
     * @return the number of unescaped placeholders.
     */
    static int countArgumentPlaceholders(final String messagePattern) {
        return 0;
    }

    /**
     * Counts the number of unescaped placeholders in the given messagePattern.
     *
     * @param messagePattern the message pattern to be analyzed.
     * @return the number of unescaped placeholders.
     */
    static int countArgumentPlaceholders2(final String messagePattern, final int[] indices) {
        return 0;
    }

    /**
     * Counts the number of unescaped placeholders in the given messagePattern.
     *
     * @param messagePattern the message pattern to be analyzed.
     * @return the number of unescaped placeholders.
     */
    static int countArgumentPlaceholders3(final char[] messagePattern, final int length, final int[] indices) {
        return 0;
    }

    /**
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments      the arguments to be used to replace placeholders.
     * @return the formatted message.
     */
    static String format(final String messagePattern, final Object[] arguments) {
        return "";
    }

    /**
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param buffer the buffer to write the formatted message into
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments      the arguments to be used to replace placeholders.
     */
    static void formatMessage2(final StringBuilder buffer, final String messagePattern,
            final Object[] arguments, final int argCount, final int[] indices) {
    }

    /**
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param buffer the buffer to write the formatted message into
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments      the arguments to be used to replace placeholders.
     */
    static void formatMessage3(final StringBuilder buffer, final char[] messagePattern, final int patternLength,
            final Object[] arguments, final int argCount, final int[] indices) {
    }

    /**
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param buffer the buffer to write the formatted message into
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments      the arguments to be used to replace placeholders.
     */
    static void formatMessage(final StringBuilder buffer, final String messagePattern,
            final Object[] arguments, final int argCount) {
    }

    /**
     * Returns {@code true} if the specified char and the char at {@code curCharIndex + 1} in the specified message
     * pattern together form a "{}" delimiter pair, returns {@code false} otherwise.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 22 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static boolean isDelimPair(final char curChar, final String messagePattern, final int curCharIndex) {
        return false;
    }

    /**
     * Detects whether the message pattern has been fully processed or if an unprocessed character remains and processes
     * it if necessary, returning the resulting position in the result char array.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 28 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void handleRemainingCharIfAny(final String messagePattern, final int len,
            final StringBuilder buffer, final int escapeCounter, final int i) {
    }

    /**
     * Processes the last unprocessed character and returns the resulting position in the result char array.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 28 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void handleLastChar(final StringBuilder buffer, final int escapeCounter, final char curChar) {
    }

    /**
     * Processes a literal char (neither an '\' escape char nor a "{}" delimiter pair) and returns the resulting
     * position.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 16 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void handleLiteralChar(final StringBuilder buffer, final int escapeCounter, final char curChar) {
    }

    /**
     * Writes "{}" to the specified result array at the specified position and returns the resulting position.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 18 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void writeDelimPair(final StringBuilder buffer) {
    }

    /**
     * Returns {@code true} if the specified parameter is odd.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 11 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static boolean isOdd(final int number) {
        return (number & 1) == 1;
    }

    /**
     * Writes a '\' char to the specified result array (starting at the specified position) for each <em>pair</em> of
     * '\' escape chars encountered in the message format and returns the resulting position.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 11 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void writeEscapedEscapeChars(final int escapeCounter, final StringBuilder buffer) {
    }

    /**
     * Writes the specified number of '\' chars to the specified result array (starting at the specified position) and
     * returns the resulting position.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 20 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void writeUnescapedEscapeChars(int escapeCounter, final StringBuilder buffer) {
    }

    /**
     * Appends the argument at the specified argument index (or, if no such argument exists, the "{}" delimiter pair) to
     * the specified result char array at the specified position and returns the resulting position.
     */
    // Profiling showed this method is important to log4j performance. Modify with care!
    // 25 bytes (allows immediate JVM inlining: < 35 bytes) LOG4J2-1096
    private static void writeArgOrDelimPair(final Object[] arguments, final int argCount, final int currentArgument,
            final StringBuilder buffer) {
    }

    /**
     * This method performs a deep toString of the given Object.
     * Primitive arrays are converted using their respective Arrays.toString methods while
     * special handling is implemented for "container types", i.e. Object[], Map and Collection because those could
     * contain themselves.
     * <p>
     * It should be noted that neither AbstractMap.toString() nor AbstractCollection.toString() implement such a
     * behavior. They only check if the container is directly contained in itself, but not if a contained container
     * contains the original one. Because of that, Arrays.toString(Object[]) isn't safe either.
     * Confusing? Just read the last paragraph again and check the respective toString() implementation.
     * </p>
     * <p>
     * This means, in effect, that logging would produce a usable output even if an ordinary System.out.println(o)
     * would produce a relatively hard-to-debug StackOverflowError.
     * </p>
     * @param o The object.
     * @return The String representation.
     */
    static String deepToString(final Object o) { return ""; }

    /**
     * This method performs a deep {@code toString()} of the given {@code Object}.
     * <p>
     * Primitive arrays are converted using their respective {@code Arrays.toString()} methods, while
     * special handling is implemented for <i>container types</i>, i.e. {@code Object[]}, {@code Map} and {@code Collection},
     * because those could contain themselves.
     * <p>
     * It should be noted that neither {@code AbstractMap.toString()} nor {@code AbstractCollection.toString()} implement such a behavior.
     * They only check if the container is directly contained in itself, but not if a contained container contains the original one.
     * Because of that, {@code Arrays.toString(Object[])} isn't safe either.
     * Confusing? Just read the last paragraph again and check the respective {@code toString()} implementation.
     * <p>
     * This means, in effect, that logging would produce a usable output even if an ordinary {@code System.out.println(o)}
     * would produce a relatively hard-to-debug {@code StackOverflowError}.
     *
     * @param o      the {@code Object} to convert into a {@code String}
     * @param str    the {@code StringBuilder} that {@code o} will be appended to
     */
    static void recursiveDeepToString(final Object o, final StringBuilder str) { }

    /**
     * This method performs a deep {@code toString()} of the given {@code Object}.
     * <p>
     * Primitive arrays are converted using their respective {@code Arrays.toString()} methods, while
     * special handling is implemented for <i>container types</i>, i.e. {@code Object[]}, {@code Map} and {@code Collection},
     * because those could contain themselves.
     * <p>
     * {@code dejaVu} is used in case of those container types to prevent an endless recursion.
     * <p>
     * It should be noted that neither {@code AbstractMap.toString()} nor {@code AbstractCollection.toString()} implement such a behavior.
     * They only check if the container is directly contained in itself, but not if a contained container contains the original one.
     * Because of that, {@code Arrays.toString(Object[])} isn't safe either.
     * Confusing? Just read the last paragraph again and check the respective {@code toString()} implementation.
     * <p>
     * This means, in effect, that logging would produce a usable output even if an ordinary {@code System.out.println(o)}
     * would produce a relatively hard-to-debug {@code StackOverflowError}.
     *
     * @param o      the {@code Object} to convert into a {@code String}
     * @param str    the {@code StringBuilder} that {@code o} will be appended to
     * @param dejaVu a set of container objects directly or transitively containing {@code o}
     */
    private static void recursiveDeepToString(final Object o, final StringBuilder str, final Set<Object> dejaVu) {
    }

    private static boolean appendSpecialTypes(final Object o, final StringBuilder str) {
        return true;
    }

    private static boolean appendDate(final Object o, final StringBuilder str) {
        return true;
    }

    /**
     * Returns {@code true} if the specified object is an array, a Map or a Collection.
     */
    private static boolean isMaybeRecursive(final Object o) {
        return false;
    }

    private static void appendPotentiallyRecursiveValue(
            final Object o,
            final StringBuilder str,
            final Set<Object> dejaVu) {
    }

    private static void appendArray(
            final Object o,
            final StringBuilder str,
            final Set<Object> dejaVu,
            final Class<?> oClass) {
    }

    /**
     * Specialized handler for {@link Map}s.
     */
    private static void appendMap(
            final Object o,
            final StringBuilder str,
            final Set<Object> dejaVu) {
    }

    /**
     * Specialized handler for {@link Collection}s.
     */
    private static void appendCollection(
            final Object o,
            final StringBuilder str,
            final Set<Object> dejaVu) {
    }

    private static Set<Object> getOrCreateDejaVu(Set<Object> dejaVu) {
        return null;
    }

    private static Set<Object> createDejaVu() {
        return null;
    }

    private static Set<Object> cloneDejaVu(Set<Object> dejaVu) {
        return null;
    }

    private static void tryObjectToString(final Object o, final StringBuilder str) {
    }

    private static void handleErrorInObjectToString(final Object o, final StringBuilder str, final Throwable t) {
    }

    /**
     * This method returns the same as if Object.toString() would not have been
     * overridden in obj.
     * <p>
     * Note that this isn't 100% secure as collisions can always happen with hash codes.
     * </p>
     * <p>
     * Copied from Object.hashCode():
     * </p>
     * <blockquote>
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the Java&#8482; programming language.)
     * </blockquote>
     *
     * @param obj the Object that is to be converted into an identity string.
     * @return the identity string as also defined in Object.toString()
     */
    static String identityToString(final Object obj) {
        return "";
    }

}
