package com.petclinic.spring.config;

/*
import com.petclinic.spring.security.ApiKeySecurityFilter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
*/

//@Configuration
//@EnableWebSecurity
public class   SecurityConfig {
/*    @Value("${security.api.key.header}")
    private String apiKeyHeader;

    @Value("${security.api.key.value}")
    private String apiKeyValue;

    @SneakyThrows
    @Bean
    public SecurityFilterChain configure(HttpSecurity http)  {
        ApiKeySecurityFilter apiKeySecurityFilter = new ApiKeySecurityFilter(apiKeyHeader, apiKeyValue);

        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth.requestMatchers("/")
                        .authenticated()
                        .anyRequest().permitAll())
                .addFilterBefore(apiKeySecurityFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }*/
}
