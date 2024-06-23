package dev.sshvets.homesecurity.config;

import dev.sshvets.homesecurity.entities.Role;
import dev.sshvets.homesecurity.entities.User;
import dev.sshvets.homesecurity.repositories.RoleRepository;
import dev.sshvets.homesecurity.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collections;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, RoleRepository roleRepository) {
        return args -> {
            Role userRole = new Role();
            userRole.setName("ROLE_USER");
            roleRepository.save(userRole);

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            User user = new User();
            user.setUsername("sshvets");
            user.setPassword(encoder.encode("sshvets"));
            user.setRoles(Collections.singleton(userRole));
            userRepository.save(user);
        };
    }
}
