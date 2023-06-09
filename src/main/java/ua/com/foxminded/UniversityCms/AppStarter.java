package ua.com.foxminded.UniversityCms;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.foxminded.UniversityCms.utils.UniversityInitializer;

@Log4j2
@Configuration
public class AppStarter {

    @Autowired
    private UniversityInitializer schoolInitializer;

    @Bean
    public ApplicationRunner init() {
        log.info("ApplicationRunner has started");
        return args -> {
            schoolInitializer.schoolInitialize();
        };
    }

}
