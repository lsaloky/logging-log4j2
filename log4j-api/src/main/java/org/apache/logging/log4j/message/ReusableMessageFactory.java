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

import org.apache.logging.log4j.util.PerformanceSensitive;

import java.io.Serializable;

/**
 * Implementation of the {@link MessageFactory} interface that avoids allocating temporary objects where possible.
 * Message instances are cached in a ThreadLocal and reused when a new message is requested within the same thread.
 * @since 2.6
 */
@PerformanceSensitive("allocation")
public final class ReusableMessageFactory implements MessageFactory2, Serializable {

    /**
     * Instance of ReusableMessageFactory..
     */
    public static final ReusableMessageFactory INSTANCE = new ReusableMessageFactory();

    private static final long serialVersionUID = -8970940216592525651L;

    /**
     * Constructs a message factory.
     */
    public ReusableMessageFactory() {
    }

    private static ReusableParameterizedMessage getParameterized() {
        return new ReusableParameterizedMessage().reserve() ;
    }

    private static ReusableSimpleMessage getSimple() {
        return new ReusableSimpleMessage();
    }

    private static ReusableObjectMessage getObject() {
        return new ReusableObjectMessage();
    }

    public static void release(final Message message) { // LOG4J2-1583
    }

    @Override
    public Message newMessage(final CharSequence charSequence) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object... params) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2,
            final Object p3) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
        return null;
    }

    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3,
            final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
        return null;
    }

    @Override
    public Message newMessage(final String message) {
        return null;
    }


    @Override
    public Message newMessage(final Object message) {
        return getObject();
    }
}
