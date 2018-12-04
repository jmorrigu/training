package pl.training.springboot51.rest.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Auction {

    @SequenceGenerator(name = "auction_id_gen", sequenceName = "auction_id_seq", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auction_id_gen")
    private Long id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "bidders", joinColumns = @JoinColumn(name = "bidder_id"), inverseJoinColumns = @JoinColumn(name = "id"))
    private Set<User> bidders;

    public Auction() {
    }

    public Auction(String name, Set<User> bidders) {
        this.name = name;
        this.bidders = bidders;
    }
}
