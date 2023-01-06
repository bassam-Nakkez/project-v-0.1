package AST;

import java.util.ArrayList;
import java.util.List;

public class Node {

    String nodeName;
    int lineNumber;
    int childCount;
    var node_value;
    Object parent;
    List<Object> sibling = new ArrayList<>();
    Object leftMostChild;



}
