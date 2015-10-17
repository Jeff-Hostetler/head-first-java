public class BattleShipTestDrive {
  public static void main (String[] args) {
    BattleShip ship = new BattleShip();
    int [] locations = {2,3,4};
    ship.setLocationCells(locations);
    String userGuess = '2';
    String result = ship.checkYourself(userGuess);
    String testResult = "failed";
    if(result.equals("hit")) {
      testResult = "passed";
    }
    System.out.println(testResult);
  }
}

class BattleShip {
  
}
