/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.VerificationIPFlowResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_04_01.Access;

class VerificationIPFlowResultImpl extends WrapperImpl<VerificationIPFlowResultInner> implements VerificationIPFlowResult {
    private final NetworkManager manager;
    VerificationIPFlowResultImpl(VerificationIPFlowResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Access access() {
        return this.inner().access();
    }

    @Override
    public String ruleName() {
        return this.inner().ruleName();
    }

}