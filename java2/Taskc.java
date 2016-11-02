import java.util.Scanner;
public class Taskc
{
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 String Word=null;
System.out.println("enter a word");
Word= sc.nextLine();
if(Word.isEmpty()) {
System.out.println("Nothing was entered. Please try again");
} 
String str=sc.nextLine();
int count=0;
int num=0;
for (int i = 0; i < str.length(); i++)
 {
  char c = str.charAt(i);
  if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
  {
  count++;
  }
   else
   {
    num++;
}
  }
  System.out.println("There is" + " " + count + " " + "vowels and"+num+"  consonant");
}
}