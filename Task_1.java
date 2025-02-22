import java.util.Scanner;
import java.util.Random;

public class Task_1{
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        String Play ="y";
        
        while(Play.equals ("y")){
            Random number = new Random();
            int RandomNumber = number.nextInt(100);
            int GuessedNumber = -1;
            int count = 1;
            while(GuessedNumber != RandomNumber){
                System.out.println("Guess Number Between 1 to 100: ");
                GuessedNumber = reader.nextInt();
                count++;
                if(GuessedNumber == RandomNumber){
                    System.out.println("You Guessed Right Number:" + RandomNumber +"  in no"+ count +" time" );
                    System.out.println("Would you like to Play again? Y/N: ");
                    Play = reader.next().toLowerCase();
                }else if(GuessedNumber > RandomNumber){
                    System.out.println("You Guess Number is to Huge,try again ");
                }else{
                    System.out.println("You Guess Number is to Low,try again ");
                }
            }
        }

    }
}
