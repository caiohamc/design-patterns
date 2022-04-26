package br.com.caioalbuquerque.designpatterns;

import br.com.caioalbuquerque.designpatterns.gof.strategy.Context;
import br.com.caioalbuquerque.designpatterns.gof.strategy.login.LoginCertificateStrategy;
import br.com.caioalbuquerque.designpatterns.gof.strategy.login.LoginJWTStrategy;
import br.com.caioalbuquerque.designpatterns.gof.strategy.login.LoginData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Caio Albuquerque
 * @since 26/04/2022
 */
@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LoginJWTStrategy loginJWTStrategy = new LoginJWTStrategy();
		Context contextJwt = new Context(loginJWTStrategy);
		LoginData loginDataJWT = new LoginData("login.jwt");
		contextJwt.login(loginDataJWT);

		LoginCertificateStrategy loginCertificateStrategy = new LoginCertificateStrategy();
		Context contextCertificate = new Context(loginCertificateStrategy);
		LoginData loginDataCertificate = new LoginData("login.cert");
		contextCertificate.login(loginDataCertificate);
	}
}