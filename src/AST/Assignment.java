package AST;

public class Assignment extends Statment {

    String left ;
    Expression right;

    Assignment ( String left , Expression right )
    {
        this.left = left;
        this.right = right;
    }


}
