package pl.sda.spring.operation;

import static java.lang.Math.pow;

public class PowerOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        return pow(arg1,arg2) ;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.POWER_OPERATION;
    }
}
