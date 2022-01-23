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

import org.apache.logging.log4j.util.StringBuilderFormattable;

import java.io.Serializable;

/**
 * The StructuredData identifier.
 */
public class StructuredDataId implements Serializable, StringBuilderFormattable {

    /**
     * RFC 5424 Time Quality.
     */
    public static final StructuredDataId TIME_QUALITY = new StructuredDataId("timeQuality", null, new String[] {
            "tzKnown", "isSynced", "syncAccuracy"});

    /**
     * RFC 5424 Origin.
     */
    public static final StructuredDataId ORIGIN = new StructuredDataId("origin", null, new String[] {"ip",
            "enterpriseId", "software", "swVersion"});

    /**
     * RFC 5424 Meta.
     */
    public static final StructuredDataId META = new StructuredDataId("meta", null, new String[] {"sequenceId",
            "sysUpTime", "language"});

    /**
     * Reserved enterprise number.
     */
    public static final int RESERVED = -1;

    private static final long serialVersionUID = 9031746276396249990L;

    /**
     * Creates a StructuredDataId based on the name.
     * @param name The Structured Data Element name (maximum length is 32)
     * @since 2.9
     */
    public StructuredDataId(final String name) { }

    /**
     * Creates a StructuredDataId based on the name.
     * @param name The Structured Data Element name.
     * @param maxLength The maximum length of the name.
     * @since 2.9
     */
    public StructuredDataId(final String name, final int maxLength) { }

    /**
     *
     * @param name
     * @param required
     * @param optional
     */
    public StructuredDataId(final String name, final String[] required, final String[] optional) {
    }

    /**
     * A Constructor that helps conformance to RFC 5424.
     *
     * @param name The name portion of the id.
     * @param required The list of keys that are required for this id.
     * @param optional The list of keys that are optional for this id.
     * @since 2.9
     */
    public StructuredDataId(final String name, final String[] required, final String[] optional, int maxLength) {
    }

    /**
     * A Constructor that helps conformance to RFC 5424.
     *
     * @param name The name portion of the id.
     * @param enterpriseNumber The enterprise number.
     * @param required The list of keys that are required for this id.
     * @param optional The list of keys that are optional for this id.
     */
    public StructuredDataId(final String name, final int enterpriseNumber, final String[] required,
                            final String[] optional) {
    }

    /**
     * A Constructor that helps conformance to RFC 5424.
     *
     * @param name The name portion of the id.
     * @param enterpriseNumber The enterprise number.
     * @param required The list of keys that are required for this id.
     * @param optional The list of keys that are optional for this id.
     * @param maxLength The maximum length of the StructuredData Id key.
     * @since 2.9
     */
    public StructuredDataId(final String name, final int enterpriseNumber, final String[] required,
            final String[] optional, final int maxLength) {
    }

    /**
     * Creates an id using another id to supply default values.
     *
     * @param id The original StructuredDataId.
     * @return the new StructuredDataId.
     */
    public StructuredDataId makeId(final StructuredDataId id) {
        return this;
    }

    /**
     * Creates an id based on the current id.
     *
     * @param defaultId The default id to use if this StructuredDataId doesn't have a name.
     * @param anEnterpriseNumber The enterprise number.
     * @return a StructuredDataId.
     */
    public StructuredDataId makeId(final String defaultId, final int anEnterpriseNumber) {
        return this;
    }

    /**
     * Returns a list of required keys.
     *
     * @return a List of required keys or null if none have been provided.
     */
    public String[] getRequired() {
        return null;
    }

    /**
     * Returns a list of optional keys.
     *
     * @return a List of optional keys or null if none have been provided.
     */
    public String[] getOptional() {
        return null;
    }

    /**
     * Returns the StructuredDataId name.
     *
     * @return the StructuredDataId name.
     */
    public String getName() {
        return "";
    }

    /**
     * Returns the enterprise number.
     *
     * @return the enterprise number.
     */
    public int getEnterpriseNumber() {
        return 0;
    }

    /**
     * Indicates if the id is reserved.
     *
     * @return true if the id uses the reserved enterprise number, false otherwise.
     */
    public boolean isReserved() {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void formatTo(final StringBuilder buffer) {
    }
}
