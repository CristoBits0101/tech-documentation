package com.auth.auth.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andres.curso.springboot.app.springbootcrud.entities.User;
import com.andres.curso.springboot.app.springbootcrud.repositories.UserRepository;

/**
 * UserDetailsService pertenece a Spring Security
 * Sirve para ir a buscar usuarios cuando se loguean
 * Devuelve el nombre de usuario o un throws si no está
 * Este componente en producción se registra y autoconfigura
 * Es parte del contexto de seguridad de Spring Security
 * Para obtener el usuario pasa por aquí
 * Autenticación y autorización dentro del contexto Spring Security
 * Gestión centralizada y uso de características avanzadas de Spring Security
 */
@Service
public class JpaUserDetailsService implements UserDetailsService {

    // Repositorio en el que busca al usuario
    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 1. Importación desde el repositorio
        Optional<User> userOptional = repository.findByUsername(username);

        // 2. Si el usuario no existe, lanzar una excepción
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException(String.format("Username %s no existe en el sistema!", username));
        }

        // 3. Si el usuario existe, crear un UserDetails con sus datos y roles
        User user = userOptional.orElseThrow();

        // 4. Devolver el UserDetails con los datos del usuario y sus roles
        List<GrantedAuthority> authorities = user
                .getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());

        // 5. Crear y devolver el UserDetails con los datos y roles
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), //
                user.isEnabled(), // El usuario se puede deshabilitar
                true, // La cuenta no expira
                true, // Las credenciales no expira
                true, // La cuenta no se bloque
                authorities); //
    }

}