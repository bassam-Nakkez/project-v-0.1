package AST;

import java.util.ArrayList;
import java.util.List;

public class Block {


    List<Statment> statments;

    Block() {
        this.statments = new ArrayList<Statment>();

    }

    public void addStatment(Statment stat) {
        this.statments.add(stat);
    }


}

