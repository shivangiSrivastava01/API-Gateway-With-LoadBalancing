package com.demo.apiGateway.config;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Configuration
public class LoadBalancerConfiguration {

    @Bean
    public ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new ServiceInstanceListSupplier() {

            @Override
            public String getServiceId() {
                return "Here in getServiceId method";
            }

            @Override
            public Flux<List<ServiceInstance>> get() {
                return Flux.just(Arrays.asList(
                        new DefaultServiceInstance("serviceA-1", "serviceA", "localhost", 8081, false),
                        new DefaultServiceInstance("serviceA-2", "serviceA", "localhost", 8082, false),
                        new DefaultServiceInstance("serviceB-1", "serviceB", "localhost", 8083, false),
                        new DefaultServiceInstance("serviceB-2", "serviceB", "localhost", 8084, false)
                ));
            }

        };
    }
}
