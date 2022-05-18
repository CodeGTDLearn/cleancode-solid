package solid_1_srp.problem;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {

  //PROBLEMA:
  // A cada nova modalidade de Account
  // ALl responsabilities onlyin this class(User):
  // - Dao -> DB
  // - Email -> Email procedures
  // - User -> User Entity
  private String name;
  private String email;


  public void AddUser(User user) {

  }


  public List<User> ListAllUsers() {
    return null;
  }


  public void MailMessage() {

  }


  public void Dao() {

  }


  public void EmailToInformNewPassword() {

    MailMessage();

  }
}