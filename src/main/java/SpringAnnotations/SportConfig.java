package SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("SpringAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

   /* @Bean
    public FortuneService happyFortuneService()
    {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach()
    {
        SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
        return mySwimCoach;
    }*/

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(sadFortuneService());
    }



}
