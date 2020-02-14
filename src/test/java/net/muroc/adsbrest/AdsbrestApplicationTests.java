package net.muroc.adsbrest;

import net.muroc.adsbrest.Configuration.RepositoryConfiguration;
import net.muroc.adsbrest.Repositories.FlightPointRepositoryTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdsbrestApplication.class)
@WebAppConfiguration
class AdsbrestApplicationTests {

    @Test
    void contextLoads() {
    }

}
