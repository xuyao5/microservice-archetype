package io.github.xuyao5.service.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({})
@ComponentScan(basePackages = {"io.github.xuyao5.service"})
public class ServiceConfiguration {
}
