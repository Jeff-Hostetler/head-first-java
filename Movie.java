class Movie {
  String title;
  String genre;
  int rating;

  void playIt() {
    System.out.println("Playing the movie");
  }
}

class MovieTestDrive {
  public static void main(String[] args){
    Movie one = new Movie();
    one.title = "Gone with the Stock";
    one.genre = "Tragic";
    one.rating = -1;
    Movie two = new Movie();
    two.title = "Lost in Space";
    two.genre = "Rom com";
    two.rating = 5;
    two.playIt();
    Movie three = new Movie();
    three.title = "Emps new groove";
    three.genre = "best";
    three.rating = 100;

  }
}
