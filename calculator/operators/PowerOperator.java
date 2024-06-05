package calculator.operators;

import calculator.evaluator.Operand;

public class PowerOperator extends Operator{
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        return null;
    }

    @Override
    public int priority() {
        return 2;
    }
}
