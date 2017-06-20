/**
 * Created by leealvis on 20/6/2017.
 */
public class PriorityQueue<T extends Comparable<T>> implements PriorityQueueInterface<T> {

    private static final int MAX_SIZE = 100;
    private T[] items;
    private int size;

    public PriorityQueue() {
        items = (T[]) new Comparable[MAX_SIZE + 1];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(T element) throws PriorityQueueException {
        if (size < MAX_SIZE) {
            int currentIndex = ++size;
            int parentIndex = currentIndex / 2;
            while (parentIndex > 0 && element.compareTo(items[parentIndex]) < 0) {
                items[currentIndex] = items[parentIndex];
                currentIndex = parentIndex;
                parentIndex = currentIndex / 2;
            }
            items[currentIndex] = element;
        } else {
            throw new PriorityQueueException("Add()");
        }
    }

    @Override
    public T getMin() {
        T item = null;
        if (!isEmpty()) {
            item = items[1];
        }
        return item;
    }

    @Override
    public T removeMin() {
        T item = getMin();
        if (item != null) {
            items[1] = items[size];
            items[size] = null;
            --size;
            reHeap(1);
        }
        return item;
    }

    private void reHeap(int node) {
        assert node >= 1 : "reHeap()";
        T item = items[node];
        int smallerChildIndex = 2 * node;
        int rightChildIndex = 2 * node + 1;
        if (rightChildIndex <= size && items[rightChildIndex].compareTo(items[smallerChildIndex]) < 0) {
            smallerChildIndex = rightChildIndex;
        }
        if (smallerChildIndex > size || item.compareTo(items[smallerChildIndex]) < 0) {
            return;
        } else {
            items[node] = items[smallerChildIndex];
            items[smallerChildIndex] = item;
            reHeap(smallerChildIndex);
        }
    }

    @Override
    public int getSize() {
        return size;
    }
}
