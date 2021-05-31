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

  










}






}
