package pl.training.springboot51.rest.assembler;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import pl.training.springboot51.rest.dto.UserDTO;
import pl.training.springboot51.rest.model.User;

@Component
public class UserAssemblerBeanFactory implements FactoryBean<UserAssemblerBeanFactory.UserAssembler> {

    @Override
    public UserAssembler getObject()  {
        return new UserAssembler();
    }

    @Override
    public Class<?> getObjectType() {
        return UserAssembler.class;
    }

    static class UserAssembler implements Assembler<User, UserDTO>{

        @Override
        public UserDTO assemble(User source) {
            UserDTO dto = new UserDTO();
            dto.setName(source.getUsername());
            return dto;
        }
    }
}
