package br.com.caioalbuquerque.designpatterns;

import br.com.caioalbuquerque.designpatterns.gof.strategy.Context;
import br.com.caioalbuquerque.designpatterns.gof.strategy.login.CertificateLoginStrategy;
import br.com.caioalbuquerque.designpatterns.gof.strategy.login.JWTLoginStrategy;
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
		JWTLoginStrategy jwtLoginStrategy = new JWTLoginStrategy();
		Context contextJwt = new Context(jwtLoginStrategy);
		LoginData loginDataJWT = new LoginData("login.jwt");
		contextJwt.login(loginDataJWT);

		CertificateLoginStrategy certificateLoginStrategy = new CertificateLoginStrategy();
		Context contextCertificate = new Context(certificateLoginStrategy);
		LoginData loginDataCertificate = new LoginData("login.cert");
		contextCertificate.login(loginDataCertificate);
	}
}