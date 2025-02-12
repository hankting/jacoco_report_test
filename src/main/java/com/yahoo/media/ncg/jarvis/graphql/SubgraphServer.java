package com.yahoo.media.ncg.jarvis.graphql;

import com.apollographql.federation.graphqljava.tracing.FederatedTracingInstrumentation;
import graphql.execution.instrumentation.Instrumentation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan({"com.yahoo.media.ncg"})
@SpringBootApplication
@EnableScheduling
@Slf4j
public class SubgraphServer {

    public static void main(String[] args) {
        log.info("Starting SubgraphServer");
        SpringApplication.run(SubgraphServer.class, args);
    }

    @Bean
    @ConditionalOnProperty(prefix = "graphql.tracing", name = "enabled", matchIfMissing = true)
    public Instrumentation tracingInstrumentation(){
        return new FederatedTracingInstrumentation();
    }
}
