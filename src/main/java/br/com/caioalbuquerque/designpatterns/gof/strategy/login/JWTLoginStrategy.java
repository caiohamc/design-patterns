package br.com.caioalbuquerque.designpatterns.gof.strategy.login;

import org.jboss.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class JWTLoginStrategy implements ILoginStrategy {
    private static final Logger LOGGER = Logger.getLogger("JWTLoginStrategy");

    @Override
    public void login(LoginData loginData) {
        LOGGER.info("Login -> User: " + loginData.getUser());
    }
}