package e2_e3;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}