package solid_1_srp.solution;

public class ManageUsersApp {

    // SOLUTION: SOLID 1 - SRP
    // A class should have one, and only one, reason to change.
    // uma classe deve ter apenas um motivo para mudar
    // ALl responsabilities splitted in different classes:
    // - Dao -> DB
    // - Email -> Email procedures
    // - User -> User Entity
    public static void main(String[] args)
    {
        User user = new User("masson", "xxx@gmail");

        Dao dao = new Dao();
        dao.ConnectDB();
        dao.AddUser(user);
                
        Email email = new Email();
        email.MailMessage();
    }
}