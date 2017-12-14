package c_DependencyInversion.calculator;


import c_DependencyInversion.strategies.AdditionStrategy;
import c_DependencyInversion.strategies.Strategy;

public class PrimitiveCalculator implements Calculator {
    private Strategy strategy = AdditionStrategy.getSingleInstance();

    @Override
    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int performCalculation(int firstOperand, int secondOperand) {
        return strategy.calculate(firstOperand, secondOperand);
    }
}
