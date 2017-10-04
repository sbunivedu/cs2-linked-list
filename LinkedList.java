import java.util.NoSuchElementException;

public class LinkedList<T>{
  private int count;
  private LinearNode<T> front, rear;

  /**
   * Creates an empty list.
   */
  public LinkedList(){
    count = 0;
    front = rear = null;
  }

  /**
   * Returns a reference to the first element in this list.
   *
   * @return  a reference to the first element in this list
   * @throws  EmptyCollectionException  if the list is empty
   */
  public T first() throws EmptyCollectionException{
    if (front == null){
      throw new EmptyCollectionException("list");
    }
    return front.getElement();
  }

  /**
   * Returns a reference to the last element in this list.
   *
   * @return  a reference to the last element in this list
   * @throws  EmptyCollectionException  if the list is empty
   */
  public T last() throws EmptyCollectionException{
    if (rear == null){
      throw new EmptyCollectionException("list");
    }
    return rear.getElement();
  }

  /**
   * Returns true if the specified element is found in this list and
   * false otherwise.
   *
   * @param targetElement              the element that is sought in the list
   * @return                           true if the element is found
   * @throws EmptyCollectionException  if the list is empty
   */
  public boolean contains(T target) throws EmptyCollectionException{
    if(isEmpty()){
      throw new EmptyCollectionException("list");
    }
    LinearNode<T> trav = front;
    while (trav != null){
      if (trav.getElement().equals(target)){
        return true;
      }
      trav = trav.getNext();
    }
    return false;
  }

  /**
   * Returns true if this list contains no elements.
   *
   * @return  true if this list contains no elements
   */
  public boolean isEmpty(){
    return (count == 0);
  }

  /**
   * Returns the number of elements in this list.
   *
   * @return  the integer representation of number of elements in this list
   */
  public int size(){
    return count;
  }

  /**
   * Returns a string representation of this list.
   *
   * @return  a string representation of this list
   */
  public String toString(){
    String result = "";
    LinearNode<T> trav = front;
    while (trav != null){
      result += trav.getElement();
      trav = trav.getNext();
    }
    return result;
  }

  /**
   * Adds the specified element to the front of this list.
   *
   * @param element  the element to be added to the front of the list
   */
  public void addToFront(T element){
    LinearNode<T> node = new LinearNode<T>(element);
    node.setNext(front);
    front = node;
    // modify rear when adding to an empty list
    if (isEmpty()){
      rear = node;
    }
    count++;
  }

  /**
   * Adds the specified element to the rear of this list.
   *
   * @param element  the element to be added to the list
   */
  public void addToRear(T element){}

  /**
   * Adds the specified element after the specified target element.
   *
   * @param element  the element to be added after the target element
   * @param target   the target that the element is to be added after
   * @throws NoSuchElementException if the target is not found
   */
  public void addAfter(T target, T element) throws NoSuchElementException{}

  /**
   * Removes the first element in this list and returns a reference
   * to it.
   *
   * @return                           a reference to the first element of
   *                                   this list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T removeFirst() throws EmptyCollectionException{
    return null;
  }

  /**
   * Removes the last element in this list and returns a reference
   * to it.  Throws an EmptyListException if the list is empty.
   *
   * @return                           the last element in this list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T removeLast() throws EmptyCollectionException{
    return null;
  }

  /**
   * Removes the first instance of the specified element from this
   * list and returns a reference to it.
   *
   * @param targetElement              the element to be removed from the list
   * @return                           a reference to the removed element
   * @throws EmptyCollectionException  if an empty collection exception occurs
   * @throws NoSuchElementException    if the specified element is not found
  */
  public T remove (T element) throws EmptyCollectionException,
                                     NoSuchElementException{
    return null;
  }
}
