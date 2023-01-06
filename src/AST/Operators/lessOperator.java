package AST.Operators;

import AST.Expression;

public class lessOperator extends ComarsionOperator {


    lessOperator (Expression left , Expression right , boolean result)
    {
        this.left = left;
        this.right =right;
        this.result =result;

    }
}
