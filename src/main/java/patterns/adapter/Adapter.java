package patterns.adapter;

/**
 * przykład w języku Java
 */

/* klasa użytkownika powinna tworzyć obiekty adaptera */
/* przy użyciu referencji tego typu */
interface Stack<T>
{
    void push (T o);
    T pop ();
    T top ();
}

/* klasa adaptowana */
class DList<T>
{
    public void insert (Integer pos, T o) {}
    public void remove (Integer pos) { }

    public void insertHead (T o) { }
    public void insertTail (T o) { }

    public T removeHead () { }
    public T removeTail () { }

    public T getHead () {  }
    public T getTail () {  }
}

/* adaptuj klasę DList opakowując ją w interfejs Stack */
public class Adapter<T> extends DList<T> implements Stack<T>
{
    public void push (T o) {
        insertTail (o);
    }

    public T pop () {
        return removeTail ();
    }

    public T top () {
        return getTail ();
    }
}
