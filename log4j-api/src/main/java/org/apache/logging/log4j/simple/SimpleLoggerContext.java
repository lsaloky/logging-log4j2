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
package org.apache.logging.log4j.simple;

import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.spi.LoggerRegistry;

/**
 * A simple {@link LoggerContext} implementation.
 */
public class SimpleLoggerContext implements LoggerContext {

    /** Singleton instance. */
    static final SimpleLoggerContext INSTANCE = new SimpleLoggerContext();
    
    public SimpleLoggerContext() { }

    @Override
    public Object getExternalContext() {
        return null;
    }

    @Override
    public ExtendedLogger getLogger(final String name) { return new SimpleLogger(); }

    @Override
    public ExtendedLogger getLogger(final String name, final MessageFactory messageFactory) { 
        return new SimpleLogger();
    }

    @Override
    public LoggerRegistry<ExtendedLogger> getLoggerRegistry() {
        return new LoggerRegistry<ExtendedLogger>();
    }

    @Override
    public boolean hasLogger(final String name) {
        return false;
    }

    @Override
    public boolean hasLogger(final String name, final Class<? extends MessageFactory> messageFactoryClass) {
        return false;
    }

    @Override
    public boolean hasLogger(final String name, final MessageFactory messageFactory) {
        return false;
    }

}
