package TwitchTv;

public class User {

//Instance Variables 
private String Name;
private int Age;
/**
* Constructor - creates new instance for user object
* @param UserName = the name of the user
* @param = age of the user
* @param = age of the user
*/

public User(String theUserName, int theUserAge) {
  this.Name = theUserName;
  this.Age = theUserAge;
}


public String getName() {
  return this.Name;
}

public int getAge() {
  return this.Age;
}


public boolean isBuy() {

  if (this.Age >= 18) {
    return true;
  }

  else{
    return false; 
  }


}








}