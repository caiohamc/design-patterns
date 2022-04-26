package br.com.caioalbuquerque.designpatterns.gof.patternstrategy.strategies.login;

import br.com.caioalbuquerque.designpatterns.gof.patternstrategy.contexts.LoginData;
import br.com.caioalbuquerque.designpatterns.gof.patternstrategy.interfaces.ILoginStrategy;
import org.jboss.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class LoginCertificateStrategy implements ILoginStrategy {
    private static final Logger LOGGER = Logger.getLogger("LoginCertificateStrategy");

    @Override
    public void login(LoginData loginData) {
        LOGGER.info("----------------------");
        LOGGER.info("Login -> User: " + loginData.getUser());
    }
}