package homework.common;


import homework.RiderAppApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RiderAppApplication.class })
public class CucumberSpingConfiguration {
    
}
