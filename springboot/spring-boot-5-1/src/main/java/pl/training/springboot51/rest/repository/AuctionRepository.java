package pl.training.springboot51.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.training.springboot51.rest.model.Auction;

public interface AuctionRepository extends JpaRepository<Auction, Long> {
}
