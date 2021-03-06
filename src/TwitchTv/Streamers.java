package TwitchTv;

import java.util.*;
/**
* Class file for streamers
*
*/

public class Streamers extends User {

  // Instance variables
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

  public Streamers(String theUserName, int theUserAge, String theGame, String theStreamTitle, double theViewers, double theFollowers, int theSubscribers)
  {
    super(theUserName, theUserAge);
    this.Game = theGame;
    this.StreamTitle = theStreamTitle;
    this.Viewers = theViewers;
    this.Followers = theFollowers;
    this.Subscribers = theSubscribers;
  }

  public void addSubscriber(int Num){
    this.Subscribers += Num;
  }

  public void addFollower(int Num) {
    this.Followers += Num;
  }

  // @return # of followers
  public double getFollowers() {
    return this.Followers;
  }

  // @return # of viewrs
  public double getViewers() {
    return this.Viewers;
  }
  
  // @return # of Subscribers
  public int getSubscribers() {
    return this.Subscribers;
  }

  // @return what game streamer is playing
  public String getStreamerGame() {
    return this.Game;
  }
  
  // @return what the streamer title is 
  public String getStreamTitle() {
    return this.StreamTitle;
  }



}