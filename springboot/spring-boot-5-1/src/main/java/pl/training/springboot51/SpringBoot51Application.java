package pl.training.springboot51;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.training.springboot51.rest.model.Auction;
import pl.training.springboot51.rest.repository.AuctionRepository;
import pl.training.springboot51.rest.model.User;
import pl.training.springboot51.rest.repository.UserRepository;

import java.util.Collections;

@SpringBootApplication
public class SpringBoot51Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot51Application.class, args);
    }

    @Bean
    CommandLineRunner insertToDb(UserRepository userRepository, AuctionRepository auctionRepository){
        return args -> {
            User user = new User();
            user.setUsername("user1");
            userRepository.save(user);

            Auction auction = new Auction();
            auction.setId(11L);
            auction.setName("Auction1");
            auction.setBidders(Collections.singleton(user));
            auctionRepository.save(auction);

        };
    }
}


