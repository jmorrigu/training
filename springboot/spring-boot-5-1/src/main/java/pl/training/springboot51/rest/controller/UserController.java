package pl.training.springboot51.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.training.springboot51.rest.assembler.Assembler;
import pl.training.springboot51.rest.dto.UserDTO;
import pl.training.springboot51.rest.model.User;
import pl.training.springboot51.rest.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {

    private Assembler<User, UserDTO> userAssembler;
    private UserRepository userRepository;

    @GetMapping(path = "all", produces = {"application/json", "application/xml"})
    public List<UserDTO> getUsers(){
        return userRepository.findAll().stream()
                .map(userAssembler::assemble)
                .collect(Collectors.toList());
    }
}
