package princ_5_dip.solucao.repo;

import princ_5_dip.solucao.db.IDbAbstraction;
import princ_5_dip.solucao.entity.User;

public class RepoUser {
    
    private final IDbAbstraction repo;
    
    public RepoUser(IDbAbstraction repo)
    {
        this.repo = repo;
    }  

    public void AddUser(User user)
    {
        repo.ConnectDB();
        System.out.println("User added: " + user.getName());
    }

}