package br.com.caioalbuquerque.designpatterns.gof.strategy.login;

import org.jboss.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class LoginCertificateStrategy implements ILoginStrategy {
    private static final Logger LOGGER = Logger.getLogger("A3CertificateLoginStrategy");

    @Override
    public void login(LoginData loginData) {
        LOGGER.info("Login -> User: " + loginData.getUser());
    }
}