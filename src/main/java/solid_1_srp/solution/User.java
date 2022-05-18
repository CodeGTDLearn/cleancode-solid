package solid_1_srp.solution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String name;
    private String email;

    public User(String nome, String email)
    {
        this.name = nome;
        this.email = email;
    }
}