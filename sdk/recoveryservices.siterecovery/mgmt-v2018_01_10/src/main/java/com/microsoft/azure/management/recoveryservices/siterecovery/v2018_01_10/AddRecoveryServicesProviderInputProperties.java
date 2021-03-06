/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an add provider request.
 */
public class AddRecoveryServicesProviderInputProperties {
    /**
     * The name of the machine where the provider is getting added.
     */
    @JsonProperty(value = "machineName", required = true)
    private String machineName;

    /**
     * The identity provider input for DRA authentication.
     */
    @JsonProperty(value = "authenticationIdentityInput", required = true)
    private IdentityProviderInput authenticationIdentityInput;

    /**
     * The identity provider input for resource access.
     */
    @JsonProperty(value = "resourceAccessIdentityInput", required = true)
    private IdentityProviderInput resourceAccessIdentityInput;

    /**
     * Get the name of the machine where the provider is getting added.
     *
     * @return the machineName value
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Set the name of the machine where the provider is getting added.
     *
     * @param machineName the machineName value to set
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * Get the identity provider input for DRA authentication.
     *
     * @return the authenticationIdentityInput value
     */
    public IdentityProviderInput authenticationIdentityInput() {
        return this.authenticationIdentityInput;
    }

    /**
     * Set the identity provider input for DRA authentication.
     *
     * @param authenticationIdentityInput the authenticationIdentityInput value to set
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withAuthenticationIdentityInput(IdentityProviderInput authenticationIdentityInput) {
        this.authenticationIdentityInput = authenticationIdentityInput;
        return this;
    }

    /**
     * Get the identity provider input for resource access.
     *
     * @return the resourceAccessIdentityInput value
     */
    public IdentityProviderInput resourceAccessIdentityInput() {
        return this.resourceAccessIdentityInput;
    }

    /**
     * Set the identity provider input for resource access.
     *
     * @param resourceAccessIdentityInput the resourceAccessIdentityInput value to set
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withResourceAccessIdentityInput(IdentityProviderInput resourceAccessIdentityInput) {
        this.resourceAccessIdentityInput = resourceAccessIdentityInput;
        return this;
    }

}
