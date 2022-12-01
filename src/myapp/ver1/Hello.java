package myapp.ver1;

import java.io.Console;

public class Hello {
  public static void main(String[] args){
    //Get System Console
    Console cons = System.console();
    //Read from the console, the result is assigned to a variable
    String name = "";
    while(name.trim().length()<=0){
      name = cons.readLine("What is your name?");
    }
    // String name = cons.readLine("What is your name?").trim();
    // if(name.length()==0){
    //   System.out.println("Please enter your name!");
    // }
    // name.isEmpty()
    
    if(name.equals("fred")){
      System.out.println("Yabadabadoo!\n");
    }

    else if(name.equals("barney")){
      System.out.println("Hello Barney!");
    }
    
    else{
      // Send a greeting to the person with a formatted string
    System.out.printf("Hello %s.\n\tNice to meet you \n",name.toUpperCase());
    }

    
  }
}

//javac -sourcepath src -d classes src/myapp/ver1/*.java
//java -cp classes myapp/ver1.Hello
