package br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts;

import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.interfaces.ILoginStrategy;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class LoginContext {
    private ILoginStrategy loginStrategy;

    public LoginContext(ILoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void login(LoginData loginData){
        loginStrategy.login(loginData);
    }
}