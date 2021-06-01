package TwitchTv;

/**
* Class file for streamers
*
*/

public class Streamer {

  // Instance variables
  private String StreamerName;
  private double Followers;
  private int Subscribers;
  private double Viewers;
  private String Game;
  private String StreamTitle;
  
  
  /**
  * Constructor - creates new instance of a streamer object
  *
  * @param StreamerName = the streamers name
  * @param Game = what game is being played
  * @param StreamTitle = the streamers title
  * @param Followers = the amount of followers
  * @param Subscribers = the amount of subscribers
  */

  public Streamer(String theStreamerName, String theGame, String theStreamTitle, double theViewers, double theFollowers, int theSubscribers)
  {
    StreamerName = theStreamerName;
    Game = theGame;
    StreamTitle = theStreamTitle;
    Viewers = theViewers;
    Followers = theFollowers;
    Subscribers = theSubscribers;
  }


}