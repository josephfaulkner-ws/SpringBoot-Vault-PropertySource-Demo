package com.example.vault_config_initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.vault_config_initializer.config.VaultConfiguration;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfiguration.class)
public class VaultConfigInitializerApplication {

	public static void main(String[] args) {
        SpringApplication.run(VaultConfigInitializerApplication.class, args);
    }
}
