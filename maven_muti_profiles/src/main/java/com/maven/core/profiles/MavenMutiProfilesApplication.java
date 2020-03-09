package com.maven.core.profiles;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.maven.core.profiles.mapper")
public class MavenMutiProfilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenMutiProfilesApplication.class, args);
    }

}
