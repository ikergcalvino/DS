package e2_e3;

public interface Iterator<T> {
    boolean hasNext();
    E next();
    void remove();
}