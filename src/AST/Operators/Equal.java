package AST.Operators;

import AST.Expression;
import AST.Operators.ComarsionOperator;

public class Equal extends ComarsionOperator {


    Equal(Expression left , Expression right , boolean result)
     {

        this.left = left;
        this.right =right;
        this.result =result;

     }
}
