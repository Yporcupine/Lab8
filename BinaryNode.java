
/**
* Write a description of class BinaryNode here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class BinaryNode<T>
{
  // instance variables - replace the example below with your own
  T element;
  BinaryNode<T> left;
  BinaryNode<T> right;
  /**
  * Constructor for objects of class BinaryNode
  */

  public BinaryNode()
  {
    this(null, null, null);
  }
  public BinaryNode(T theElement)
  {
    this( theElement, null, null );
  }

  public BinaryNode( T theElement, BinaryNode<T> lt, BinaryNode<T> rt )
  {
    element = theElement;
    left    = lt;
    right   = rt;
  }
}
