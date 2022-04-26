package br.com.caioalbuquerque.designpatterns.gof.strategy.interfaces;

import br.com.caioalbuquerque.designpatterns.gof.strategy.contexts.CalculationData;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public interface ICalculationStrategy {
    public void calculate(CalculationData calculationData);
}