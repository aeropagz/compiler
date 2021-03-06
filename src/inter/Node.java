package inter;

import lexer.Lexer;

public class Node {
    static int labels = 0;
    int lexline = 0;

    Node() {
        lexline = Lexer.line;
    }

    public int newLabel() {
        return ++labels;
    }

    public void emitLabel(int i) {
        System.out.print("L" + i + ":");
    }

    public void emit(String s) {
        System.out.println("\t" + s);
    }

    void error(String s) {
        throw new Error("near line " + lexline + ": " + s);
    }

}
