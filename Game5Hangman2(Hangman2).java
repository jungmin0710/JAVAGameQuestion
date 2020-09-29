import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman
{
  String[] words  = {"influenza", 
                     "fever",
                     "cancer",
                     "poison",
                     "victim",
                     "physician",
                     "clinic",
                     "symptom",
                     "medicine",
                     "drug",
                     "hygiene"};
  String[] meaning= {"독감",
                     "열",
                     "암",
                     "독",
                     "환자",
                     "내과의사",
                     "진료소",
                     "징후",
                     "의학",
                     "약",
                     "위생학"};

  public Hangman2() throws IOException
  {
    Random r= new Random();
    int randomNum= Math.abs(r.nextInt() % words.length);

    hiddenString= words[randomNum];

    System.out.println("\n의미: "+ meaning[randomNum]);
  }

  public char readChar() throws IOException
  {
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    String user;

    do{
      System.out.print("1 문자를 입력하세요(힌트를 원하면 ? 입력): ");
      user= in.readLine();

      if(user.charAt(0)=='?'){
        boolean givehint= false;
        int i=0;
        while(!givehint){
          if(outputString.charAt(i)=='-'){
            System.out.println();
            System.out.println("힌트: "+ hiddenString.charAt(i));
            System.out.println();
            failed++;
            givehint= true;
          }
          i++;
        }
      }
    }while(user.charAt(0)=='?');

    return user.charAt(0);
  }
}
