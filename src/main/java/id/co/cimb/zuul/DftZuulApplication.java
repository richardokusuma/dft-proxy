package id.co.cimb.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DftZuulApplication {
    public static void main(String[] args) {
            SpringApplication.run(DftZuulApplication.class, args);
    }
}