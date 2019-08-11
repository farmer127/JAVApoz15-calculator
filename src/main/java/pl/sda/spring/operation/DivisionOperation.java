package pl.sda.spring.operation;

import org.springframework.stereotype.Component;

@Component
public class DivisionOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 !=0){
            return arg1/arg2;
        }
        throw new RuntimeException("Nie wolno dzielic przez 0");
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
