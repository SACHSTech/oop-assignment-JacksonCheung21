package TwitchTv;
import java.util.*;

public class Twitch {

// Instance variables
private String PopularGame1;
private String PopularGame2;
private String PopularGame3;
private int ViewersGame1;
private double ViewersGame2;
private int ViewersGame3;
private ArrayList<Streamers> Brodcasters;
private ArrayList<Streamers> LiveStreamers;

public Twitch(String thePopularGame1, String thePopularGame2, String thePopularGame3, int theViewers1, double theViewers2, int theViewers3) {

  this.PopularGame1 = thePopularGame1;
  this.PopularGame2 = thePopularGame2;
  this.PopularGame3 = thePopularGame3;
  this.ViewersGame1 = theViewers1;
  this.ViewersGame2 = theViewers2;
  this.ViewersGame3 = theViewers3;
  this.Brodcasters = new ArrayList<>();
  this.LiveStreamers = new ArrayList<>();

}

public String toString() {
  return this.PopularGame1 + ": " + this.ViewersGame1 + "K  |  "  + this.PopularGame2 + ": " + this.ViewersGame2 + "K  |  " + this.PopularGame3 + ": " + this.ViewersGame3 + "K";
}

public void addStreamer(Streamers brodcast) {
  this.Brodcasters.add(brodcast);
}

public void addLiveStreamer(Streamers brodcast) {
  this.LiveStreamers.add(brodcast);
}

public ArrayList<Streamers> getLiveStreamers(){
  return this.LiveStreamers;
}

public ArrayList<Streamers> getAllStreamers() {
  return this.Brodcasters;
}

}