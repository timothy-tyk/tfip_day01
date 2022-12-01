package myapp;

import java.io.Console;

public class Addition {
  public static void main(String[] args){
    Console cons = System.console();
    int total = 0;
    int count =0;
    String input = "";
    
    while(!input.equals("stop")){
      input = cons.readLine("Enter a number: ").toLowerCase().trim();

      if (input.equals("stop")){
      System.out.printf("The total of %d numbers is %d\n",count, total);
    }
      else{
      int num = Integer.parseInt(input);
        total+=num;
        count++;
      }
      
    }
    
    
  }
}
