package ppj.assignments.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ppj.assignments.writer.DevelWriter;
import ppj.assignments.writer.ProdWriter;

@Configuration
public class WriterConfiguration {

    @Profile({"devel"})
    @Bean
    public DevelWriter develWriter() {
        return new DevelWriter();
    }

    @Profile({"!devel"})
    @Bean
    public ProdWriter prodWriter() {
        return new ProdWriter();
    }

}
