public class GuessGame {
  Player p1;
  Player p2;
  Player p3;

  public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();
    //create three Player objects and assign to instance variables
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;
    //three variables to hold the guess
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;
    //answer regarding guesses
    int targetNumber = (int) (Math.random() * 10);
    // make a random target number
    System.out.println("I'm think of a number from 0..9");

    while(true){
      System.out.println("Number to guess is " + targetNumber);

      p1.guess();
      p2.guess();
      p3.guess();

      guessp1 = p1.number;
      System.out.println("Player one guessed " + guessp1);
      guessp2 = p2.number;
      System.out.println("Player one guessed " + guessp2);
      guessp3 = p3.number;
      System.out.println("Player one guessed " + guessp3);

      if (guessp1 == targetNumber){
        p1isRight = true;
      }
      if (guessp2 == targetNumber){
        p2isRight = true;
      }
      if (guessp3 == targetNumber){
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("We have a winner");
        System.out.println("Player one got it right? " + p1isRight);
        System.out.println("Player one got it right?  "+ p2isRight);
        System.out.println("Player one got it right?  "+ p3isRight);
        break;
      } else {
        System.out.println("You will have to try again");
      }
    }
  }
}
