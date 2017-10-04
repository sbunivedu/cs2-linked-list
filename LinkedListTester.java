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
  }
}