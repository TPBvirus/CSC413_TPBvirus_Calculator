package calculator.operators;

import calculator.evaluator.Operand;

public class SubtractOperator  extends Operator{
    @Override
    public int priority() {
        return 0;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        return null;
    }
}
