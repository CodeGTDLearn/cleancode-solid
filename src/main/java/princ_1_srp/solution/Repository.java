package princ_1_srp.solution;

import java.util.List;

public class Repository {

    public void ConnectDB()
    {
        System.out.println("Connected in DB");
    }

    public void AddUser(User user)
    {
        System.out.println("Adding the user");
    }

    public void UpdateUser(User user)
    {

    }

    public List<User> ListAllUsers()
    {
        return null;
    }

}
