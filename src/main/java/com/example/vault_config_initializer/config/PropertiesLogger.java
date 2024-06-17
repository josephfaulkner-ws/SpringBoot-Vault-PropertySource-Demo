package com.example.vault_config_initializer.config;

import org.springframework.stereotype.Component;

import java.util.Collection;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@Component
public class PropertiesLogger {

    Logger LOGGER = LogManager.getLogger(PropertiesLogger.class);

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        ConfigurableEnvironment env = (ConfigurableEnvironment) event.getApplicationContext().getEnvironment();

        env.getPropertySources()
        .stream()
        .filter(ps -> ps instanceof MapPropertySource)
        .map(ps -> ((MapPropertySource) ps).getSource().keySet())
        .flatMap(Collection::stream)
        .distinct()
        .sorted()
        .forEach(key -> LOGGER.info("{}={}", key, env.getProperty(key)));
    }
}