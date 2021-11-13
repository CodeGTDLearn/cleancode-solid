package princ_1_srp.solution;

public class ManageUsersApp {

    // PRINCIPIO 01: SINGLE RESPONSABILITY
    // A class should have one, and only one, reason to change.
    // uma classe deve ter apenas um motivo para mudar
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