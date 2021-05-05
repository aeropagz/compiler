package inter;

public class Stmt extends Node {
    public static Stmt Null = new Stmt();
    public static Stmt Enclosing = Stmt.Null; // used for break statements
    int after = 0;  // saves label after

    public Stmt() {
    }

    public void gen(int a, int b) {
    } // called with labels begin and after


}
