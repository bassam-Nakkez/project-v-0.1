package AST.Operators;

public class BoolValue {

    boolean value;

    BoolValue(boolean val){this.value = val;}

    @Override
    public String toString() {
        return ""+ value +"";
    }
}
