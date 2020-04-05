
/**
 * Write a description of interface Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Tree<E>
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public boolean insert(E e);

    public boolean contains(E e);

    public int numOfElementsDepth(int i);

    public E findMax();

    public E findMin();

    public String preOrderString();

    public String postOrderString();

    public String inOrderString();

    public void empty();

    public boolean isEmpty();
}
