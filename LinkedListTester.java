import java.util.NoSuchElementException;

public class LinkedListTester{
  public static void main(String[] arg){
    System.out.println("\n====test addToFront()====");
    LinkedList<String> list = new LinkedList<String>();
    list.addToFront("C");
    list.addToFront("B");
    list.addToFront("A");

    System.out.println("test case: appending");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);
    System.out.println("test case: size increment");
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());
    System.out.println("test case: proper pointer handling");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

    System.out.println("\n====test addToRear()====");
    list = new LinkedList<String>();
    list.addToRear("A");
    list.addToRear("B");
    list.addToRear("C");

    System.out.println("test case: appending");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);

    System.out.println("test case: size increment");
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());

    System.out.println("test case: proper pointer handling");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

    System.out.println("\n====test addAfter() part 1====");
    System.out.println("general case: add to middle");
    list = new LinkedList<String>();
    list.addToRear("A");
    list.addToRear("C");
    list.addAfter("A", "B");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

    System.out.println("test case: add to empty list");
    list = new LinkedList<String>();
    try{
      System.out.println("expect:\t NoSuchElementException");
      list.addAfter("A", "B");
    }catch(NoSuchElementException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: add to nowhere");
    list = new LinkedList<String>();
    list.addToRear("A");
    list.addToRear("B");
    try{
      System.out.println("expect:\t NoSuchElementException");
      list.addAfter("C", "D");
    }catch(NoSuchElementException e){
      System.out.println("got:\t "+e.toString());
    }
    System.out.println("expect:\t AB");
    System.out.println("got:\t "+list);

    System.out.println("test case: add to rear");
    list = new LinkedList<String>();
    list.addToRear("A");
    list.addAfter("A", "B");
    System.out.println("expect:\t AB");
    System.out.println("got:\t "+list);
    System.out.println("expect:\t 2");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.last());

    System.out.println("\n====test removeFirst()====");
    System.out.println("test case: remove from empty list");
    list = new LinkedList<String>();
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.removeFirst();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the only node");
    list = new LinkedList<String>();
    list.addToRear("A");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.removeFirst());
    System.out.println("expect:\t 0");
    System.out.println("got:\t "+list.size());
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.first();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.last();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the first node");
    list = new LinkedList<String>();
    list.addToRear("A");
    list.addToRear("B");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.removeFirst());
    System.out.println("expect:\t 1");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.last());

    System.out.println("\n====test removeLast()====");
    System.out.println("test case: remove from empty list");
    list = new LinkedList<String>();
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.removeLast();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the only node");
    list = new LinkedList<String>();
    list.addToRear("A");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.removeLast());
    System.out.println("expect:\t 0");
    System.out.println("got:\t "+list.size());
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.first();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.last();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }
  }
}