import java.util.*;
public class guessNumber {
    private int compGuessNumber;
    private int guessingAttempts;
    boolean correctNumber;

    public guessNumber(){
        Random ran=new Random();
        compGuessNumber=ran.nextInt(100);
        guessingAttempts=0;
        correctNumber=false;
    }

    public  void guessTheNumber(int guess){
        if(guess==compGuessNumber){
            System.out.println("congratulation!! u guess the number");  
            correctNumber=true;
        }
        else if(guess>compGuessNumber){
            System.out.println("u guess the number greter than guessing number. please select lower number");
    
        }
        else{
            System.out.println("u guess the number lower than guessing number.please select greter number");
        }
        guessingAttempts++;
    }
     public boolean isCorrectGuess(){
           return correctNumber;
     }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        guessNumber num= new guessNumber();
       while(!num.isCorrectGuess()){
        System.out.println("guess the  number between 1 to 100::");
        int number=sc.nextInt();
        num.guessTheNumber(number);
       }
        

    }
}
