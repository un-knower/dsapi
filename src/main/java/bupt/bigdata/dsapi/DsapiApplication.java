package bupt.bigdata.dsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DsapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsapiApplication.class, args);
    }
}
