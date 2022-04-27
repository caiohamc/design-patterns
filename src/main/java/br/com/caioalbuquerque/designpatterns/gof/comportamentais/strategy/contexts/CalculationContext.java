package br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.contexts;

import br.com.caioalbuquerque.designpatterns.gof.comportamentais.strategy.interfaces.ICalculationStrategy;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class CalculationContext {
    private ICalculationStrategy calculationStrategy;

    public CalculationContext(ICalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public void calculate(CalculationData calculationData) {
        calculationStrategy.calculate(calculationData);
    }
}