package princ_1_srp.solution;

public class User {

    private String name;
    private String email;

    public User(String nome, String email)
    {
        this.name = nome;
        this.email = email;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }     
}
