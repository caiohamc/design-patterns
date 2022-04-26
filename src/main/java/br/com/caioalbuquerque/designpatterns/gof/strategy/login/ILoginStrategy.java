package br.com.caioalbuquerque.designpatterns.gof.strategy.login;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public interface ILoginStrategy {
    public void login(LoginData loginData);
}