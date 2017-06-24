/**
 * Created by leealvis on 23/6/2017.
 */
public interface BinaryTreeInterface<T> {

    public boolean isEmpty();

    public T getRootData();

    public BinaryTreeInterface<T> getLeftSubtree();

    public BinaryTreeInterface<T> getRightSubtree();
}
