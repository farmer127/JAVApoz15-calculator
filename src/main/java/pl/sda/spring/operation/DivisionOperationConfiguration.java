package pl.sda.spring.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DivisionOperationConfiguration {

    private String EXCEPTION_MESSAGE = "NIe wolno Dzielić Przez 0";
    @Bean
    DivisionOperation divisionOperation() {
        return new DivisionOperation(EXCEPTION_MESSAGE);
    }

}
