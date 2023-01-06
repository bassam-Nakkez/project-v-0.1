package AST;

import java.util.List;

public abstract class Statment {
    String name ;
    int line_Number;
    String parent;
    List<String> sibling;
    List<String> child;

}
