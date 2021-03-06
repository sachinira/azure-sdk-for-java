// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.eventhubs.binder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Warren Zhu
 */
@SpringBootApplication
public class EventHubBinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventHubBinderApplication.class, args);
    }
}
