package myapp.ver1;

public class Todo {
  public static void main(String[] args){
    //Create an array of 3 string elements
    String[] tasks = new String[5];
    tasks[0] = "running";
    tasks[1] = "eating";
    tasks[2] = "sleeping";
    tasks[3] = "cooking";
    tasks[4] = "showering";

    // System.out.println(tasks);
    // System.out.println(tasks[1]);
    // System.out.println(tasks.length);

    //Use while loop to print out
    int i = 0;
    while (i<tasks.length){
      System.out.printf("%d: %s\n",i+1,tasks[i]);
      i++;
    }
  }
}
