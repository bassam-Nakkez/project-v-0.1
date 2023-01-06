package AST;

import java.util.List;

public class VariableDeclaration {

    public boolean _const ;
    public boolean _final;
    public String Type ;
    public String varName ;
    public TypeVariable value ;

    public VariableDeclaration ( boolean _const, boolean _final ,  String varName , String type , TypeVariable value )
    {
        this.varName = varName;
        this._const = _const;
        this._final = _final;
        this.Type = type;
        this.value = value;

    }

}
