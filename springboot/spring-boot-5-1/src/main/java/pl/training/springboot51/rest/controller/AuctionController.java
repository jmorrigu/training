package pl.training.springboot51.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.training.springboot51.rest.assembler.Assembler;
import pl.training.springboot51.rest.dto.AuctionDTO;
import pl.training.springboot51.rest.model.Auction;
import pl.training.springboot51.rest.repository.AuctionRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("auctions")
public class AuctionController {

    private Assembler<Auction, AuctionDTO> auctionAssembler;
    private AuctionRepository auctionRepository;

    @GetMapping("all")
    public List<AuctionDTO> getAuctions(){
        return auctionRepository.findAll().stream()
                .map(auctionAssembler::assemble)
                .collect(Collectors.toList());
    }

}
