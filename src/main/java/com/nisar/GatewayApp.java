package com.nisar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class GatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class,args);
    }
    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalancedWebClientBuilder() {
        return WebClient.builder();
    }


  //  @Bean
   /* public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("um_route",r -> r.path("/v1/organizations/**")
                        .uri("http://inpc1986lz.pwcglb.com:9090/")
                    )
                    .build();
    }*/
}