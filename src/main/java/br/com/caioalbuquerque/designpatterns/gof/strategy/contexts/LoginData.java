package br.com.caioalbuquerque.designpatterns.gof.strategy.contexts;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class LoginData {
    private String user;

    public LoginData(String user){
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}