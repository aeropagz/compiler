package symbols;

import lexer.Tag;

public class Array extends Type {
    public Type of;
    public int size;

    public Array(int size, Type p) {
        super("[]", Tag.INDEX, size * p.width);
        this.size = size;
        this.of = p;
    }

    public String toString() {
        return "[" + size + "]" + of.toString();
    }
}
