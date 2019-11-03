import java.util.HashMap;
import java.util.ArrayList;

class User{
    private String name;
    private String password;
    private String role;

User(String name, String password, String role){
    this.name = name;
    this.password = password;
    this.role = role;
}

public String getPassword(){
    return this.password;
}
public String getRole(){
    return this.role;
}
public String getName(){
    return this.name;
}
}

class database{
 private static  HashMap<String,User> userData = null;
public static HashMap<String,User> myDB(){
    userData = new HashMap<String,User>();
    userData.put("Sarah", new User("Sarah", "1234", "CS"));
    userData.put("Janet",new User("Janet","1234","SCS"));
    userData.put("Jack",new User("Jack","12345","FM"));
    userData.put("Natille",new User("Natille","12","ADM"));
    userData.put("Randy",new User("Randy","123","PM"));
    userData.put("Jacob",new User("Jacob","1245","SM"));
    return userData;
}
public User checkUser(String x){
    //System.out.println("Hi");
    HashMap<String,User> db = this.myDB();
try{
   // System.out.println(db.get(x));
    return db.get(x);
}
catch(Exception e){
   // System.out.println("........"+e);
   return null;
}
}
}