/**
 * Created by leealvis on 20/6/2017.
 */
public interface PriorityQueueInterface<T> {

    public boolean isEmpty();

    public void add(T element) throws PriorityQueueException;

    public T getMin();

    public T removeMin();

    public int getSize();
}
