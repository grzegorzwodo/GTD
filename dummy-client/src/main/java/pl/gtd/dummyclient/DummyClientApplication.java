package pl.gtd.dummyclient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.gtd.dummyclient")
public class DummyClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyClientApplication.class, args);
    }


}
