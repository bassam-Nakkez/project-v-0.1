
package AST.Operators;
import AST.Expression;

public class GreaterEqual extends ComarsionOperator {

    GreaterEqual(Expression left , Expression right , boolean result)
    {

        this.left = left;
        this.right =right;
        this.result =result;

    }
}

