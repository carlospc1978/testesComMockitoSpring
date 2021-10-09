package trainne.domain.user;

import trainne.domain.order.Order;

public class UserService {

    int idade;
    boolean menorDeIdade;


    public boolean isUserMinor(int idade){
        if(idade <18){
            return true;
        }
        return false;
    }

}
