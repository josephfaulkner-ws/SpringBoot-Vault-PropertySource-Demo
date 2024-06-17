package com.example.vault_config_initializer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "config")
public class VaultConfiguration {

    private String message;

    public VaultConfiguration(String message) {
        this.message= message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}