package TwitchTv;

public class Twitch {

// Instance variables
private String PopularGame1;
private String PopularGame2;
private String PopularGame3;
private int ViewersGame1;
private double ViewersGame2;
private int ViewersGame3;

public Twitch(String thePopularGame1, String thePopularGame2, String thePopularGame3, int theViewers1, double theViewers2, int theViewers3) {

  PopularGame1 = thePopularGame1;
  PopularGame2 = thePopularGame2;
  PopularGame3 = thePopularGame3;
  ViewersGame1 = theViewers1;
  ViewersGame2 = theViewers2;
  ViewersGame3 = theViewers3;

}

public String toString() {
  return PopularGame1 + ": " + ViewersGame1 + "K  |  "  + PopularGame2 + ": " + ViewersGame2 + "K  |  " + PopularGame3 + ": " + ViewersGame3 + "K";
}


}