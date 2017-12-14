package c_DependencyInversion.calculator;

import c_DependencyInversion.strategies.Strategy;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Calculator {
    void changeStrategy(Strategy strategy);

    int performCalculation(int firstOperand, int secondOperand);
}
