package pl.training.springboot51.rest.dto;

import lombok.Getter;
import lombok.Setter;
import pl.training.springboot51.rest.model.User;

import java.util.Set;

@Setter
@Getter
public class AuctionDTO {

    private String name;
    private Set<User> bidders;

}
