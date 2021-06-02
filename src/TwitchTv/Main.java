package TwitchTv;

import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    // Created buffered Reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Initializing Variables
    int OptionMenu;
    int StreamerOption;
    String Name;
    int Age;
    boolean UserBrowsing;
    UserBrowsing = true;
    int Random;
    int Random2;
    int CreditCard;
    int MoneySpent;
    MoneySpent = 0;
    String strOptionMenu;

    // Welcoming new user and prompting twitch logo
    System.out.println("                                       ");
    System.out.println("            Welcome to Twitch!         ");
    System.out.println("                                       ");
    System.out.println("       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("     @@@@***************************@@@");
    System.out.println("   @@@@@@,                          @@@");
    System.out.println("  @@@@@@@,                          @@@");
    System.out.println("  @@@@@@@,          |||    |||      @@@");
    System.out.println("  @@@@@@@,          |||    |||      @@@");
    System.out.println("  @@@@@@@,          |||    |||      @@@");
    System.out.println("  @@@@@@@,                          @@@");
    System.out.println("  @@@@@@@,                         @@@@");
    System.out.println("  @@@@@@@,                       @@@@@@");
    System.out.println("  @@@@@@@/////////        ///@@@@@@@@@@");
    System.out.println("  @@@@@@@/////////     //////@@@@@@@@@@");
    System.out.println("  @@@@@@@/////////   ////////@@@@@@@@@@");
    System.out.println("  @@@@@@@///////// //////////@@@@@@@@@@");
    System.out.println("  @@@@@@@////////////////////@@@@@@@@@@");
    System.out.println("                                       ");
    System.out.println("                                       ");

    // Getting user info to create account
    System.out.println("Let's get started with creating a new account!");
    System.out.println("Enter your Username:");
    Name = keyboard.readLine();
    System.out.println("Hello " + Name +"! How old are you?");
    Age = Integer.parseInt(keyboard.readLine());
    Viewer GuestUser = new Viewer(Name, Age, 0, 0, MoneySpent);

    // Creating twitch object and streams to watch
    Twitch TwitchPage = new Twitch("Valorant", "Fortnite", "League of Legends", 103, 91.7, 277);
    Streamers TenZ = new Streamers ("TenZ", 20, "Valorant", "WON NA VALORANT MASTERS!", 17.4, 1.3, 5034);
    Streamers Reverse2k = new Streamers("Reverse2k", 20, "Fortnite", "2x FNCS Champ", 1.2, 495.5, 1056);
    Streamers loltyler1 = new Streamers("loltyler1", 25, "League of Legends", "SHOWTIME!!", 58.2, 4.3, 20354);
    TwitchPage.addStreamer(TenZ);
    TwitchPage.addStreamer(Reverse2k);
    TwitchPage.addStreamer(loltyler1);


    System.out.println("Welcome " +Name+ " you've created an account, here are the top games!");
    System.out.println("");
    System.out.println("                           Top Games:                          ");
    System.out.println(TwitchPage); 
    System.out.println("");

    while (UserBrowsing) {
      
      TwitchPage.getLiveStreamers().clear();
      Random = 0;
      Random2 = 0;
   
      while (Random == Random2) {
        Random =  (int)(Math.random() * 3 + 0);
        Random2 = (int)(Math.random() * 3 + 0);
      }
      
      TwitchPage.addLiveStreamer(TwitchPage.getAllStreamers().get(Random));
      TwitchPage.addLiveStreamer(TwitchPage.getAllStreamers().get(Random2));
      System.out.println("");
      System.out.println("Select a streamer you want to watch by typing the number");
      for (int i = 0; i < TwitchPage.getLiveStreamers().size(); i++) {

        System.out.println(i + 1 + "." + TwitchPage.getLiveStreamers().get(i).getName());

      }
    
      StreamerOption = Integer.parseInt(keyboard.readLine());
      Streamers current = TwitchPage.getLiveStreamers().get(StreamerOption -1); 
  
      System.out.println("You are now watching " + current.getName() + " play: " + current.getStreamerGame());
      System.out.println(" _________________________________________________ ");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|                                                 |");
      System.out.println("|_________________________________________________| ");
      System.out.println(" " + current.getStreamTitle());
      System.out.println("");
      System.out.println("Age: " + current.getAge());
      System.out.println("Viewrs: " + current.getViewers() + "K");
      System.out.println("Subscribers: " + current.getSubscribers());
      System.out.println("");
     
   
      strOptionMenu ="";

      while (strOptionMenu != "quit") {

        System.out.println("What do you want to do? (Type the Number beside it)");
        System.out.println("1. Subscribe");
        System.out.println("2. Follow");
        System.out.println("3. Buy Bits");
        System.out.println("4. Leave");
        OptionMenu = Integer.parseInt(keyboard.readLine());

        if (OptionMenu == 1){
          System.out.println("");
          GuestUser.SubscribeChannel(TwitchPage.getLiveStreamers().get(StreamerOption -1));
          System.out.println("");
        }

        else if(OptionMenu == 2) {
          System.out.println("");
          GuestUser.FollowChannel(TwitchPage.getLiveStreamers().get(StreamerOption -1));
          System.out.println("");
        }

        else if (OptionMenu == 3) {

          System.out.println("How much bits do you want to buy? ($1 = 1 bit)");
          MoneySpent = Integer.parseInt(keyboard.readLine());
          System.out.println("Enter your Credit Card Number:");
          CreditCard = Integer.parseInt(keyboard.readLine());
          Viewer GuestUser1 = new Viewer(Name, Age, 0, 0, MoneySpent);
          System.out.println("");
          GuestUser1.buyBits();
          System.out.println("");
        }

        else if (OptionMenu == 4) {
          System.out.println("Do you want to leave Twitch as well? (Enter the number beside it");
          System.out.println("1. Yes");
          System.out.println("2. No");
          OptionMenu = Integer.parseInt(keyboard.readLine());
          if (OptionMenu == 1) {
            UserBrowsing = false;
           
          }
        strOptionMenu = "quit";
        }

      }

      Random = (int)(Math.random() * 50 +1);
      System.out.println("You got " + Random + " channel points for watching " +current.getName()+ "stream!");
      GuestUser.setChannelPoints(Random);
      System.out.println("");
      
    }
  
    System.out.println("                                       ");
    System.out.println("            Thanks for watching!       ");
    System.out.println("                                       ");
    System.out.println("       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("     @@@@***************************@@@");
    System.out.println("   @@@@@@,                          @@@");
    System.out.println("  @@@@@@@,                          @@@");
    System.out.println("  @@@@@@@,          |||    |||      @@@");
    System.out.println("  @@@@@@@,          |||    |||      @@@");
    System.out.println("  @@@@@@@,          |||    |||      @@@");
    System.out.println("  @@@@@@@,                          @@@");
    System.out.println("  @@@@@@@,                         @@@@");
    System.out.println("  @@@@@@@,                       @@@@@@");
    System.out.println("  @@@@@@@/////////        ///@@@@@@@@@@");
    System.out.println("  @@@@@@@/////////     //////@@@@@@@@@@");
    System.out.println("  @@@@@@@/////////   ////////@@@@@@@@@@");
    System.out.println("  @@@@@@@///////// //////////@@@@@@@@@@");
    System.out.println("  @@@@@@@////////////////////@@@@@@@@@@");
    System.out.println("                                       ");
    System.out.println("              Have a nice day!         ");


  }

}