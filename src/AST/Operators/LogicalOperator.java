package AST.Operators;

public abstract class LogicalOperator extends  Operator {

    LogicalOperator left;
    LogicalOperator right;
    String ID ;
    Boolean boolValue;
    ComarsionOperator comp;
    String operator;


    public LogicalOperator getLeft() {
        return left;
    }

    public void setLeft(LogicalOperator left) {
        this.left = left;
    }

    public LogicalOperator getRight() {
        return right;
    }

    public void setRight(LogicalOperator right) {
        this.right = right;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public ComarsionOperator getComp() {
        return comp;
    }

    public void setComp(ComarsionOperator comp) {
        this.comp = comp;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    @Override
    public String toString() {

        if (this.left != null) {

            if (this.right != null) {
                return "(" + this.left + " " + this.operator + " " + this.right + ")";
            } else if (this.comp != null) {
                return "(" + this.left + " " + this.operator + " " + this.comp + ")";
            } else if (this.ID != null) {
                return "(" + this.left + " " + this.operator + " " + this.ID + ")";
            } else {
                return "(" + this.left + " " + this.operator + " " + this.boolValue + ")";
            }


        } else if (this.right != null) {

                if (this.comp != null) {
                    return "(" + this.comp + " " + this.operator + " " + this.right + ")";
                } else if (this.ID != null) {
                    return "(" + this.ID + " " + this.operator + " " + this.right + ")";
                } else {
                    return "(" + this.boolValue + " " + this.operator + " " + this.right + ")";
                }
        }
        else if()
    }
}
