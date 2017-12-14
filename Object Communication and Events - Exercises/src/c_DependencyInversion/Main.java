package c_DependencyInversion;


import c_DependencyInversion.calculator.Calculator;
import c_DependencyInversion.calculator.PrimitiveCalculator;
import c_DependencyInversion.engine.Engine;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new PrimitiveCalculator();
        Runnable runnable = new Engine(calculator);
        runnable.run();
    }
}
