import java.util.Scanner;
public class lotto{
public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      int[] lottoNum = new int[6];
      int[] randomNum = new int[7];
      int displayCount;
      for (int i = 0; i < 6; i++) {
      displayCount= (i+1);
      System.out.println ("Please enter Number " + displayCount + ":");
      lottoNum[i]=sc.nextInt();    
          
        }
      for (int i =0; i < 7; i++) {      
      double tempValue = Math.random()*49;
      randomNum[i]= (int) Math.floor(tempValue);
      System.out.println(i + " = " + randomNum[i]);
          
          
          
        }
      int matchCount=0;
      for (int i = 0; i < 6; i++) {
       for (int c = 0; c < 6; c++) {
           if (lottoNum[i]==randomNum[c])
           matchCount++
           ;
           
        }
          
      }
      System.out.println("Lotto numbers matched " + matchCount);
      switch (matchCount) {
          case 3 :
          System.out.println("You have matched 3 numbers you win £10");
          break;
          case 4 :
          System.out.println("You have matched 4 numbers you win £100");
          break;
          case 5 :
          for (int i = 0; i < 6; i++) { 
          if (lottoNum[i]==randomNum[6])
          System.out.println("You have matched 5 numbers plus the bonus ball you win £100,000");
          break;
        }
         System.out.println("You have matched 5 numbers you win £10,000");
         break;
         case 6 :
         System.out.println("You have matched 6 numbers you win £1,000,000");
         break;
         default :
         System.out.println("Play agian");
        }

          
}
}
    