

package AST.Operators;

import AST.Expression;

public class GreaterOperator extends ComarsionOperator {


    GreaterOperator (Expression left , Expression right , boolean result)
    {
        this.left = left;
        this.right =right;
        this.result =result;

    }
}
