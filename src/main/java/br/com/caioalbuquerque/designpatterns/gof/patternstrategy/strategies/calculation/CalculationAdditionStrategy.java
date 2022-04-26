package br.com.caioalbuquerque.designpatterns.gof.patternstrategy.strategies.calculation;

import br.com.caioalbuquerque.designpatterns.gof.patternstrategy.contexts.CalculationData;
import br.com.caioalbuquerque.designpatterns.gof.patternstrategy.interfaces.ICalculationStrategy;
import org.jboss.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class CalculationAdditionStrategy implements ICalculationStrategy {
    private static final Logger LOGGER = Logger.getLogger("CalculationAdditionStrategy");

    @Override
    public void calculate(CalculationData calculationData) {
        LOGGER.info("---------------");
        LOGGER.info("Total (before): " + calculationData.getTotal());
        LOGGER.info("Adding 2 ...");
        LOGGER.info("Total (after): " + (calculationData.getTotal() + 2));
    }
}