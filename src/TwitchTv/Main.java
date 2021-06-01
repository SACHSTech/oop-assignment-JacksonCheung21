package TwitchTv;

import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    // Created buffered Reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Initializing Variables
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
    System.out.println("Hello " + UserName +"! How old are you?");
    UserAge = Integer.parseInt(keyboard.readLine());
    Viewer User = new Viewer(UserName, UserAge, 0, 0);

    // Creating twitch object and streams to watch
    Twitch browse = new Twitch("Valorant", "Fortnite", "League of Legends", 103, 91.7, 277);

    Streamer TenZ = new Streamer ("TenZ", "Valorant", "WON NA VALORANT MASTERS!", 17.4, 1.3, 5034);

    Streamer Reverse2k = new Streamer("Reverse2k", "Fortnite", "2x FNCS Champ", 1.2, 495.5, 1056);

    Streamer loltyler1 = new Streamer("loltyler1", "League of Legends", "SHOWTIME!!", 58.2, 4.3, 20354);

    System.out.println("Welcome " +UserName+ " you've created an account, feel free to browse around!");
    System.out.println("");
    System.out.println("                             Top Games:                          ");
    System.out.println(browse); 


  }

}
