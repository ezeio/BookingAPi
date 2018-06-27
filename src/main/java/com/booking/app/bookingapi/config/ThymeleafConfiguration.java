package com.booking.app.bookingapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

    @Configuration
    public class ThymeleafConfiguration {
        @Bean
        public ITemplateResolver defaultTemplateResolver() {
            FileTemplateResolver resolver = new FileTemplateResolver();
            resolver.setSuffix(".html");
            resolver.setPrefix("path/to/your/templates");
            resolver.setTemplateMode("HTML5");
            resolver.setCharacterEncoding("UTF-8");
            resolver.setCacheable(false);
            return resolver;
        }
    }

