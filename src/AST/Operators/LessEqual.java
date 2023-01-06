package AST.Operators;

import AST.Expression;

public class LessEqual extends ComarsionOperator {

    LessEqual(Expression left , Expression right , boolean result)
    {

        this.left = left;
        this.right =right;
        this.result =result;

    }
}
