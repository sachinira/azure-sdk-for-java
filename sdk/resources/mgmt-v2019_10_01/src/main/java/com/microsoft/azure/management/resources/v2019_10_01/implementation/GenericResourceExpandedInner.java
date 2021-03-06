/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource information.
 */
public class GenericResourceExpandedInner extends GenericResourceInner {
    /**
     * The created time of the resource. This is only present if requested via
     * the $expand query parameter.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * The changed time of the resource. This is only present if requested via
     * the $expand query parameter.
     */
    @JsonProperty(value = "changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changedTime;

    /**
     * The provisioning state of the resource. This is only present if
     * requested via the $expand query parameter.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the created time of the resource. This is only present if requested via the $expand query parameter.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changed time of the resource. This is only present if requested via the $expand query parameter.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the provisioning state of the resource. This is only present if requested via the $expand query parameter.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
