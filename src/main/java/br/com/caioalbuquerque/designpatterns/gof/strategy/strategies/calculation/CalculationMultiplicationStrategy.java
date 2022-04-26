package br.com.caioalbuquerque.designpatterns.gof.strategy.strategies.calculation;

import br.com.caioalbuquerque.designpatterns.gof.strategy.contexts.CalculationData;
import br.com.caioalbuquerque.designpatterns.gof.strategy.interfaces.ICalculationStrategy;
import org.jboss.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class CalculationMultiplicationStrategy implements ICalculationStrategy {
    private static final Logger LOGGER = Logger.getLogger("CalculationMultiplicationStrategy");

    @Override
    public void calculate(CalculationData calculationData) {
        LOGGER.info("---------------");
        LOGGER.info("Total (before): " + calculationData.getTotal());
        LOGGER.info("Multiplicating by 2 ...");
        LOGGER.info("Total (after): " + (calculationData.getTotal() * 2));
    }
}