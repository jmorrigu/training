package pl.training.springboot51.rest.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Data
@Entity
public class User {

    @SequenceGenerator(name = "user_id_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_gen")
    private Long id;

    @NaturalId
    public String username;

    public User(String username) {
        this.username = username;
    }

    public User() {
    }
}
