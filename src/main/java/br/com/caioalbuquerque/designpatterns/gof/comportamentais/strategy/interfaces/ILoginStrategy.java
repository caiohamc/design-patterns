package br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.interfaces;

import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts.LoginData;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public interface ILoginStrategy {
    public void login(LoginData loginData);
}