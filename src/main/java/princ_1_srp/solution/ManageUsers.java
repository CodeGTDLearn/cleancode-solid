package princ_1_srp.solution;

public class ManageUsers {

    public static void main(String[] args)
    {
        User user = new User("masson", "xxx@gmail");

        Repository dao = new Repository();
        dao.ConnectDB();
        dao.AddUser(user);
                
        Email email = new Email();
        email.MailMessage();
    }
}
