
/**
* Abstract class BinaryTree - write a description of the class here
*
* @author (your name here)
* @version (version number or date here)
*/
public abstract class BinaryTree<E> implements Tree<E>
{
  // instance variables - replace the example below with your own
  BinaryNode<E> root;
  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */

  public String preOrderString(){
    return preOrderTraversal(root);
  }
  private String preOrderTraversal(BinaryNode node){
    if (node == null) return null;
    else{
      return node.toString() + " " + preOrderTraversal(node.left) + " " + preOrderTraversal(node.right);
    }
  }

  public String postOrderString(){
    return postOrderTraversal(root);
  }
  private String postOrderTraversal(BinaryNode node){
    if (node == null) return null;
    else{
      return postOrderTraversal(node.left) + " " + postOrderTraversal(node.right) + " " + node.toString();
    }
  }

  public String inOrderString(){
    return inOrderTraversal(root);
  }
  private String inOrderTraversal(BinaryNode node){
    if (node == null) return null;
    else{
      return inOrderTraversal(node.left) + " " + node.toString() + " " + inOrderTraversal(node.right);
    }
  }

  public int numOfElementsDepth(int i){

  }

  public void empty(){
    root = null;
  }

  public boolean isEmpty(){
    if(root == null) return true;
    else return false;
  }

  public abstract boolean insert(E e);

  public abstract boolean contains(E e);

  public abstract E findMax();

  public abstract E findMin();

}
