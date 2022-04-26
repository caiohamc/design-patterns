package br.com.caioalbuquerque.designpatterns.gof.patternstrategy.contexts;

/**
 * @author Caio Henrique Albuquerque
 * @since 26/04/2022
 */
public class CalculationData {
    private Integer total;

    public CalculationData(Integer total){
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }
}