package TwitchTv;
import java.util.*;
import java.io.*;

public class Main {

public static void main(String[] args) throws IOException {

  // Created buffered Reader
  BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

  //Initializing Variables
  String OptionMenu;
  String UserName;
  int UserAge;
  
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
  System.out.println("  @@@@@@@////////////////////@@@@@@@@@@");
  System.out.println("                                       ");
  System.out.println("                                       ");

  // Getting user info to create account
  System.out.println("Let's get started with creating a new account!");
  System.out.println("Enter your Username:");
  UserName = keyboard.readLine();
  System.out.println("Hello " + UserName + "! How old are you?");
  UserAge = Integer.parseInt(keyboard.readLine());
  Viewer User = new Viewer(Username,UserAge,0,0);

  //Creating twitch object and streams to watch
  Twitch populargames = new Twitch ("Valorant","Fortnite", "League of Legends", 103, 91.7, 277);

  //streamers by Name,followers,subscribers,viewers, game, stream title (just for reminder after) 
  Streamer TenZ = new Streamer ("Tenz",1.3,5034,17.4,"Valorant", "WON NA VALORANT MASTERS");
  Streamer Reverse2K = new Streamer ("Reverse2k",495,1056,1.2,"Fortnite","2x FNCS Champ.");
  Streamer loltyler1 = new Streamer ("loltyler1",4.3,20354,58.2, "League of Legends", "SHOWTIME!! THE JOBS GETTED DONE TODAYS!!!");












}






}
