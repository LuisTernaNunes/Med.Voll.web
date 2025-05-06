package med.voll.web_application.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfiguracaoSeguranca {
    @Bean
    public UserDetailsService dadosUsuarioCadatrado(){
        UserDetails usuario1 = User.builder()
                .username("luis")
                .password("{noop}123456")
                .build();
        return new InMemoryUserDetailsManager(usuario1);
    }
}
