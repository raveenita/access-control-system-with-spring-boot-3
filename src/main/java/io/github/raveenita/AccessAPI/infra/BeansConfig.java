package io.github.raveenita.AccessAPI.infra;

import io.github.raveenita.AccessAPI.core.ports.ResidentRepositoryPort;
import io.github.raveenita.AccessAPI.core.ports.ResidentServicePort;
import io.github.raveenita.AccessAPI.core.ports.UserRepositoryPort;
import io.github.raveenita.AccessAPI.core.ports.UserServicePort;
import io.github.raveenita.AccessAPI.core.services.ResidentService;
import io.github.raveenita.AccessAPI.core.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// what springs should manage without create a dependency with the framework
@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean // what is a Bean?
    public UserServicePort residentServiceImplementation(UserRepositoryPort userRepositoryPort) {
        return new UserService(userRepositoryPort);
    }

    @Bean
    public ResidentServicePort residentServiceImplementation(ResidentRepositoryPort userRepositoryPort) {
        return new ResidentService(userRepositoryPort);
    }
}
