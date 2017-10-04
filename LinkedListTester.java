import java.util.NoSuchElementException;

public class LinkedListTester{
  public static void main(String[] arg){
    LinkedList<String> list = new LinkedList<String>();
    System.out.println("\n====test addToFront()====");
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
  }
}