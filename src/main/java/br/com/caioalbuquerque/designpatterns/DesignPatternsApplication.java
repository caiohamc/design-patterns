package br.com.caioalbuquerque.designpatterns;

import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts.CalculationContext;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts.LoginContext;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.calculation.CalculationAdditionStrategy;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts.CalculationData;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.calculation.CalculationDivisionStrategy;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.calculation.CalculationMultiplicationStrategy;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.calculation.CalculationSubtractionStrategy;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.login.LoginCertificateStrategy;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts.LoginData;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.login.LoginJWTStrategy;
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
		// STRATEGY PATTERN - Calculation
		// ADD - mostly to maximize readability
		CalculationAdditionStrategy calculationAdditionStrategy = new CalculationAdditionStrategy();
		CalculationContext calculationContextAddition = new CalculationContext(calculationAdditionStrategy);
		CalculationData calculationDataAddition = new CalculationData(10);
		calculationContextAddition.calculate(calculationDataAddition);
		// SUB - mostly to optimize writing
		CalculationContext calcContextSub = new CalculationContext(new CalculationSubtractionStrategy());
		calcContextSub.calculate(new CalculationData(10));
		// MULT
		CalculationContext calcContextMult = new CalculationContext(new CalculationMultiplicationStrategy());
		calcContextMult.calculate(new CalculationData(10));
		// DIV
		CalculationContext calcContextDiv = new CalculationContext(new CalculationDivisionStrategy());
		calcContextDiv.calculate(new CalculationData(10));

		// STRATEGY PATTERN - Login
		LoginJWTStrategy loginJWTStrategy = new LoginJWTStrategy();
		LoginContext loginContextJwt = new LoginContext(loginJWTStrategy);
		LoginData loginDataJWT = new LoginData("login.jwt");
		loginContextJwt.login(loginDataJWT);
		LoginCertificateStrategy loginCertificateStrategy = new LoginCertificateStrategy();
		LoginContext loginContextCertificate = new LoginContext(loginCertificateStrategy);
		LoginData loginDataCertificate = new LoginData("login.cert");
		loginContextCertificate.login(loginDataCertificate);
	}
}