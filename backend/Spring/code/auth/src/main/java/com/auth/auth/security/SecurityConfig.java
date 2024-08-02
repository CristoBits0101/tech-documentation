package com.auth.auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig {

    /**
     * 1.1. Pertenece a Spring Security
     * 1.2. Sirve para encriptar la contraseña
     * 
     * @return BCryptPasswordEncoder()
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 2.1. Pertenece a Spring Security
     * 2.2. Sirve para gestionar los accesos
     * 2.3. HttpSecurity se inyecta automáticamente
     * 
     * @param httpSecurity
     * @return SecurityFilterChain
     * @throws Exception
     */
    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(authz -> authz                                        // 01. Configuración de peticiones HTTP
                        .requestMatchers(HttpMethod.GET, "/api/users")           // 02. Permisos GET para /api/users
                        .permitAll()                                                         // 03. Sin autentificación
                        .requestMatchers(HttpMethod.POST, "/api/users/register") // 04. Permisos POST para /api/users/register
                        .permitAll()                                                         // 05. Sin autentificación
                        .anyRequest()                                                        // 06. El resto de rutas
                        .authenticated())                                                    // 07. Requieren autentificación
                .csrf(csrf -> csrf                                                           // 08. Configuración para el token de formularios
                        .disable())                                                          // 09. Protege de hacks incluidos los formularios
                .sessionManagement(management -> management                                  // 10. Configuración de la session HTTP
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));            // 11. Sin estado a través de token
        return httpSecurity.build();
    }
}
