package TwitchTv;

import java.util.*;

public class Viewer extends User {

  //Instance Variables
  private int Bits;
  private int ChannelPoints;
  private int MoneySpent;
  private ArrayList<Streamers> Subscribed;
  private ArrayList<Streamers> Followed;
  
  public Viewer (String theUserName, int theUserAge, int theBits, int theChannelPoints, int theMoneySpent) {
    super(theUserName, theUserAge);
    this.Bits = theBits;
    this.ChannelPoints = theChannelPoints;
    this.MoneySpent = theMoneySpent;
    Subscribed = new ArrayList<>();
    Followed = new ArrayList<>();
  }

  // @return the amount of bits 
  public int getBits() {
    return this.Bits;
  }

  // @return how much channel points 
  public int getPoints() {
    return this.ChannelPoints;
  }

  // buy bits proccess 
  public void buyBits() {
    if (this.isBuy() == true){
      this.Bits += this.MoneySpent;
      System.out.println("Purchase Sucessfull you have spent $" + this.MoneySpent + " for " + this.Bits + " bits!");
    }
    else {
      System.out.println("You are not older then 18, Purchase failed!");
    }
  }

  public void SubscribeChannel(Streamers broadcast) {
    System.out.println("You have subscribed to " + broadcast.getName());
    broadcast.addSubscriber(1);
    this.Subscribed.add(broadcast);
  }

  public void FollowChannel(Streamers broadcast) {
    System.out.println("You have followed " + broadcast.getName());
    broadcast.addFollower(1);
    this.Followed.add(broadcast);
  }

  public ArrayList<Streamers> getSubscribed() {
    return this.Subscribed;
  }

  public ArrayList<Streamers> getFollowed() {
    return this.Followed;
  }

  public int getChannelPoints() {
    return this.ChannelPoints;
  }

  public void setChannelPoints(int Num) {
    this.ChannelPoints += Num;
  }

}