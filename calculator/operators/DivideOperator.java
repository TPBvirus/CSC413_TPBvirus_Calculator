package calculator.operators;

import calculator.evaluator.Operand;

public class DivideOperator extends Operator{
    public DivideOperator(){}

    @Override
    public int priority() {
        return 2;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        return null;
    }
}
