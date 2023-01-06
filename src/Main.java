import AST.IntNumber;
import alter.DartLexer;
import alter.DartParser;
import alter.Visitor.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException
    {
//        String fileSource = "Files/test.txt";
//        CharStream charStream = fromFileName(fileSource);
//        DartLexer lex = new DartLexer(charStream);
//        CommonTokenStream tokens = new CommonTokenStream( lex);
//        DartParser parser = new DartParser(tokens);
//        ParseTree ast = parser.parse();
//        MyVisitor myVisitor = new MyVisitor();
//        IntNumber in = (IntNumber) myVisitor.visit(ast);
//        System.out.println( in);



        String str = null ;

        System.out.println(str);
    }



}