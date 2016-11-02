import java.util.Scanner;
public class test2
{   public static void main(String [] args)
       {
    int wordCount = 0;
    String Saying=null;
     Scanner sc=new Scanner (System.in);
     System.out.println("please enter saying");
     Saying=sc.nextLine();

    boolean word = false;
    int endOfLine = Saying.length() - 1;

    for (int i = 0; i < Saying.length(); i++) {
        
        if (Character.isLetter(Saying.charAt(i)) && i != endOfLine) {
            word = true;
           
        } else if (!Character.isLetter(Saying.charAt(i)) && word) {
            wordCount++;
            word = false;
        
        } else if (Character.isLetter(Saying.charAt(i)) && i == endOfLine) {
            wordCount++;
        }
    }
    System.out.println(wordCount);
} 
}

