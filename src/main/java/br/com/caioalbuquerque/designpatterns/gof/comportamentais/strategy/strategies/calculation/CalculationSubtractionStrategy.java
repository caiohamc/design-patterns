package br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.strategies.calculation;

import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts.CalculationData;
import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.interfaces.ICalculationStrategy;
import org.jboss.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class CalculationSubtractionStrategy implements ICalculationStrategy {
    private static final Logger LOGGER = Logger.getLogger("CalculationSubtractionStrategy");

    @Override
    public void calculate(CalculationData calculationData) {
        LOGGER.info("---------------");
        LOGGER.info("Total (before): " + calculationData.getTotal());
        LOGGER.info("Subtracting 2 ...");
        LOGGER.info("Total (after): " + (calculationData.getTotal() - 2));
    }
}