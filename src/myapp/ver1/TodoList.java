package myapp.ver1;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class TodoList {
  public static void main(String[] args){
    // create list of numbers
    List<Integer> listOfInt = new LinkedList<>();
    // get console
    Console cons = System.console();
    String item = "";
    while(true){
      item = cons.readLine("Please enter a number: ");
      item=item.trim();
      if(item.equals("stop")) break;

      //Add integer to list
      listOfInt.add(Integer.parseInt(item));
    }
    System.out.printf("Number of elements in the list = %d\n",listOfInt.size());
    for (int i=0;i<listOfInt.size();i++){
      // .get(i)
      System.out.printf("%d: %d\n", i+1,listOfInt.get(i));
    }
  }
  
}
