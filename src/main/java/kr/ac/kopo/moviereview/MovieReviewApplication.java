package kr.ac.kopo.moviereview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //BaseEntitydml regdate,moddate값이 자동으로 저장
public class MovieReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieReviewApplication.class, args);
    }

}
