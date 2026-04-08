package org.example.Iterator;

public interface Iterator<T> {
    public Boolean hasNext();
    public T next();
    public Boolean hasPrevious();
    public T previous();
    public T getCurrent();
}
