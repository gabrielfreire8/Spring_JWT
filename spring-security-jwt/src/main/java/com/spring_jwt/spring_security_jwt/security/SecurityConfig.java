package com.spring_jwt.spring_security_jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX;
    public static  String KEY;
    public static Long EXPIRATION;

    public static String getPREFIX() {
        return PREFIX;
    }

    public static void setPREFIX(String PREFIX) {
        SecurityConfig.PREFIX = PREFIX;
    }

    public static String getKEY() {
        return KEY;
    }

    public static void setKEY(String KEY) {
        SecurityConfig.KEY = KEY;
    }

    public static Long getEXPIRATION() {
        return EXPIRATION;
    }

    public static void setEXPIRATION(Long EXPIRATION) {
        SecurityConfig.EXPIRATION = EXPIRATION;
    }
}
