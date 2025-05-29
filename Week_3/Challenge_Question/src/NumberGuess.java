import java.util.Scanner;

 class NumberGuess {

     int random;

     NumberGuess(){
         random=(int)Math.ceil(Math.random()*100);
     }

     /**
      *
      *
      * @param guessNumber the number is the player guess
      * @return
      *  -neg if the number is smaller
      *  - 0 if the number is guess correct
      *  - positive if the guess number is high
      */
     int guess(int guessNumber){
         return guessNumber-random;
     }


    public static void main(String[] args) {
        System.out.println("Number guessing game");

        Scanner input = new Scanner(System.in);
        NumberGuess game =new NumberGuess();

        int guessNum;
        int result;
        do {
            System.out.print("Guess the Number between 1-100 : ");
            guessNum =input.nextInt();
            result =game.guess(guessNum);
            if(result ==0){
                System.out.println("Wow......your guess is correct");
            }
            else if (result<0){
                System.out.println("You have guessed the small number ");
            }
            else {
                System.out.println("You have guess the highest number ");
            }

        }
        while (result!=0);
    }
}
