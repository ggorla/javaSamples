package DS.BasicStack;

public interface Stack<x> {
    void push(x item);
    x pop();
    boolean contains(x item);
    x access(x item);
}
