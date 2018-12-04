package pl.training.springboot51.rest.assembler;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import pl.training.springboot51.rest.dto.AuctionDTO;
import pl.training.springboot51.rest.model.Auction;

@Component
public class AuctionAssemblerBeanFactory implements FactoryBean<AuctionAssemblerBeanFactory.AuctionAssembler> {

    @Override
    public AuctionAssembler getObject()  {
        return new AuctionAssembler();
    }

    @Override
    public Class<?> getObjectType() {
        return AuctionAssembler.class;
    }

    static class AuctionAssembler implements Assembler<Auction, AuctionDTO>{

        @Override
        public AuctionDTO assemble(Auction source) {
            AuctionDTO dto = new AuctionDTO();
            dto.setName(source.getName());
            dto.setBidders(source.getBidders());
            return dto;
        }
    }
}
