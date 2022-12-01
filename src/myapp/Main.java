// The name of the package
package myapp;

//imports

//class definitions, class name must be name of file (eg. Main)
public class Main{

  //Entry Point
  public static void main(String[] args){
    System.out.println("Hello, World");
    System.out.println("foobar");
  }
}

// TO COMPILE
//  javac -sourcepath src -d classes src/myapp/*

// TO USE JVM
// java -cp classes myapp.Main (<-- fully qualified class name)

//Written on today