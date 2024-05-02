package com.microshop.stockmanagement.zuuledgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge=3600)
@EnableDiscoveryClient
public class  ZuulEdgeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEdgeServerApplication.class, args);
    }

//    @Bean
//    public CorsFilter corsFilter(){
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        final CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.setAllowedOrigins(Collections.singletonList("*"));
//        config.setAllowedHeaders(Collections.singletonList("*"));
//        config.setAllowedMethods(Arrays.stream(HttpMethod.values()).map(HttpMethod::name).collect(Collectors.toList()));
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }

}
