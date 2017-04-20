package com.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Spring Boot 啟動;
 *
 * @author leo
 * @version v.0.1
 */
 
@SpringBootApplication
public class App {
       /**
        * -javaagent:.\lib\springloaded-1.2.4.RELEASE.jar -noverify
        * @param args
        */
       public static void main(String[] args) {
              SpringApplication.run(App.class, args);
       }
}