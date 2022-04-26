package br.com.caioalbuquerque.designpatterns.gof.strategy;

import br.com.caioalbuquerque.designpatterns.gof.strategy.login.ILoginStrategy;
import br.com.caioalbuquerque.designpatterns.gof.strategy.login.LoginData;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class Context {
    private ILoginStrategy loginStrategy;

    public Context (ILoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void login(LoginData loginData){
        loginStrategy.login(loginData);
    }
}